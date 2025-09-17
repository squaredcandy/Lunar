package com.squaredcandy.lunar.theme

import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedDarkColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedDarkHighContrastColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedDarkMediumContrastColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedLightColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedLightHighContrastColorScheme
import com.squaredcandy.lunar.theme.AccentedColorScheme.accentedLightMediumContrastColorScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.darkScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.highContrastDarkColorScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.highContrastLightColorScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.lightScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.mediumContrastDarkColorScheme
import com.squaredcandy.lunar.theme.MaterialColorScheme.mediumContrastLightColorScheme

fun getLunarColorScheme(
    themeProvider: ThemeProvider,
    colorScheme: ColorScheme = getColorScheme(
        themeProvider = themeProvider,
    ),
    accentedColorScheme: AccentColorScheme = getAccentedColorScheme(
        darkThemeProvider = themeProvider.darkThemeProvider,
        contrastProvider = themeProvider.contrastProvider,
    ),
): LunarColorScheme {
    return LunarColorScheme(colorScheme, accentedColorScheme)
}

fun getColorScheme(
    themeProvider: ThemeProvider,
) = getColorScheme(
    darkThemeProvider = themeProvider.darkThemeProvider,
    dynamicColorProvider = themeProvider.dynamicColorProvider,
    contrastProvider = themeProvider.contrastProvider,
    contextProvider = themeProvider.contextProvider,
)

fun getColorScheme(
    darkThemeProvider: DarkThemeProvider,
    dynamicColorProvider: DynamicColorProvider,
    contrastProvider: ContrastProvider,
    contextProvider: ContextProvider,
): ColorScheme {
    val context = contextProvider()
    return when {
        dynamicColorProvider() && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S && context != null -> {
            if (darkThemeProvider()) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkThemeProvider() -> darkScheme.applyContrast(
            contrastProvider = contrastProvider,
            mediumContrastColorScheme = mediumContrastDarkColorScheme,
            highContrastColorScheme = highContrastDarkColorScheme,
        )
        else -> lightScheme.applyContrast(
            contrastProvider = contrastProvider,
            mediumContrastColorScheme = mediumContrastLightColorScheme,
            highContrastColorScheme = highContrastLightColorScheme,
        )
    }
}

fun getAccentedColorScheme(
    darkThemeProvider: DarkThemeProvider,
    contrastProvider: ContrastProvider,
): AccentColorScheme {
    return when {
        darkThemeProvider() -> accentedDarkColorScheme.applyContrast(
            contrastProvider = contrastProvider,
            mediumContrastAccentColorScheme = accentedDarkMediumContrastColorScheme,
            highContrastAccentColorScheme = accentedDarkHighContrastColorScheme,
        )
        else -> accentedLightColorScheme.applyContrast(
            contrastProvider = contrastProvider,
            mediumContrastAccentColorScheme = accentedLightMediumContrastColorScheme,
            highContrastAccentColorScheme = accentedLightHighContrastColorScheme,
        )
    }
}
