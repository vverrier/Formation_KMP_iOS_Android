package com.example.formation.formation_kmp.presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.unit.dp
import com.example.formation.formation_kmp.presentation.ui.screens.PictureRowItem

@androidx.compose.runtime.Composable
actual fun WeatherGallery(
    modifier: androidx.compose.ui.Modifier,
    list: List<com.example.formation.formation_kmp_ios_android.rest.WeatherEntity>,
    onTapPicture: (com.example.formation.formation_kmp_ios_android.rest.WeatherEntity) -> Unit
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(list.size) {
            val item = list[it]
            PictureRowItem(
                modifier = modifier,
                pictureUrl = item.weather.firstOrNull()?.icon ?: "",
                city = item.name,
                text = item.getResume(),
                ) {
                onTapPicture(item)
            }
        }
    }
}