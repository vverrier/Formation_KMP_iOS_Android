package com.example.formation.formation_kmp_ios_android


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.formation.formation_kmp.presentation.ui.AppNavigation
import com.example.formation.formation_kmp.presentation.ui.theme.Formation_KMPTheme

@Composable
@Preview
fun App() {
    Formation_KMPTheme {
        var showContent by remember { mutableStateOf(false) }
        Formation_KMPTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                AppNavigation(modifier = Modifier.padding(innerPadding))
            }
        }
    }
}