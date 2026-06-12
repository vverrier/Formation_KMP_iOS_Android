package com.example.formation.formation_kmp_ios_android

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.formation.formation_kmp_ios_android.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "Formation_KMP_iOS_Android",
    ) {
        App()
    }
}