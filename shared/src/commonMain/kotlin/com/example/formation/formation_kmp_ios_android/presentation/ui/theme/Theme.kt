package com.example.formation.formation_kmp.presentation.ui.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.AppTypography
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.backgroundLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.errorLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseOnSurfaceLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inversePrimaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.inverseSurfaceLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onBackgroundLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onErrorLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onPrimaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSecondaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onSurfaceVariantLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.onTertiaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.outlineVariantLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.primaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.scrimLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.secondaryLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceBrightLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerHighestLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceContainerLowestLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceDimLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.surfaceVariantLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryContainerLightMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryDark
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryDarkHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryDarkMediumContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryLight
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryLightHighContrast
import com.example.formation.formation_kmp_ios_android.presentation.ui.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun Formation_KMPTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
  val colorScheme = if (darkTheme) darkScheme else lightScheme

    MaterialTheme(
    colorScheme = colorScheme,
    typography = AppTypography,
    content = content
  )
}

