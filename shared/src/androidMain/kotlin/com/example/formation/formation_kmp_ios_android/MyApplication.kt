package com.example.formation.formation_kmp_ios_android

import android.app.Application
import com.example.formation.formation_kmp_ios_android.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //On démarre Koin avec le contexte
        initKoin { androidContext(this@MyApplication) }
    }
}