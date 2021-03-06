package app.naklab.assu.android.kotlinfontmaker

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.graphics.drawable.toBitmap
import app.naklab.assu.android.kotlinfontmaker.repository.FontRepository
import app.naklab.assu.android.kotlinfontmaker.repository.ImageRepository
import app.naklab.assu.android.kotlinfontmaker.services.FontMaker
import app.naklab.assu.android.kotlinfontmaker.services.Svg2TtfConverter
import app.naklab.assu.android.kotlinfontmaker.view.FontCanvasView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_font_maker.*
import kotlinx.android.synthetic.main.activity_main.*
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {

    internal lateinit var imageRepository: ImageRepository

    internal lateinit var fontRepository: FontRepository
    internal var currentUId: String =""

    internal var fontName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_font_maker)

        fontName = "only font"

        editTextFontName.setText(fontName)

        fontRepository = FontRepository(this)
        // 画像の保存・読み込みを行うために必要なプログラム
        imageRepository = ImageRepository(this)

        // Android 6, API 23以上でパーミッシンの確認
        if (Build.VERSION.SDK_INT >= 23) {
            checkPermission()
        } else {

        }

        OpenCVLoader.initDebug()
        if(OpenCVLoader.initDebug()){
            Log.i("OpenCV", "Ok");
        }

        // OpenCV をアプリで使うために必要
        if (!OpenCVLoader.initDebug()) {
            Log.i("OpenCV", "Failed")
        } else {
            Log.i("OpenCV", "successfully built !")
        }

        initViews()

//        currentUId = FontMaker.getUId(spinner_font_menu.selectedItemPosition)
        currentUId = FontMaker.getUId(0)

        mainFontCanvas.background =
            BitmapDrawable(imageRepository.loadImageBitmap(fontName, currentUId))
    }

    private fun initViews() {
        // init views
        // init click listeners
        buttonClear.setOnClickListener { clearFontCanvas() }
        buttonUndo.setOnClickListener { mainFontCanvas.undo() }
        buttonRedo.setOnClickListener { mainFontCanvas.redo() }
//        button_make.setOnClickListener { makeFont() }
        buttonConvert.setOnClickListener {
            makeFont()

            Snackbar.make(
                buttonConvert, "変換を開始します",
                Snackbar.LENGTH_SHORT
            ).show()
            val cloudConvert = makeConverter()
            cloudConvert.convert(FontRepository.TMP_FILE_PATH, fontName)
        }
//        spinner_font_menu.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
//                onFontItemSelected(i)
//            }
//
//            override fun onNothingSelected(adapterView: AdapterView<*>) {
//
//            }
//        }

        // 書いた情報を取得するために DrawingCache を有効にしておく
        mainFontCanvas.isDrawingCacheEnabled = true

        // スピナーの要素を選んだ時の処理が初回起動時に動かないようにする
//        spinner_font_menu.isFocusable = false

        initTabLayout()

    }

    private fun initTabLayout() {
        val fontArray = resources.getStringArray(R.array.string_array_font_menu)
        for (f in fontArray) {
            val tab = tablayoutFonts.newTab().setText(f)
            tablayoutFonts.addTab(tab)
        }

        tablayoutFonts.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                onFontItemSelected(tablayoutFonts.getSelectedTabPosition())
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }

    private fun onFontItemSelected(position: Int) {
        // スピナーの要素を選んだ時の処理が初回起動時に動かないようにする
//        if (!spinner_font_menu.isFocusable) {
//            spinner_font_menu.isFocusable = true
//            return
//        }

        // 何から何に変更されたのかを通知する（別になくてもいい）
//        Snackbar.make(
//            spinner_font_menu,
//            "[ " + spinner_font_menu.selectedItem.toString() + " ] " + currentUId + "→" + FontMaker.getUId(
//                position
//            ),
//            Snackbar.LENGTH_SHORT
//        ).show()

        var bmp = mainFontCanvas.drawingCache
        // FontMaker の方で font-svg ファイルへ定義する vert-adv-y を 1000 としているので Bitmap のサイズも 1000 にリサイズする
        bmp = Bitmap.createScaledBitmap(bmp, 1000, 1000, false)
        imageRepository.saveImageBitmap(bmp ?: mainFontCanvas.background.toBitmap(), fontName, currentUId)

        clearFontCanvas()
        currentUId = FontMaker.getUId(position)
        mainFontCanvas.background =
            BitmapDrawable(imageRepository.loadImageBitmap(fontName, currentUId))

        //TODO FIX 再帰呼び出しにならない？？
//        spinner_font_menu.setSelection(position)
        tablayoutFonts.getTabAt(position)!!.select()
        textViewSampleChar.text = tablayoutFonts.getTabAt(position)?.text
    }

    private fun clearFontCanvas() {
        mainFontCanvas.destroyDrawingCache()
        mainFontCanvas.clear()
        mainFontCanvas.setBackgroundResource(R.drawable.background_white)
    }

    private fun makeFont() {
        val maker = FontMaker()
        for (i in 0 until FontMaker.getApplyedFontSize() + 1) {
            val fontId = FontMaker.getUId(i)
            val bmp = imageRepository.loadImageBitmap(fontName, fontId)
            maker.addGlyph(bmp, fontId)
        }

        // これが目的の svg string
        val svg = maker.makeFontSvg(fontName)
        fontRepository.writeSvg(svg)

        Snackbar.make(
            buttonConvert, "書き出しが完了しました",
            Snackbar.LENGTH_SHORT
        ).show()
    }


    // permissionの確認
    fun checkPermission() {
        // 既に許可している
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        ) {
//            fontRepository.copyAssetsFile()
        } else {
            requestLocationPermission()
        }// 拒否していた場合
    }

    private val REQUEST_PERMISSION = 1000
    // 許可を求める
    private fun requestLocationPermission() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
        ) {
            ActivityCompat.requestPermissions(
                this@MainActivity,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                REQUEST_PERMISSION
            )
        } else {
            val toast = Toast.makeText(this, "許可してください", Toast.LENGTH_SHORT)
            toast.show()

            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),
                REQUEST_PERMISSION
            )
        }
    }
    private fun makeConverter(): Svg2TtfConverter {
        val cloudConvert = Svg2TtfConverter()
        cloudConvert.setListener(object : Svg2TtfConverter.OnConvertListener {
            override fun onConvertComplete() {
                Snackbar.make(
                    buttonConvert, "フォントファイルを書き出しました",
                    Snackbar.LENGTH_SHORT
                ).show()
            }

            override fun onConvertFailure() {
                Snackbar.make(
                    buttonConvert, "失敗しました",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        })
        return cloudConvert
    }
}
