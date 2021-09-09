package com.proway.fake_api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private val retrofitFake = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getProductServices(): ProductService {
        return retrofitFake.create(ProductService::class.java)
    }
}