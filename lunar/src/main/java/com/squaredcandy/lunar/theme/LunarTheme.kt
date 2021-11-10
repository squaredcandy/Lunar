package com.squaredcandy.lunar.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.squaredcandy.lunar_common.accompanist.LunarSystemUiController
import com.squaredcandy.lunar_common.accompanist.rememberLunarSystemUiController

private val lightPalette = lightColors(
    primary = LunarColor.amber_700,
    primaryVariant = LunarColor.amber_800,
    secondary = LunarColor.grey_800,
    secondaryVariant = LunarColor.grey_900,
    background = LunarColor.white_50,
    surface = LunarColor.white_100,
    error = LunarColor.red_600,
    onPrimary = LunarColor.white_50,
    onSecondary = LunarColor.white_50,
    onBackground = LunarColor.black_900,
    onSurface = LunarColor.black_900,
    onError = LunarColor.white_50,
)

private val darkPalette = darkColors(
    primary = LunarColor.amber_600,
    primaryVariant = LunarColor.amber_400,
    secondary = LunarColor.grey_600,
    background = LunarColor.black_800,
    surface = LunarColor.black_700,
    error = LunarColor.red_200,
    onPrimary = LunarColor.white_50,
    onSecondary = LunarColor.white_50,
    onBackground = LunarColor.white_50,
    onSurface = LunarColor.white_50,
    onError = LunarColor.black_900,
)

@Composable
fun LunarTheme(
    systemUiController: LunarSystemUiController = rememberLunarSystemUiController(),
    darkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (darkMode) darkPalette else lightPalette,
        typography = LunarType.typography,
        shapes = LunarShape.shapes,
    ) {
        val statusBarColor = MaterialTheme.colors.primarySurface
        val navigationBarColor = MaterialTheme.colors.surface

        // Update status bar colours
        SideEffect {
            systemUiController.setStatusBarColor(
                color = statusBarColor,
                darkIcons = !darkMode
            )

            systemUiController.setNavigationBarColor(
                color = navigationBarColor,
                darkIcons = !darkMode
            )

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                systemUiController.setNavigationScrimColor(navigationBarColor)
            }
        }

        content()
    }
}