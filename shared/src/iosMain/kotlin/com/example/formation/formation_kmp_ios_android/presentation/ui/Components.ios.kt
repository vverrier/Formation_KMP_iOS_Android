package com.example.formation.formation_kmp.presentation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.formation.formation_kmp.presentation.ui.screens.PictureRowItem
import com.example.formation.formation_kmp_ios_android.rest.WeatherEntity

@Composable
actual fun WeatherGallery(
    modifier: Modifier,
    list: List<WeatherEntity>,
    onTapPicture: (WeatherEntity) -> Unit
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
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