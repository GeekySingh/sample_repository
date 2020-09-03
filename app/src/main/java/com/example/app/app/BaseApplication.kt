package com.example.app.app

import android.app.Application
import com.example.app.di.Modules.registerClient
import com.example.app.di.Modules.registerRepository

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // register koin components

        startKoin {
            registerClient()
            registerRepository()
        }
    }
}