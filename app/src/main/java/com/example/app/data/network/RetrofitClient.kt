package com.example.app.data.network

import com.example.app.data.service.ItemService
import retrofit2.Retrofit

object RetrofitClient {

    fun provideClient(): Retrofit {
        return Retrofit.Builder().baseUrl("https://www.google.com").build()
    }

    fun provideItemService(retrofit: Retrofit) : ItemService {
        return retrofit.create(ItemService::class.java)
    }
}