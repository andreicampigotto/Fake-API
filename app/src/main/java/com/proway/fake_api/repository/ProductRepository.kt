package com.proway.fake_api.repository

import retrofit2.Response
import javax.inject.Inject

class ProductRepository @Inject constructor(private val services: ProductRepository) {

//    suspend fun getProducts(): Deferred<Product?> {
//
//    }

    private fun <T> processData(response: Response<T>): T? {
        return if (response.isSuccessful) response.body() else null
    }
}