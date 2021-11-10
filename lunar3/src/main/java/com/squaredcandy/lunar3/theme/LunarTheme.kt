package com.squaredcandy.lunar3.theme

import android.content.Context
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.squaredcandy.lunar_common.accompanist.LunarSystemUiController
import com.squaredcandy.lunar_common.accompanist.rememberLunarSystemUiController

private val lightColorScheme = lightColorScheme(
    primary = LunarColor.Primary40,
    onPrimary = LunarColor.Primary100,
    primaryContainer = LunarColor.Primary90,
    onPrimaryContainer = LunarColor.Primary10,
    secondary = LunarColor.Secondary40,
    onSecondary = LunarColor.Secondary100,
    secondaryContainer = LunarColor.Secondary90,
    onSecondaryContainer = LunarColor.Secondary10,
    tertiary = LunarColor.Tertiary40,
    onTertiary = LunarColor.Tertiary100,
    tertiaryContainer = LunarColor.Tertiary90,
    onTertiaryContainer = LunarColor.Tertiary10,
    error = LunarColor.Error40,
    errorContainer = LunarColor.Error100,
    onError = LunarColor.Error90,
    onErrorContainer = LunarColor.Error10,
    background = LunarColor.Neutral99,
    onBackground = LunarColor.Neutral10,
    surface = LunarColor.Neutral99,
    onSurface = LunarColor.Neutral10,
    surfaceVariant = LunarColor.NeutralVariant90,
    onSurfaceVariant = LunarColor.NeutralVariant30,
    outline = LunarColor.NeutralVariant50,
    inverseOnSurface = LunarColor.Neutral95,
    inverseSurface = LunarColor.Neutral20,
)

private val darkColorScheme = darkColorScheme(
    primary = LunarColor.Primary80,
    onPrimary = LunarColor.Primary20,
    primaryContainer = LunarColor.Primary30,
    onPrimaryContainer = LunarColor.Primary90,
    secondary = LunarColor.Secondary80,
    onSecondary = LunarColor.Secondary20,
    secondaryContainer = LunarColor.Secondary30,
    onSecondaryContainer = LunarColor.Secondary90,
    tertiary = LunarColor.Tertiary80,
    onTertiary = LunarColor.Tertiary20,
    tertiaryContainer = LunarColor.Tertiary30,
    onTertiaryContainer = LunarColor.Tertiary90,
    error = LunarColor.Error80,
    errorContainer = LunarColor.Error20,
    onError = LunarColor.Error30,
    onErrorContainer = LunarColor.Error90,
    background = LunarColor.Neutral10,
    onBackground = LunarColor.Neutral90,
    surface = LunarColor.Neutral10,
    onSurface = LunarColor.Neutral80,
    surfaceVariant = LunarColor.NeutralVariant30,
    onSurfaceVariant = LunarColor.NeutralVariant80,
    outline = LunarColor.NeutralVariant60,
    inverseOnSurface = LunarColor.Neutral10,
    inverseSurface = LunarColor.Neutral90,
)

@Composable
fun LunarTheme(
    context: Context,
    useDynamicColorSchemeState: State<Boolean> = remember { mutableStateOf(true) },
    systemUiController: LunarSystemUiController = rememberLunarSystemUiController(),
    darkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val useDynamicColorScheme = useDynamicColorSchemeState.value &&
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    val colorScheme = when {
        darkMode && useDynamicColorScheme -> dynamicDarkColorScheme(context)
        darkMode && !useDynamicColorScheme -> darkColorScheme
        !darkMode && useDynamicColorScheme -> dynamicLightColorScheme(context)
        !darkMode && !useDynamicColorScheme -> lightColorScheme
        else -> throw IllegalStateException("Failed to get colour scheme")
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = LunarType.typography,
    ) {
        val statusBarColor = MaterialTheme.colorScheme.background
        val navigationBarColor = MaterialTheme.colorScheme.background

        // Update status bar colours
        SideEffect {
            systemUiController.setStatusBarColor(
                color = statusBarColor,
                darkIcons = !darkMode,
            )

            systemUiController.setNavigationBarColor(
                color = navigationBarColor,
                darkIcons = !darkMode,
            )

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                systemUiController.setNavigationScrimColor(navigationBarColor)
            }
        }

        content()
    }
}