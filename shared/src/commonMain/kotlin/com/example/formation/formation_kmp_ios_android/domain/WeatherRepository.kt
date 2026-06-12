package com.example.formation.formation_kmp_ios_android.domain

import com.example.formation.formation_kmp_ios_android.rest.WeatherEntity

interface WeatherRepository {
    suspend fun loadWeathers(cityName: String): List<WeatherEntity>

    fun close()
}