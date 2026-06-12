package com.example.formation.formation_kmp.presentation.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.example.formation.formation_kmp.presentation.ui.MyError
import com.example.formation.formation_kmp.presentation.ui.WeatherGallery
import com.example.formation.formation_kmp.presentation.ui.theme.Formation_KMPTheme
import com.example.formation.formation_kmp_ios_android.di.apiModule
import com.example.formation.formation_kmp_ios_android.di.fakeApiModule
import com.example.formation.formation_kmp_ios_android.di.viewModelModule
import com.example.formation.formation_kmp_ios_android.presentation.viewmodel.MainViewModel
import formation_kmp_ios_android.shared.generated.resources.Res
import formation_kmp_ios_android.shared.generated.resources.clear_filter
import formation_kmp_ios_android.shared.generated.resources.error
import formation_kmp_ios_android.shared.generated.resources.load_data
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.KoinApplicationPreview
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun SearchScreen(modifier: Modifier = Modifier, mainViewModel: MainViewModel, onTapPicture: (Int) -> Unit = {}) {
    var searchText by remember { mutableStateOf("") }
    val list = mainViewModel.dataList.collectAsStateWithLifecycle().value
    var errorMessage = mainViewModel.errorMessage.collectAsStateWithLifecycle().value
    var runInProgress = mainViewModel.runInProgress.collectAsStateWithLifecycle().value

    Column(modifier = Modifier
        .fillMaxHeight()
        .then(modifier)) {
        SearchBar(text = searchText) {
            searchText = it
        }
        AnimatedVisibility(visible = !errorMessage.isBlank()) {
            MyError(errorMessage = errorMessage)
        }
        AnimatedVisibility(visible = runInProgress){
            CircularProgressIndicator()
        }
        WeatherGallery(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(8.dp), list = list) {
            onTapPicture(it.id)
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Button(onClick = {
                searchText = ""
            }) {
                Icon(Icons.Filled.Cancel, contentDescription = null)
                Spacer(Modifier.width(8.dp))
                Text(stringResource(Res.string.clear_filter))
            }
            Spacer(Modifier.width(16.dp))
            Button(onClick = {
                mainViewModel.loadWeathers(searchText)
            }) {
                Icon(Icons.AutoMirrored.Filled.Send, contentDescription = null)
                Spacer(Modifier.width(8.dp))
                Text(stringResource(Res.string.load_data))
            }
        }
    }
    LaunchedEffect("") {
        mainViewModel.loadWeathers("Toulouse")
    }
}

@Composable
fun SearchBar(modifier: Modifier = Modifier, text: String, onSearchAction: (String) -> Unit) {
    TextField(
        value = text, //Valeur affichée
        onValueChange = onSearchAction, //Nouveau texte entrée
        leadingIcon = { //Image d'icône
            Icon(
                imageVector = Icons.Default.Search,
                tint = MaterialTheme.colorScheme.primary,
                contentDescription = null
            )
        },
        singleLine = true,
        placeholder = {
            Text("Votre recherche ici")
        },
        //placeholder = { //Texte d'aide qui disparait
        //Text("Recherche")
        //},

        //keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search), // Définir le bouton "Entrée" comme action de recherche
        //keyboardActions = KeyboardActions(onSearch = {onSearchAction()}), // Déclenche l'action définie
        //Comment le composant doit se placer
        modifier = modifier
            .fillMaxWidth() // Prend toute la largeur
            .heightIn(min = 56.dp) //Hauteur minimum
    )}
@Composable
fun PictureRowItem(modifier: Modifier = Modifier, pictureUrl: String, city: String, text: String, onTapPicture: () -> Unit) {
    var longText by remember { mutableStateOf(false) }
    Row(modifier = modifier) {
        AsyncImage(
            model = pictureUrl,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            error = painterResource(resource = Res.drawable.error),
            onError = {
                println("Erreur de chargement de l'image ${it.result.throwable.message}")
            },
            modifier = Modifier
                .heightIn(max = 100.dp)
                .widthIn(max = 100.dp)
                .clickable {
                    onTapPicture()
                }
        )
        Column {
            Text(city, color = MaterialTheme.colorScheme.onPrimary)
            Text(if (longText) text else { text.take(20)+"..." }, color = MaterialTheme.colorScheme.onPrimary, modifier = Modifier
                .clickable { longText = !longText }
                .animateContentSize())
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Preview(showBackground = true, showSystemUi = true,
           uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
fun SearchScreenPreview() {
    //Il faut remplacer NomVotreAppliTheme par le thème de votre application
    //Utilisé par exemple dans MainActivity.kt sous setContent {...}
    KoinApplicationPreview(application = {
        //androidContext(context) uniquement si coté Android avec Context
        modules(fakeApiModule, viewModelModule)
    }) {
        Formation_KMPTheme() {
            val mainViewModel: MainViewModel = koinViewModel<MainViewModel>()

            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                SearchScreen(modifier = Modifier.padding(innerPadding), mainViewModel = mainViewModel)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SearchScreenPreview2() {

    //Il faut remplacer NomVotreAppliTheme par le thème de votre application
    //Utilisé par exemple dans MainActivity.kt sous setContent {...}
    KoinApplicationPreview(application = {
        //androidContext(context) uniquement si coté Android avec Context
        modules(fakeApiModule, viewModelModule)
    }) {
        Formation_KMPTheme() {
            val mainViewModel: MainViewModel = koinViewModel<MainViewModel>()
            mainViewModel.loadWeathers("Test")
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                SearchScreen(
                    modifier = Modifier.padding(innerPadding),
                    mainViewModel = mainViewModel
                )
            }
        }
    }
}