package com.squaredcandy.lunar.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

@Composable
fun LunarTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current
    val themeProvider = LunarContextUtils.getThemeProvider(
        context = context,
        overrideDarkTheme = darkTheme,
        overrideDynamicColor = dynamicColor,
    )
    val colorScheme = getColorScheme(themeProvider = themeProvider)
    val lunarColorScheme = getLunarColorScheme(
        themeProvider = themeProvider,
        colorScheme = colorScheme
    )

    MaterialTheme(
        colorScheme = colorScheme,
    ) {
        CompositionLocalProvider(
            LocalLunarColorScheme provides lunarColorScheme,
            content = content,
        )
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun LunarExpressiveTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current
    val themeProvider = LunarContextUtils.getThemeProvider(
        context = context,
        overrideDarkTheme = darkTheme,
        overrideDynamicColor = dynamicColor,
    )
    val colorScheme = getColorScheme(themeProvider = themeProvider)
    val lunarColorScheme = getLunarColorScheme(
        themeProvider = themeProvider,
        colorScheme = colorScheme
    )

    MaterialExpressiveTheme(
        colorScheme = colorScheme,
    ) {
        CompositionLocalProvider(
            LocalLunarColorScheme provides lunarColorScheme,
            content = content,
        )
    }
}
