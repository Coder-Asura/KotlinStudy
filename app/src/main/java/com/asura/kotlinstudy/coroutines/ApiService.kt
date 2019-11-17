package com.asura.kotlinstudy.coroutines

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface ApiService {
    @GET
    @Streaming
    fun getImg(@Url url: String): Call<ResponseBody>
}