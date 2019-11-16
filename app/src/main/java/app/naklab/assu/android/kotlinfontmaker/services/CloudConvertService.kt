package app.naklab.assu.android.kotlinfontmaker.services

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface CloudConvertService {
    @Multipart // PathはベースURLを抜いたものでOK
    @POST("v1/convert?input=upload&outputformat=ttf&inputformat=svg&apikey=" + API.string + "&wait=true&download=inline")
    abstract fun upload(@Part file: MultipartBody.Part): Call<ResponseBody>
}