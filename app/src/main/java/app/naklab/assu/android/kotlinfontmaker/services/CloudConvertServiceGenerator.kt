package app.naklab.assu.android.kotlinfontmaker.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit

class CloudConvertServiceGenerator {

    companion object {
        val API_BASE_URL = "https://api.cloudconvert.com/"

        private val httpClient = OkHttpClient.Builder()

        private val builder = Retrofit.Builder().baseUrl(API_BASE_URL)

        fun <S> createService(serviceClass: Class<S>): S {
            val retrofit = builder.client(httpClient.build()).build()
            return retrofit.create(serviceClass)
        }

    }
}