package com.example.formation.formation_kmp_ios_android

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform