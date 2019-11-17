package app.naklab.assu.android.kotlinfontmaker.repository

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import app.naklab.assu.android.kotlinfontmaker.R
import java.io.BufferedInputStream
import java.io.ByteArrayOutputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.util.HashMap

class ImageRepository {
    private var fontCacheUri: HashMap<String, Uri>
    private val context: Context

    constructor(context: Context) {
        fontCacheUri = HashMap()
        this.context = context
    }
    fun saveImageBitmap(bmp: Bitmap, fontName: String, uId: String) {
        try {
            val fileKey = fontName + uId
            val byteArrOutputStream = ByteArrayOutputStream()
            val fileOutputStream = context.openFileOutput(fileKey, Context.MODE_PRIVATE)
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, byteArrOutputStream)
            fileOutputStream.write(byteArrOutputStream.toByteArray())
            fileOutputStream.close()
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        } catch (e: IOException) {

        }

    }

    fun loadImageBitmap(fontName: String, uId: String): Bitmap {

        try {
            val fileKey = fontName + uId
            val bufferedInputStream = BufferedInputStream(context.openFileInput(fileKey))
            return BitmapFactory.decodeStream(bufferedInputStream)
        } catch (e: FileNotFoundException) {
            return BitmapFactory.decodeResource(context.resources, R.drawable.background_white)
        }

    }
}