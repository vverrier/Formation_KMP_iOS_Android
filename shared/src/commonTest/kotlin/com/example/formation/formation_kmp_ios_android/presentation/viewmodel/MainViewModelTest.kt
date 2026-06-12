package com.example.formation.formation_kmp_ios_android.presentation.viewmodel

import com.example.formation.formation_kmp_ios_android.di.fakeApiModule
import com.example.formation.formation_kmp_ios_android.domain.WeatherRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.mp.KoinPlatform
import kotlin.test.AfterTest
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.time.Duration.Companion.seconds


class MainViewModelTest {
    /*
    @Test
    fun testAPIWork() = runTest(timeout = 10.seconds) {

        startKoin {
            modules(apiModule)
        }
        val koin = KoinPlatform.getKoin()
        val weatherApi = koin.get<KtorWeatherApi>()
        val viewModel = MainViewModel(weatherApi = weatherApi)
        val list = weatherApi.loadWeathers("Toulouse")
        viewModel.runInProgress.first {
            !it
        }
        assertTrue(list.isNotEmpty())
    }
     */

    @Test
    fun testFakeAPIWork() = runTest(timeout = 10.seconds) {

        startKoin {
            modules(fakeApiModule)
        }
        val koin = KoinPlatform.getKoin()
        val weatherApi = koin.get<WeatherRepository>()
        val viewModel = MainViewModel(weatherApi = weatherApi)
        val list = weatherApi.loadWeathers("Toulouse")
        viewModel.runInProgress.first {
            !it
        }
        assertTrue(list.isNotEmpty())
    }

    @AfterTest
    fun tearDown() {
        stopKoin()
    }
}