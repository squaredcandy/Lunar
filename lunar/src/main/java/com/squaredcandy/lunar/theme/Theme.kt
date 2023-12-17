package com.squaredcandy.lunar.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
)

private val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
    error = md_theme_dark_error,
    errorContainer = md_theme_dark_errorContainer,
    onError = md_theme_dark_onError,
    onErrorContainer = md_theme_dark_onErrorContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
)

@Suppress("MemberVisibilityCanBePrivate")
data object LunarAccentColors {

    // Base Colors
    val red: Color
        @ReadOnlyComposable @Composable
        get() = red(isSystemInDarkTheme())

    val green: Color
        @ReadOnlyComposable @Composable
        get() = green(isSystemInDarkTheme())

    val yellow: Color
        @ReadOnlyComposable @Composable
        get() = yellow(isSystemInDarkTheme())

    val blue: Color
        @ReadOnlyComposable @Composable
        get() = blue(isSystemInDarkTheme())

    val magenta: Color
        @ReadOnlyComposable @Composable
        get() = magenta(isSystemInDarkTheme())

    val cyan: Color
        @ReadOnlyComposable @Composable
        get() = cyan(isSystemInDarkTheme())

    val brightRed: Color
        @ReadOnlyComposable @Composable
        get() = brightRed(isSystemInDarkTheme())

    val brightGreen: Color
        @ReadOnlyComposable @Composable
        get() = brightGreen(isSystemInDarkTheme())

    val brightYellow: Color
        @ReadOnlyComposable @Composable
        get() = brightYellow(isSystemInDarkTheme())

    val brightBlue: Color
        @ReadOnlyComposable @Composable
        get() = brightBlue(isSystemInDarkTheme())

    val brightMagenta: Color
        @ReadOnlyComposable @Composable
        get() = brightMagenta(isSystemInDarkTheme())

    val brightCyan: Color
        @ReadOnlyComposable @Composable
        get() = brightCyan(isSystemInDarkTheme())

    // Content Colors
    val onRed: Color
        @ReadOnlyComposable @Composable
        get() = onRed(isSystemInDarkTheme())

    val onGreen: Color
        @ReadOnlyComposable @Composable
        get() = onGreen(isSystemInDarkTheme())

    val onYellow: Color
        @ReadOnlyComposable @Composable
        get() = onYellow(isSystemInDarkTheme())

    val onBlue: Color
        @ReadOnlyComposable @Composable
        get() = onBlue(isSystemInDarkTheme())

    val onMagenta: Color
        @ReadOnlyComposable @Composable
        get() = onMagenta(isSystemInDarkTheme())

    val onCyan: Color
        @ReadOnlyComposable @Composable
        get() = onCyan(isSystemInDarkTheme())

    val onBrightRed: Color
        @ReadOnlyComposable @Composable
        get() = onBrightRed(isSystemInDarkTheme())

    val onBrightGreen: Color
        @ReadOnlyComposable @Composable
        get() = onBrightGreen(isSystemInDarkTheme())

    val onBrightYellow: Color
        @ReadOnlyComposable @Composable
        get() = onBrightYellow(isSystemInDarkTheme())

    val onBrightBlue: Color
        @ReadOnlyComposable @Composable
        get() = onBrightBlue(isSystemInDarkTheme())

    val onBrightMagenta: Color
        @ReadOnlyComposable @Composable
        get() = onBrightMagenta(isSystemInDarkTheme())

    val onBrightCyan: Color
        @ReadOnlyComposable @Composable
        get() = onBrightCyan(isSystemInDarkTheme())

    // Containers
    val redContainer: Color
        @ReadOnlyComposable @Composable
        get() = redContainer(isSystemInDarkTheme())

    val greenContainer: Color
        @ReadOnlyComposable @Composable
        get() = greenContainer(isSystemInDarkTheme())

    val yellowContainer: Color
        @ReadOnlyComposable @Composable
        get() = yellowContainer(isSystemInDarkTheme())

    val blueContainer: Color
        @ReadOnlyComposable @Composable
        get() = blueContainer(isSystemInDarkTheme())

    val magentaContainer: Color
        @ReadOnlyComposable @Composable
        get() = magentaContainer(isSystemInDarkTheme())

    val cyanContainer: Color
        @ReadOnlyComposable @Composable
        get() = cyanContainer(isSystemInDarkTheme())

    val brightRedContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightRedContainer(isSystemInDarkTheme())

    val brightGreenContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightGreenContainer(isSystemInDarkTheme())

    val brightYellowContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightYellowContainer(isSystemInDarkTheme())

    val brightBlueContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightBlueContainer(isSystemInDarkTheme())

    val brightMagentaContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightMagentaContainer(isSystemInDarkTheme())

    val brightCyanContainer: Color
        @ReadOnlyComposable @Composable
        get() = brightCyanContainer(isSystemInDarkTheme())

    // Container Content Colors
    val onRedContainer: Color
        @ReadOnlyComposable @Composable
        get() = onRedContainer(isSystemInDarkTheme())

    val onGreenContainer: Color
        @ReadOnlyComposable @Composable
        get() = onGreenContainer(isSystemInDarkTheme())

    val onYellowContainer: Color
        @ReadOnlyComposable @Composable
        get() = onYellowContainer(isSystemInDarkTheme())

    val onBlueContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBlueContainer(isSystemInDarkTheme())

    val onMagentaContainer: Color
        @ReadOnlyComposable @Composable
        get() = onMagentaContainer(isSystemInDarkTheme())

    val onCyanContainer: Color
        @ReadOnlyComposable @Composable
        get() = onCyanContainer(isSystemInDarkTheme())

    val onBrightRedContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightRedContainer(isSystemInDarkTheme())

    val onBrightGreenContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightGreenContainer(isSystemInDarkTheme())

    val onBrightYellowContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightYellowContainer(isSystemInDarkTheme())

    val onBrightBlueContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightBlueContainer(isSystemInDarkTheme())

    val onBrightMagentaContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightMagentaContainer(isSystemInDarkTheme())

    val onBrightCyanContainer: Color
        @ReadOnlyComposable @Composable
        get() = onBrightCyanContainer(isSystemInDarkTheme())

    // Base Colors
    private fun red(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Red else light_Red
    private fun green(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Green else light_Green
    private fun yellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Yellow else light_Yellow
    private fun blue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Blue else light_Blue
    private fun magenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Magenta else light_Magenta
    private fun cyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_Cyan else light_Cyan
    private fun brightRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightRed else light_BrightRed
    private fun brightGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightGreen else light_BrightGreen
    private fun brightYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightYellow else light_BrightYellow
    private fun brightBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightBlue else light_BrightBlue
    private fun brightMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightMagenta else light_BrightMagenta
    private fun brightCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightCyan else light_BrightCyan

    // Content Colors
    private fun onRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onRed else light_onRed
    private fun onGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onGreen else light_onGreen
    private fun onYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onYellow else light_onYellow
    private fun onBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBlue else light_onBlue
    private fun onMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onMagenta else light_onMagenta
    private fun onCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onCyan else light_onCyan
    private fun onBrightRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightRed else light_onBrightRed
    private fun onBrightGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightGreen else light_onBrightGreen
    private fun onBrightYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightYellow else light_onBrightYellow
    private fun onBrightBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightBlue else light_onBrightBlue
    private fun onBrightMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightMagenta else light_onBrightMagenta
    private fun onBrightCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightCyan else light_onBrightCyan

    // Containers
    private fun redContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_RedContainer else light_RedContainer
    private fun greenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_GreenContainer else light_GreenContainer
    private fun yellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_YellowContainer else light_YellowContainer
    private fun blueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BlueContainer else light_BlueContainer
    private fun magentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_MagentaContainer else light_MagentaContainer
    private fun cyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_CyanContainer else light_CyanContainer
    private fun brightRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightRedContainer else light_BrightRedContainer
    private fun brightGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightGreenContainer else light_BrightGreenContainer
    private fun brightYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightYellowContainer else light_BrightYellowContainer
    private fun brightBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightBlueContainer else light_BrightBlueContainer
    private fun brightMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightMagentaContainer else light_BrightMagentaContainer
    private fun brightCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_BrightCyanContainer else light_BrightCyanContainer

    // Container Content Colors
    private fun onRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onRedContainer else light_onRedContainer
    private fun onGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onGreenContainer else light_onGreenContainer
    private fun onYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onYellowContainer else light_onYellowContainer
    private fun onBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBlueContainer else light_onBlueContainer
    private fun onMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onMagentaContainer else light_onMagentaContainer
    private fun onCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onCyanContainer else light_onCyanContainer
    private fun onBrightRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightRedContainer else light_onBrightRedContainer
    private fun onBrightGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightGreenContainer else light_onBrightGreenContainer
    private fun onBrightYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightYellowContainer else light_onBrightYellowContainer
    private fun onBrightBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightBlueContainer else light_onBrightBlueContainer
    private fun onBrightMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightMagentaContainer else light_onBrightMagentaContainer
    private fun onBrightCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onBrightCyanContainer else light_onBrightCyanContainer

    @Composable
    @ReadOnlyComposable
    fun contentColorFor(backgroundColor: Color): Color {
        return when (backgroundColor) {
            red -> onRed
            green -> onGreen
            yellow -> onYellow
            blue -> onBlue
            magenta -> onMagenta
            cyan -> onCyan

            brightRed -> onBrightRed
            brightGreen -> onBrightGreen
            brightYellow -> onBrightYellow
            brightBlue -> onBrightBlue
            brightMagenta -> onBrightMagenta
            brightCyan -> onBrightCyan

            redContainer -> onRedContainer
            greenContainer -> onGreenContainer
            yellowContainer -> onYellowContainer
            blueContainer -> onBlueContainer
            magentaContainer -> onMagentaContainer
            cyanContainer -> onCyanContainer

            brightRedContainer -> onBrightRedContainer
            brightGreenContainer -> onBrightGreenContainer
            brightYellowContainer -> onBrightYellowContainer
            brightBlueContainer -> onBrightBlueContainer
            brightMagentaContainer -> onBrightMagentaContainer
            brightCyanContainer -> onBrightCyanContainer

            else -> androidx.compose.material3.contentColorFor(backgroundColor = backgroundColor)
        }
    }
}

@Composable
fun LunarTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
