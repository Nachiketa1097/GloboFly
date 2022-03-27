package com.smartherd.globofly.services

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    //BEFORE RELEASE CHANGE THIS URL TO LIVE SERVER URL
    private const val URL = "http://127.0.0.1:9000/"
    //CREATE OKHTTP CLIENT
    private val okHttp = OkHttpClient.Builder()
    //CREATE RETROFIT BUILDER
    private val builder = Retrofit.Builder().baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttp.build())
    //CREATE RETROFIT INSTANCE
    private val retrofit = builder.build()

    fun <T> buildService(serviceType: Class<T>): T{
        return retrofit.create(serviceType)
    }
}