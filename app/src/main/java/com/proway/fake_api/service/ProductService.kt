package com.proway.fake_api.service

import com.proway.fake_api.model.Product
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductService {
    @GET("/products")
    fun getProducts(): Call<List<Product>>

    @GET("/products/{id}")
    fun getProduct(@Path("id") productId: Int): Call<Product>
}