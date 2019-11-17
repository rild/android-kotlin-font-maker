package app.naklab.assu.android.kotlinfontmaker.repository

import android.content.Context
import android.os.Environment
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class FontRepository {

    companion object {
        // ファイルセパレータ
        val SEPARATOR = File.separator
        // コピー対象のファイル名
        private val FILE_NAME = "sample_svg_rialto.svg"
        // コピー先のディレクトリパス
        val BASE_PATH = Environment.getExternalStorageDirectory().path + SEPARATOR + "fonts"
        val FILE_NAME_TMP = "sample.svg"

        val TMP_FILE_PATH =
            Environment.getExternalStorageDirectory().path + SEPARATOR + "fonts" + SEPARATOR + FILE_NAME_TMP
    }

//  "/storage/emulated/0/fonts/sample_svg_rialto.svg";

    private val context: Context


    constructor(context: Context) {
        this.context = context
    }

    fun writeSvg(svgString: String): Boolean {
        // コピー先のディレクトリ
        val dir = File(BASE_PATH)

        // コピー先のディレクトリが存在しない場合は生成
        if (!dir.exists()) {
            // ディレクトリの生成に失敗したら終了
            if (!dir.mkdirs()) {
                return false
            }
        }

        // こぴーしょり
        try {
            val inputStream = ByteArrayInputStream(svgString.toByteArray(charset("utf-8")))

            val fileOutputStream =
                FileOutputStream(File(BASE_PATH + SEPARATOR + FILE_NAME_TMP), false)

            val buffer = ByteArray(1024)
            var read = 0
            do {
                read = inputStream.read(buffer)
                if (read == -1) break

                fileOutputStream.write(buffer, 0, read)
            } while (true)

            fileOutputStream.close()
            inputStream.close()
        } catch (e: IOException) {
            // 何かテキトーに
            return false
        }

        return true
    }
}