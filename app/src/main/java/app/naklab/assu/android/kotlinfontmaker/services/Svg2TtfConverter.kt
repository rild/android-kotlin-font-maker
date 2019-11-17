package app.naklab.assu.android.kotlinfontmaker.services

import android.os.AsyncTask
import android.os.Environment
import android.util.Log
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.*

class Svg2TtfConverter {
    internal val TAG = "CloudConvert"
    private var ttfFileName = ""
    private var listener: OnConvertListener? = null

    fun setListener(listener: OnConvertListener) {
        this.listener = listener
    }

    fun convert(fontSvgfilePath: String, fontName: String) {
        val service = CloudConvertServiceGenerator.createService(CloudConvertService::class.java)

        ttfFileName = fontName.replace("\\s+".toRegex(), "")

        // POSTする画像・音楽・動画等のファイル
        val file = File(fontSvgfilePath)

        if (!file.exists()) {
            Log.d(TAG, "not exists" + file.path)
            return
        }


        val requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), file)
        val body = MultipartBody.Part.createFormData("file", file.name, requestFile)

        val call = service.upload(body)
        call.enqueue(object : Callback<ResponseBody> {

            // ステータスコードが４００等エラーコード以外のとき呼ばれる
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                this@Svg2TtfConverter.onResponse(response)
                listener!!.onConvertComplete()
            }

            // ステータスコードが４００等エラーコードのとき呼ばれる
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                this@Svg2TtfConverter.onFailure()
                listener!!.onConvertFailure()
            }
        })
    }

    // レスポンスをもらった時の処理
    private fun onResponse(response: Response<ResponseBody>) {
        // 成功時の処理
        // response.body();でHTMLレスポンスのbodyタグ内が取れる
        Log.d(TAG, "succeeded")

        if (!response.isSuccessful) {
            Log.e(TAG, "Something's gone wrong")
            // TODO: show error message
            return
        }
        val downloadFileAsyncTask = DownloadFileAsyncTask()
        downloadFileAsyncTask.execute(response.body()!!.byteStream())
    }

    // レスポンスがもらえなかった時の処理
    private fun onFailure() {
        // 失敗時の処理
        Log.d(TAG, "failed")
    }

    // レスポンスから ttf データを取り出して、.ttfファイルを書き出すクラス
    // https://gldraphael.com/blog/downloading-a-file-using-retrofit/
    private inner class DownloadFileAsyncTask : AsyncTask<InputStream, Void, Boolean>() {

        internal val appDirectoryName = "fonts"
        internal val imageRoot =
            File(Environment.getExternalStorageDirectory().path, appDirectoryName)
        //        final String filename = "sample_svg_rialto.ttf";
        internal val filename = "$ttfFileName.ttf"

        override fun doInBackground(vararg params: InputStream): Boolean? {
            val inputStream = params[0]
            val file = File(imageRoot, filename)
            var output: OutputStream? = null
            try {
                output = FileOutputStream(file)

                val buffer = ByteArray(1024) // or other buffer size
                var read: Int

                Log.d(TAG, "Attempting to write to: $imageRoot/$filename")
                do {
                    read = inputStream.read(buffer)
                    if (read == -1) break

                    output.write(buffer, 0, read)
                    Log.v(TAG, "Writing to buffer to output stream.")
                } while (true)

//                while ((read = inputStream.read(buffer)) != -1) {
//                    output.write(buffer, 0, read)
//                    Log.v(TAG, "Writing to buffer to output stream.")
//                }

                Log.d(TAG, "Flushing output stream.")
                output.flush()
                Log.d(TAG, "Output flushed.")
            } catch (e: IOException) {
                Log.e(TAG, "IO Exception: " + e.message)
                e.printStackTrace()
                return false
            } finally {
                try {
                    if (output != null) {
                        output.close()
                        Log.d(TAG, "Output stream closed sucessfully.")
                    } else {
                        Log.d(TAG, "Output stream is null")
                    }
                } catch (e: IOException) {
                    Log.e(TAG, "Couldn't close output stream: " + e.message)
                    e.printStackTrace()
                    return false
                }

            }
            return true
        }

        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)

            Log.d(TAG, "Download success: " + result!!)
            // TODO: show a snackbar or a toast
        }
    }

    interface OnConvertListener {
        fun onConvertComplete()
        fun onConvertFailure()
    }
}