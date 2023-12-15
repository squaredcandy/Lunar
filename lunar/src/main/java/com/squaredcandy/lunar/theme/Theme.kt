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
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    scrim = md_theme_light_shadow,
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
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    scrim = md_theme_dark_shadow,
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
    private fun red(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_red else light_red
    private fun green(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_green else light_green
    private fun yellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_yellow else light_yellow
    private fun blue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_blue else light_blue
    private fun magenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_magenta else light_magenta
    private fun cyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_cyan else light_cyan
    private fun brightRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_red else light_bright_red
    private fun brightGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_green else light_bright_green
    private fun brightYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_yellow else light_bright_yellow
    private fun brightBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_blue else light_bright_blue
    private fun brightMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_magenta else light_bright_magenta
    private fun brightCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_cyan else light_bright_cyan

    // Content Colors
    private fun onRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onred else light_onred
    private fun onGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_ongreen else light_ongreen
    private fun onYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onyellow else light_onyellow
    private fun onBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onblue else light_onblue
    private fun onMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onmagenta else light_onmagenta
    private fun onCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_oncyan else light_oncyan
    private fun onBrightRed(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_red else light_onbright_red
    private fun onBrightGreen(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_green else light_onbright_green
    private fun onBrightYellow(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_yellow else light_onbright_yellow
    private fun onBrightBlue(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_blue else light_onbright_blue
    private fun onBrightMagenta(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_magenta else light_onbright_magenta
    private fun onBrightCyan(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_cyan else light_onbright_cyan

    // Containers
    private fun redContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_redContainer else light_redContainer
    private fun greenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_greenContainer else light_greenContainer
    private fun yellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_yellowContainer else light_yellowContainer
    private fun blueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_blueContainer else light_blueContainer
    private fun magentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_magentaContainer else light_magentaContainer
    private fun cyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_cyanContainer else light_cyanContainer
    private fun brightRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_redContainer else light_bright_redContainer
    private fun brightGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_greenContainer else light_bright_greenContainer
    private fun brightYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_yellowContainer else light_bright_yellowContainer
    private fun brightBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_blueContainer else light_bright_blueContainer
    private fun brightMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_magentaContainer else light_bright_magentaContainer
    private fun brightCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_bright_cyanContainer else light_bright_cyanContainer

    // Container Content Colors
    private fun onRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onredContainer else light_onredContainer
    private fun onGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_ongreenContainer else light_ongreenContainer
    private fun onYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onyellowContainer else light_onyellowContainer
    private fun onBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onblueContainer else light_onblueContainer
    private fun onMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onmagentaContainer else light_onmagentaContainer
    private fun onCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_oncyanContainer else light_oncyanContainer
    private fun onBrightRedContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_redContainer else light_onbright_redContainer
    private fun onBrightGreenContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_greenContainer else light_onbright_greenContainer
    private fun onBrightYellowContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_yellowContainer else light_onbright_yellowContainer
    private fun onBrightBlueContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_blueContainer else light_onbright_blueContainer
    private fun onBrightMagentaContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_magentaContainer else light_onbright_magentaContainer
    private fun onBrightCyanContainer(isDarkTheme: Boolean): Color = if(isDarkTheme) dark_onbright_cyanContainer else light_onbright_cyanContainer

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
