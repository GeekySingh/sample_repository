package com.example.app.di

import retrofit2.Retrofit

object Modules {

    private fun provideRetrofit() : Retrofit {
        return Retrofit.Builder().baseUrl("https://www.google.com").build()
    }

    fun registerClient() {
        // faactory { provideRetrofit() }
    }

    fun registerRepository() {
        // factory{ ItemRepository(get()) }
    }

    fun registerServices() {
        // factory { ItemService( }
    }
}