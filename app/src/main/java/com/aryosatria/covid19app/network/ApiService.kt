package com.aryosatria.covid19app.network

import com.aryosatria.covid19app.model.AllNegara
import com.aryosatria.covid19app.model.InfoNegara
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url
import java.util.concurrent.TimeUnit

interface ApiService {
    @GET("summary")
    fun getAllnegara(): Call<AllNegara>
}

interface InfoService{
    @GET
    fun getInfoService(@Url url: String): Call<List<InfoNegara>>
}

object RetrofitBuilder{

    private val okhttp = OkHttpClient().newBuilder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(15, TimeUnit.SECONDS)
        .writeTimeout(15, TimeUnit.SECONDS)
        .build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.covid19api.com/")
        .client(okhttp)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}