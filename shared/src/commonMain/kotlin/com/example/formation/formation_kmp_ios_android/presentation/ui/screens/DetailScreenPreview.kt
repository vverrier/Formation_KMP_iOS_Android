package com.example.formation.formation_kmp.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.formation.formation_kmp.presentation.ui.theme.Formation_KMPTheme
import com.example.formation.formation_kmp_ios_android.rest.DescriptionEntity
import com.example.formation.formation_kmp_ios_android.rest.TempEntity
import com.example.formation.formation_kmp_ios_android.rest.WeatherEntity
import com.example.formation.formation_kmp_ios_android.rest.WindEntity
import formation_kmp_ios_android.shared.generated.resources.Res
import formation_kmp_ios_android.shared.generated.resources.error
import org.jetbrains.compose.resources.painterResource

@Preview(showBackground = true, showSystemUi = true)
@Preview(showBackground = true, showSystemUi = true,
        uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
fun DetailScreenPreview() {
    Formation_KMPTheme() {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            DetailScreen(
                modifier = Modifier.padding(innerPadding),
                //jeu de donnée pour la Preview
                data = WeatherEntity(
                    id = 2,
                    name = "Toulouse",
                    main = TempEntity(temp = 22.3),
                    weather = listOf(
                        DescriptionEntity(
                            description = "partiellement nuageux",
                            icon = "https://picsum.photos/201"
                        )
                    ),
                    wind = WindEntity(speed = 3.2)
                ),
            )
        }
    }
}
@Composable //id du WeatherEntity à afficher
fun DetailScreen(modifier: Modifier = Modifier,
    data: WeatherEntity){

    Column(modifier = modifier) {
        Text(data.name)
        AsyncImage(
            model = data.weather.firstOrNull()?.icon,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            error = painterResource(resource = Res.drawable.error),
            onError = {
                println("Erreur de chargement de l'image ${it.result.throwable.message}")
            },
            modifier = Modifier
                .heightIn(max = 500.dp)
                .widthIn(max = 500.dp)
        )
        Text(data.getResume())
    }

}