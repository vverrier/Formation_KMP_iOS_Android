package com.example.formation.formation_kmp_ios_android.rest

import com.example.formation.formation_kmp_ios_android.BuildConfig
import com.example.formation.formation_kmp_ios_android.di.initKoin
import com.example.formation.formation_kmp_ios_android.domain.WeatherRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.isSuccess
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.koin.mp.KoinPlatform

suspend fun main() {
    initKoin()
    val koin = KoinPlatform.getKoin()
    val weatherApi = koin.get<KtorWeatherApi>()
    for (weather in weatherApi.loadWeathers("nice")) {
        println(weather.getResume())
    }

    weatherApi.close()
}


class KtorWeatherApi(val client: HttpClient): WeatherRepository {
    //Déclaration du client


    override suspend fun loadWeathers(cityName: String): List<WeatherEntity> {
        val response = client.get("https://api.openweathermap.org/data/2.5/find?q=$cityName&appid=${BuildConfig.WEATHER_API_KEY}&units=metric&lang=fr")
        if (!response.status.isSuccess()) {
            throw Exception("Erreur API: ${response.status} - ${response.bodyAsText()}")
        }
        val list = response.body<WeatherAPIResult>().list

        list.forEach{
            it.weather.forEach {
                it.icon = "https://openweathermap.org/img/wn/${it.icon}@4x.png"
            }
        }

        return list
    }

    override fun close() {
        client.close()
    }
}

/* -------------------------------- */
// WEATHER
/* -------------------------------- */

@kotlinx.serialization.Serializable
data class WeatherAPIResult(val list: List<WeatherEntity>)

@kotlinx.serialization.Serializable
data class WeatherEntity(
    val id: Int, val name: String, val main: TempEntity,
    val weather: List<DescriptionEntity>,
    val wind: WindEntity
) {

    fun getResume() = """
            Il fait ${main.temp}° à $name (id=$id) avec un vent de ${wind.speed} m/s
            -Description : ${weather.firstOrNull()?.description ?: "-"}
            -Icône : ${weather.firstOrNull()?.icon ?: "-"}
        """.trimIndent()

}

@kotlinx.serialization.Serializable
data class TempEntity(val temp: Double)

@kotlinx.serialization.Serializable
data class DescriptionEntity(val description: String, var icon: String)

@Serializable
data class WindEntity(val speed: Double)