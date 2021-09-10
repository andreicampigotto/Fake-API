package com.proway.fake_api.di

import android.content.Context
import com.proway.fake_api.repository.ProductRepository
import com.proway.fake_api.service.ProductService
import com.proway.fake_api.service.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {

    @Provides
    fun provideProductService(): ProductService = RetrofitBuilder.getProductServices()

//    @Provides
//    fun provideProductRepository(): ProductRepository = ProductRepository().
}