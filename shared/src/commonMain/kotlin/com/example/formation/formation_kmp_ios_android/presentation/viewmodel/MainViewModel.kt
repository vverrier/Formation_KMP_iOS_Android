package com.example.formation.formation_kmp_ios_android.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.formation.formation_kmp_ios_android.di.initKoin
import com.example.formation.formation_kmp_ios_android.domain.WeatherRepository
import com.example.formation.formation_kmp_ios_android.rest.DescriptionEntity
import com.example.formation.formation_kmp_ios_android.rest.KtorWeatherApi
import com.example.formation.formation_kmp_ios_android.rest.TempEntity
import com.example.formation.formation_kmp_ios_android.rest.WeatherEntity
import com.example.formation.formation_kmp_ios_android.rest.WindEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.koin.compose.viewmodel.koinViewModel
import org.koin.mp.KoinPlatform
import kotlin.time.Duration.Companion.milliseconds

suspend fun main() {
    initKoin()
    val koin = KoinPlatform.getKoin()
    val weatherApi = koin.get<WeatherRepository>()
    val viewModel = MainViewModel(weatherApi = weatherApi)
    //viewModel.loadWeathers("")
    viewModel.loadWeathers("Paris")
    //attente
    while (viewModel.runInProgress.value){
        delay(500.milliseconds)
    }
    //Affichage de la liste ou du message d'erreur
    println("List : ${viewModel.dataList.value}" )
    println("ErrorMessage : ${viewModel.errorMessage.value}" )

    //Pour que le programme s'arrête, inutile sur Android
    weatherApi.close()
}

class MainViewModel(val weatherApi: WeatherRepository) : ViewModel() {
    val dataList = MutableStateFlow(emptyList<WeatherEntity>())
    val runInProgress = MutableStateFlow(false)
    val errorMessage = MutableStateFlow("")

    fun loadWeathers(cityName: String) {
        runInProgress.value = true
        errorMessage.value = ""
        dataList.value = emptyList()

        viewModelScope.launch(Dispatchers.IO) {
            try {
                if(cityName.length < 3){
                    throw Exception("Il faut au moins 3 caractères")
                }
                dataList.value = weatherApi.loadWeathers(cityName)
            }
            catch (e: Exception) {
                e.printStackTrace()
                errorMessage.value = e.message ?: "Une erreur est survenue"
            }
            runInProgress.value = false
        }
    }
}