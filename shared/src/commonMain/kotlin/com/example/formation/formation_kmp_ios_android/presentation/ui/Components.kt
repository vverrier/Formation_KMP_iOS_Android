package com.example.formation.formation_kmp.presentation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.formation.formation_kmp.presentation.ui.theme.Formation_KMPTheme
import com.example.formation.formation_kmp_ios_android.rest.WeatherEntity

@Composable
fun MyError(modifier: Modifier = Modifier, errorMessage:String?) {
    errorMessage?.let {
        Text(it, modifier = Modifier.background(MaterialTheme.colorScheme.error), color = MaterialTheme.colorScheme.onError)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreenPreview2() {
    Formation_KMPTheme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MyError(modifier = Modifier.padding(innerPadding), errorMessage = "Une erreur est survenue")
        }
    }
}

@Composable
expect fun WeatherGallery(modifier:Modifier = Modifier, list: List<WeatherEntity>, onTapPicture: (WeatherEntity)->Unit)
