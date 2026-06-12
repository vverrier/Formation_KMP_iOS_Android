package com.example.formation.formation_kmp_ios_android.di

import com.example.formation.formation_kmp_ios_android.domain.WeatherRepository
import com.example.formation.formation_kmp_ios_android.presentation.viewmodel.MainViewModel
import com.example.formation.formation_kmp_ios_android.rest.FakeWeatherApi
import com.example.formation.formation_kmp_ios_android.rest.KtorWeatherApi
import com.example.formation.formation_kmp_ios_android.rest.configurePlatformSsl
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.bind
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(apiModule, viewModelModule)
    }
}

// Version pour iOS et Desktop
fun initKoin() = initKoin {}

//------------------------
//DECLARATION DES MODULES
//------------------------
val apiModule = module {
    //Création d'un singleton pour le client HTTP
    single {
        HttpClient {
            configurePlatformSsl()
            install(Logging) {
                //(import io.ktor.client.plugins.logging.Logger)
                logger = object : Logger {
                    override fun log(message: String) {
                        println(message)
                    }
                }
                level = LogLevel.INFO  // TRACE, HEADERS, BODY, etc.
            }
            install(ContentNegotiation) {
                json(Json { ignoreUnknownKeys = true }, contentType = ContentType.Any)
            }
            install(HttpTimeout) {
                requestTimeoutMillis = 5000
            }
        }
    }
    //singleOf(::PhotographerAPI) bind PhotographerRepository::class
    single<WeatherRepository> { KtorWeatherApi(get()) }
}

val fakeApiModule = module {
    single<WeatherRepository> { FakeWeatherApi() }
}




val viewModelModule = module {

    //V1 : Si on veut ajouter manuellement certain paramètre
    //viewModel { MainViewModel(get(), Dispatchers.IO) }

    //V2 On déclare un Dispatchers à koin
    factory { Dispatchers.IO }
    viewModelOf(::MainViewModel)
}