package Services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ServiceBuilder {

    //Base URL for Connecting the service
    private const val URL = "http://192.168.1.2/WebApp1/api/"

    //Create OkHttp Client
    private val okHttp: OkHttpClient.Builder = OkHttpClient.Builder()

    //Create Retrofit Client
    private val builder: Retrofit.Builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())

    //create Instance for retrofit
    private val retrofit:Retrofit=builder.build()

    fun <T> buildService(serviceType:Class<T>):T{
        return retrofit.create(serviceType)
    }

}