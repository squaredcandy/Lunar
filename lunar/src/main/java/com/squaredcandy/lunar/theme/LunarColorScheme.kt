package com.squaredcandy.lunar.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.contentColorFor
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

val LocalLunarColorScheme = staticCompositionLocalOf { LunarColorScheme(lightColorScheme(), accentedLightColorScheme()) }

@Immutable
data class LunarColorScheme(
    val colorScheme: ColorScheme,
    val accentColorScheme: AccentColorScheme,
) {
    val primary: Color get() = colorScheme.primary
    val onPrimary: Color get() = colorScheme.onPrimary
    val primaryContainer: Color get() = colorScheme.primaryContainer
    val onPrimaryContainer: Color get() = colorScheme.onPrimaryContainer
    val inversePrimary: Color get() = colorScheme.inversePrimary
    val secondary: Color get() = colorScheme.secondary
    val onSecondary: Color get() = colorScheme.onSecondary
    val secondaryContainer: Color get() = colorScheme.secondaryContainer
    val onSecondaryContainer: Color get() = colorScheme.onSecondaryContainer
    val tertiary: Color get() = colorScheme.tertiary
    val onTertiary: Color get() = colorScheme.onTertiary
    val tertiaryContainer: Color get() = colorScheme.tertiaryContainer
    val onTertiaryContainer: Color get() = colorScheme.onTertiaryContainer
    val background: Color get() = colorScheme.background
    val onBackground: Color get() = colorScheme.onBackground
    val surface: Color get() = colorScheme.surface
    val onSurface: Color get() = colorScheme.onSurface
    val surfaceVariant: Color get() = colorScheme.surfaceVariant
    val onSurfaceVariant: Color get() = colorScheme.onSurfaceVariant
    val surfaceTint: Color get() = colorScheme.surfaceTint
    val inverseSurface: Color get() = colorScheme.inverseSurface
    val inverseOnSurface: Color get() = colorScheme.inverseOnSurface
    val error: Color get() = colorScheme.error
    val onError: Color get() = colorScheme.onError
    val errorContainer: Color get() = colorScheme.errorContainer
    val onErrorContainer: Color get() = colorScheme.onErrorContainer
    val outline: Color get() = colorScheme.outline
    val outlineVariant: Color get() = colorScheme.outlineVariant
    val scrim: Color get() = colorScheme.scrim
    val surfaceBright: Color get() = colorScheme.surfaceBright
    val surfaceDim: Color get() = colorScheme.surfaceDim
    val surfaceContainer: Color get() = colorScheme.surfaceContainer
    val surfaceContainerHigh: Color get() = colorScheme.surfaceContainerHigh
    val surfaceContainerHighest: Color get() = colorScheme.surfaceContainerHighest
    val surfaceContainerLow: Color get() = colorScheme.surfaceContainerLow
    val surfaceContainerLowest: Color get() = colorScheme.surfaceContainerLowest

    val red: Color get() = accentColorScheme.red.color
    val onRed: Color get() = accentColorScheme.red.onColor
    val redContainer: Color get() = accentColorScheme.red.colorContainer
    val onRedContainer: Color get() = accentColorScheme.red.onColorContainer
    val green: Color get() = accentColorScheme.green.color
    val onGreen: Color get() = accentColorScheme.green.onColor
    val greenContainer: Color get() = accentColorScheme.green.colorContainer
    val onGreenContainer: Color get() = accentColorScheme.green.onColorContainer
    val yellow: Color get() = accentColorScheme.yellow.color
    val onYellow: Color get() = accentColorScheme.yellow.onColor
    val yellowContainer: Color get() = accentColorScheme.yellow.colorContainer
    val onYellowContainer: Color get() = accentColorScheme.yellow.onColorContainer
    val blue: Color get() = accentColorScheme.blue.color
    val onBlue: Color get() = accentColorScheme.blue.onColor
    val blueContainer: Color get() = accentColorScheme.blue.colorContainer
    val onBlueContainer: Color get() = accentColorScheme.blue.onColorContainer
    val magenta: Color get() = accentColorScheme.magenta.color
    val onMagenta: Color get() = accentColorScheme.magenta.onColor
    val magentaContainer: Color get() = accentColorScheme.magenta.colorContainer
    val onMagentaContainer: Color get() = accentColorScheme.magenta.onColorContainer
    val cyan: Color get() = accentColorScheme.cyan.color
    val onCyan: Color get() = accentColorScheme.cyan.onColor
    val cyanContainer: Color get() = accentColorScheme.cyan.colorContainer
    val onCyanContainer: Color get() = accentColorScheme.cyan.onColorContainer
    val brightRed: Color get() = accentColorScheme.brightRed.color
    val onBrightRed: Color get() = accentColorScheme.brightRed.onColor
    val brightRedContainer: Color get() = accentColorScheme.brightRed.colorContainer
    val onBrightRedContainer: Color get() = accentColorScheme.brightRed.onColorContainer
    val brightGreen: Color get() = accentColorScheme.brightGreen.color
    val onBrightGreen: Color get() = accentColorScheme.brightGreen.onColor
    val brightGreenContainer: Color get() = accentColorScheme.brightGreen.colorContainer
    val onBrightGreenContainer: Color get() = accentColorScheme.brightGreen.onColorContainer
    val brightYellow: Color get() = accentColorScheme.brightYellow.color
    val onBrightYellow: Color get() = accentColorScheme.brightYellow.onColor
    val brightYellowContainer: Color get() = accentColorScheme.brightYellow.colorContainer
    val onBrightYellowContainer: Color get() = accentColorScheme.brightYellow.onColorContainer
    val brightBlue: Color get() = accentColorScheme.brightBlue.color
    val onBrightBlue: Color get() = accentColorScheme.brightBlue.onColor
    val brightBlueContainer: Color get() = accentColorScheme.brightBlue.colorContainer
    val onBrightBlueContainer: Color get() = accentColorScheme.brightBlue.onColorContainer
    val brightMagenta: Color get() = accentColorScheme.brightMagenta.color
    val onBrightMagenta: Color get() = accentColorScheme.brightMagenta.onColor
    val brightMagentaContainer: Color get() = accentColorScheme.brightMagenta.colorContainer
    val onBrightMagentaContainer: Color get() = accentColorScheme.brightMagenta.onColorContainer
    val brightCyan: Color get() = accentColorScheme.brightCyan.color
    val onBrightCyan: Color get() = accentColorScheme.brightCyan.onColor
    val brightCyanContainer: Color get() = accentColorScheme.brightCyan.colorContainer
    val onBrightCyanContainer: Color get() = accentColorScheme.brightCyan.onColorContainer
    val black: Color get() = accentColorScheme.black.color
    val onBlack: Color get() = accentColorScheme.black.onColor
    val blackContainer: Color get() = accentColorScheme.black.colorContainer
    val onBlackContainer: Color get() = accentColorScheme.black.onColorContainer
    val white: Color get() = accentColorScheme.white.color
    val onWhite: Color get() = accentColorScheme.white.onColor
    val whiteContainer: Color get() = accentColorScheme.white.colorContainer
    val onWhiteContainer: Color get() = accentColorScheme.white.onColorContainer
    val brightBlack: Color get() = accentColorScheme.brightBlack.color
    val onBrightBlack: Color get() = accentColorScheme.brightBlack.onColor
    val brightBlackContainer: Color get() = accentColorScheme.brightBlack.colorContainer
    val onBrightBlackContainer: Color get() = accentColorScheme.brightBlack.onColorContainer
    val brightWhite: Color get() = accentColorScheme.brightWhite.color
    val onBrightWhite: Color get() = accentColorScheme.brightWhite.onColor
    val brightWhiteContainer: Color get() = accentColorScheme.brightWhite.colorContainer
    val onBrightWhiteContainer: Color get() = accentColorScheme.brightWhite.onColorContainer
}

@Composable
@ReadOnlyComposable
fun contentColorFor(backgroundColor: Color) =
    LunarTheme.colorScheme.contentColorFor(backgroundColor)
        .takeOrElse { LocalContentColor.current }

@Stable
fun LunarColorScheme.contentColorFor(backgroundColor: Color): Color = when (backgroundColor) {
    primary -> onPrimary
    secondary -> onSecondary
    tertiary -> onTertiary
    background -> onBackground
    error -> onError
    primaryContainer -> onPrimaryContainer
    secondaryContainer -> onSecondaryContainer
    tertiaryContainer -> onTertiaryContainer
    errorContainer -> onErrorContainer
    inverseSurface -> inverseOnSurface
    surface -> onSurface
    surfaceVariant -> onSurfaceVariant
    surfaceBright -> onSurface
    surfaceContainer -> onSurface
    surfaceContainerHigh -> onSurface
    surfaceContainerHighest -> onSurface
    surfaceContainerLow -> onSurface
    surfaceContainerLowest -> onSurface

    red -> onRed
    redContainer -> onRedContainer
    green -> onGreen
    greenContainer -> onGreenContainer
    yellow -> onYellow
    yellowContainer -> onYellowContainer
    blue -> onBlue
    blueContainer -> onBlueContainer
    magenta -> onMagenta
    magentaContainer -> onMagentaContainer
    cyan -> onCyan
    cyanContainer -> onCyanContainer
    brightRed -> onBrightRed
    brightRedContainer -> onBrightRedContainer
    brightGreen -> onBrightGreen
    brightGreenContainer -> onBrightGreenContainer
    brightYellow -> onBrightYellow
    brightYellowContainer -> onBrightYellowContainer
    brightBlue -> onBrightBlue
    brightBlueContainer -> onBrightBlueContainer
    brightMagenta -> onBrightMagenta
    brightMagentaContainer -> onBrightMagentaContainer
    brightCyan -> onBrightCyan
    brightCyanContainer -> onBrightCyanContainer
    black -> onBlack
    blackContainer -> onBlackContainer
    white -> onWhite
    whiteContainer -> onWhiteContainer
    brightBlack -> onBrightBlack
    brightBlackContainer -> onBrightBlackContainer
    brightWhite -> onBrightWhite
    brightWhiteContainer -> onBrightWhiteContainer
    else -> Color.Unspecified
}
