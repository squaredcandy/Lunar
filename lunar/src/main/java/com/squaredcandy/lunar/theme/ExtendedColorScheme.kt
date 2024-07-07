package com.squaredcandy.lunar.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

val LocalExtendedColorScheme = compositionLocalOf { extendedLight }

val MaterialTheme.extendedColorScheme: ExtendedColorScheme
    @Composable @ReadOnlyComposable get() = LocalExtendedColorScheme.current

@Stable
fun ExtendedColorScheme.contentColorFor(backgroundColor: Color): Color =
    when (backgroundColor) {
        red.color -> red.onColor
        red.colorContainer -> red.onColorContainer
        green.color -> green.onColor
        green.colorContainer -> green.onColorContainer
        yellow.color -> yellow.onColor
        yellow.colorContainer -> yellow.onColorContainer
        blue.color -> blue.onColor
        blue.colorContainer -> blue.onColorContainer
        magenta.color -> magenta.onColor
        magenta.colorContainer -> magenta.onColorContainer
        cyan.color -> cyan.onColor
        cyan.colorContainer -> cyan.onColorContainer
        brightRed.color -> brightRed.onColor
        brightRed.colorContainer -> brightRed.onColorContainer
        brightGreen.color -> brightGreen.onColor
        brightGreen.colorContainer -> brightGreen.onColorContainer
        brightYellow.color -> brightYellow.onColor
        brightYellow.colorContainer -> brightYellow.onColorContainer
        brightBlue.color -> brightBlue.onColor
        brightBlue.colorContainer -> brightBlue.onColorContainer
        brightMagenta.color -> brightMagenta.onColor
        brightMagenta.colorContainer -> brightMagenta.onColorContainer
        brightCyan.color -> brightCyan.onColor
        brightCyan.colorContainer -> brightCyan.onColorContainer
        black.color -> black.onColor
        black.colorContainer -> black.onColorContainer
        white.color -> white.onColor
        white.colorContainer -> white.onColorContainer
        brightBlack.color -> brightBlack.onColor
        brightBlack.colorContainer -> brightBlack.onColorContainer
        brightWhite.color -> brightWhite.onColor
        brightWhite.colorContainer -> brightWhite.onColorContainer
        else -> Color.Unspecified
    }
@Composable
internal fun getExtendedColorScheme(darkTheme: Boolean = isSystemInDarkTheme()): ExtendedColorScheme {
    return when {
        darkTheme -> extendedDark.applyContrast(extendedDarkMediumContrast, extendedDarkHighContrast)
        else -> extendedLight.applyContrast(extendedLightMediumContrast, extendedLightHighContrast)
    }
}

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color,
)

@Immutable
data class ExtendedColorScheme(
    val red: ColorFamily,
    val green: ColorFamily,
    val yellow: ColorFamily,
    val blue: ColorFamily,
    val magenta: ColorFamily,
    val cyan: ColorFamily,
    val brightRed: ColorFamily,
    val brightGreen: ColorFamily,
    val brightYellow: ColorFamily,
    val brightBlue: ColorFamily,
    val brightMagenta: ColorFamily,
    val brightCyan: ColorFamily,
    val black: ColorFamily,
    val white: ColorFamily,
    val brightBlack: ColorFamily,
    val brightWhite: ColorFamily,
)

val extendedLight = ExtendedColorScheme(
    red = ColorFamily(
        redLight,
        onRedLight,
        redContainerLight,
        onRedContainerLight,
    ),
    green = ColorFamily(
        greenLight,
        onGreenLight,
        greenContainerLight,
        onGreenContainerLight,
    ),
    yellow = ColorFamily(
        yellowLight,
        onYellowLight,
        yellowContainerLight,
        onYellowContainerLight,
    ),
    blue = ColorFamily(
        blueLight,
        onBlueLight,
        blueContainerLight,
        onBlueContainerLight,
    ),
    magenta = ColorFamily(
        magentaLight,
        onMagentaLight,
        magentaContainerLight,
        onMagentaContainerLight,
    ),
    cyan = ColorFamily(
        cyanLight,
        onCyanLight,
        cyanContainerLight,
        onCyanContainerLight,
    ),
    brightRed = ColorFamily(
        brightRedLight,
        onBrightRedLight,
        brightRedContainerLight,
        onBrightRedContainerLight,
    ),
    brightGreen = ColorFamily(
        brightGreenLight,
        onBrightGreenLight,
        brightGreenContainerLight,
        onBrightGreenContainerLight,
    ),
    brightYellow = ColorFamily(
        brightYellowLight,
        onBrightYellowLight,
        brightYellowContainerLight,
        onBrightYellowContainerLight,
    ),
    brightBlue = ColorFamily(
        brightBlueLight,
        onBrightBlueLight,
        brightBlueContainerLight,
        onBrightBlueContainerLight,
    ),
    brightMagenta = ColorFamily(
        brightMagentaLight,
        onBrightMagentaLight,
        brightMagentaContainerLight,
        onBrightMagentaContainerLight,
    ),
    brightCyan = ColorFamily(
        brightCyanLight,
        onBrightCyanLight,
        brightCyanContainerLight,
        onBrightCyanContainerLight,
    ),
    black = ColorFamily(
        blackLight,
        onBlackLight,
        blackContainerLight,
        onBlackContainerLight,
    ),
    white = ColorFamily(
        whiteLight,
        onWhiteLight,
        whiteContainerLight,
        onWhiteContainerLight,
    ),
    brightBlack = ColorFamily(
        brightBlackLight,
        onBrightBlackLight,
        brightBlackContainerLight,
        onBrightBlackContainerLight,
    ),
    brightWhite = ColorFamily(
        brightWhiteLight,
        onBrightWhiteLight,
        brightWhiteContainerLight,
        onBrightWhiteContainerLight,
    ),
)

val extendedDark = ExtendedColorScheme(
    red = ColorFamily(
        redDark,
        onRedDark,
        redContainerDark,
        onRedContainerDark,
    ),
    green = ColorFamily(
        greenDark,
        onGreenDark,
        greenContainerDark,
        onGreenContainerDark,
    ),
    yellow = ColorFamily(
        yellowDark,
        onYellowDark,
        yellowContainerDark,
        onYellowContainerDark,
    ),
    blue = ColorFamily(
        blueDark,
        onBlueDark,
        blueContainerDark,
        onBlueContainerDark,
    ),
    magenta = ColorFamily(
        magentaDark,
        onMagentaDark,
        magentaContainerDark,
        onMagentaContainerDark,
    ),
    cyan = ColorFamily(
        cyanDark,
        onCyanDark,
        cyanContainerDark,
        onCyanContainerDark,
    ),
    brightRed = ColorFamily(
        brightRedDark,
        onBrightRedDark,
        brightRedContainerDark,
        onBrightRedContainerDark,
    ),
    brightGreen = ColorFamily(
        brightGreenDark,
        onBrightGreenDark,
        brightGreenContainerDark,
        onBrightGreenContainerDark,
    ),
    brightYellow = ColorFamily(
        brightYellowDark,
        onBrightYellowDark,
        brightYellowContainerDark,
        onBrightYellowContainerDark,
    ),
    brightBlue = ColorFamily(
        brightBlueDark,
        onBrightBlueDark,
        brightBlueContainerDark,
        onBrightBlueContainerDark,
    ),
    brightMagenta = ColorFamily(
        brightMagentaDark,
        onBrightMagentaDark,
        brightMagentaContainerDark,
        onBrightMagentaContainerDark,
    ),
    brightCyan = ColorFamily(
        brightCyanDark,
        onBrightCyanDark,
        brightCyanContainerDark,
        onBrightCyanContainerDark,
    ),
    black = ColorFamily(
        blackDark,
        onBlackDark,
        blackContainerDark,
        onBlackContainerDark,
    ),
    white = ColorFamily(
        whiteDark,
        onWhiteDark,
        whiteContainerDark,
        onWhiteContainerDark,
    ),
    brightBlack = ColorFamily(
        brightBlackDark,
        onBrightBlackDark,
        brightBlackContainerDark,
        onBrightBlackContainerDark,
    ),
    brightWhite = ColorFamily(
        brightWhiteDark,
        onBrightWhiteDark,
        brightWhiteContainerDark,
        onBrightWhiteContainerDark,
    ),
)

val extendedLightMediumContrast = ExtendedColorScheme(
    red = ColorFamily(
        redLightMediumContrast,
        onRedLightMediumContrast,
        redContainerLightMediumContrast,
        onRedContainerLightMediumContrast,
    ),
    green = ColorFamily(
        greenLightMediumContrast,
        onGreenLightMediumContrast,
        greenContainerLightMediumContrast,
        onGreenContainerLightMediumContrast,
    ),
    yellow = ColorFamily(
        yellowLightMediumContrast,
        onYellowLightMediumContrast,
        yellowContainerLightMediumContrast,
        onYellowContainerLightMediumContrast,
    ),
    blue = ColorFamily(
        blueLightMediumContrast,
        onBlueLightMediumContrast,
        blueContainerLightMediumContrast,
        onBlueContainerLightMediumContrast,
    ),
    magenta = ColorFamily(
        magentaLightMediumContrast,
        onMagentaLightMediumContrast,
        magentaContainerLightMediumContrast,
        onMagentaContainerLightMediumContrast,
    ),
    cyan = ColorFamily(
        cyanLightMediumContrast,
        onCyanLightMediumContrast,
        cyanContainerLightMediumContrast,
        onCyanContainerLightMediumContrast,
    ),
    brightRed = ColorFamily(
        brightRedLightMediumContrast,
        onBrightRedLightMediumContrast,
        brightRedContainerLightMediumContrast,
        onBrightRedContainerLightMediumContrast,
    ),
    brightGreen = ColorFamily(
        brightGreenLightMediumContrast,
        onBrightGreenLightMediumContrast,
        brightGreenContainerLightMediumContrast,
        onBrightGreenContainerLightMediumContrast,
    ),
    brightYellow = ColorFamily(
        brightYellowLightMediumContrast,
        onBrightYellowLightMediumContrast,
        brightYellowContainerLightMediumContrast,
        onBrightYellowContainerLightMediumContrast,
    ),
    brightBlue = ColorFamily(
        brightBlueLightMediumContrast,
        onBrightBlueLightMediumContrast,
        brightBlueContainerLightMediumContrast,
        onBrightBlueContainerLightMediumContrast,
    ),
    brightMagenta = ColorFamily(
        brightMagentaLightMediumContrast,
        onBrightMagentaLightMediumContrast,
        brightMagentaContainerLightMediumContrast,
        onBrightMagentaContainerLightMediumContrast,
    ),
    brightCyan = ColorFamily(
        brightCyanLightMediumContrast,
        onBrightCyanLightMediumContrast,
        brightCyanContainerLightMediumContrast,
        onBrightCyanContainerLightMediumContrast,
    ),
    black = ColorFamily(
        blackLightMediumContrast,
        onBlackLightMediumContrast,
        blackContainerLightMediumContrast,
        onBlackContainerLightMediumContrast,
    ),
    white = ColorFamily(
        whiteLightMediumContrast,
        onWhiteLightMediumContrast,
        whiteContainerLightMediumContrast,
        onWhiteContainerLightMediumContrast,
    ),
    brightBlack = ColorFamily(
        brightBlackLightMediumContrast,
        onBrightBlackLightMediumContrast,
        brightBlackContainerLightMediumContrast,
        onBrightBlackContainerLightMediumContrast,
    ),
    brightWhite = ColorFamily(
        brightWhiteLightMediumContrast,
        onBrightWhiteLightMediumContrast,
        brightWhiteContainerLightMediumContrast,
        onBrightWhiteContainerLightMediumContrast,
    ),
)

val extendedLightHighContrast = ExtendedColorScheme(
    red = ColorFamily(
        redLightHighContrast,
        onRedLightHighContrast,
        redContainerLightHighContrast,
        onRedContainerLightHighContrast,
    ),
    green = ColorFamily(
        greenLightHighContrast,
        onGreenLightHighContrast,
        greenContainerLightHighContrast,
        onGreenContainerLightHighContrast,
    ),
    yellow = ColorFamily(
        yellowLightHighContrast,
        onYellowLightHighContrast,
        yellowContainerLightHighContrast,
        onYellowContainerLightHighContrast,
    ),
    blue = ColorFamily(
        blueLightHighContrast,
        onBlueLightHighContrast,
        blueContainerLightHighContrast,
        onBlueContainerLightHighContrast,
    ),
    magenta = ColorFamily(
        magentaLightHighContrast,
        onMagentaLightHighContrast,
        magentaContainerLightHighContrast,
        onMagentaContainerLightHighContrast,
    ),
    cyan = ColorFamily(
        cyanLightHighContrast,
        onCyanLightHighContrast,
        cyanContainerLightHighContrast,
        onCyanContainerLightHighContrast,
    ),
    brightRed = ColorFamily(
        brightRedLightHighContrast,
        onBrightRedLightHighContrast,
        brightRedContainerLightHighContrast,
        onBrightRedContainerLightHighContrast,
    ),
    brightGreen = ColorFamily(
        brightGreenLightHighContrast,
        onBrightGreenLightHighContrast,
        brightGreenContainerLightHighContrast,
        onBrightGreenContainerLightHighContrast,
    ),
    brightYellow = ColorFamily(
        brightYellowLightHighContrast,
        onBrightYellowLightHighContrast,
        brightYellowContainerLightHighContrast,
        onBrightYellowContainerLightHighContrast,
    ),
    brightBlue = ColorFamily(
        brightBlueLightHighContrast,
        onBrightBlueLightHighContrast,
        brightBlueContainerLightHighContrast,
        onBrightBlueContainerLightHighContrast,
    ),
    brightMagenta = ColorFamily(
        brightMagentaLightHighContrast,
        onBrightMagentaLightHighContrast,
        brightMagentaContainerLightHighContrast,
        onBrightMagentaContainerLightHighContrast,
    ),
    brightCyan = ColorFamily(
        brightCyanLightHighContrast,
        onBrightCyanLightHighContrast,
        brightCyanContainerLightHighContrast,
        onBrightCyanContainerLightHighContrast,
    ),
    black = ColorFamily(
        blackLightHighContrast,
        onBlackLightHighContrast,
        blackContainerLightHighContrast,
        onBlackContainerLightHighContrast,
    ),
    white = ColorFamily(
        whiteLightHighContrast,
        onWhiteLightHighContrast,
        whiteContainerLightHighContrast,
        onWhiteContainerLightHighContrast,
    ),
    brightBlack = ColorFamily(
        brightBlackLightHighContrast,
        onBrightBlackLightHighContrast,
        brightBlackContainerLightHighContrast,
        onBrightBlackContainerLightHighContrast,
    ),
    brightWhite = ColorFamily(
        brightWhiteLightHighContrast,
        onBrightWhiteLightHighContrast,
        brightWhiteContainerLightHighContrast,
        onBrightWhiteContainerLightHighContrast,
    ),
)

val extendedDarkMediumContrast = ExtendedColorScheme(
    red = ColorFamily(
        redDarkMediumContrast,
        onRedDarkMediumContrast,
        redContainerDarkMediumContrast,
        onRedContainerDarkMediumContrast,
    ),
    green = ColorFamily(
        greenDarkMediumContrast,
        onGreenDarkMediumContrast,
        greenContainerDarkMediumContrast,
        onGreenContainerDarkMediumContrast,
    ),
    yellow = ColorFamily(
        yellowDarkMediumContrast,
        onYellowDarkMediumContrast,
        yellowContainerDarkMediumContrast,
        onYellowContainerDarkMediumContrast,
    ),
    blue = ColorFamily(
        blueDarkMediumContrast,
        onBlueDarkMediumContrast,
        blueContainerDarkMediumContrast,
        onBlueContainerDarkMediumContrast,
    ),
    magenta = ColorFamily(
        magentaDarkMediumContrast,
        onMagentaDarkMediumContrast,
        magentaContainerDarkMediumContrast,
        onMagentaContainerDarkMediumContrast,
    ),
    cyan = ColorFamily(
        cyanDarkMediumContrast,
        onCyanDarkMediumContrast,
        cyanContainerDarkMediumContrast,
        onCyanContainerDarkMediumContrast,
    ),
    brightRed = ColorFamily(
        brightRedDarkMediumContrast,
        onBrightRedDarkMediumContrast,
        brightRedContainerDarkMediumContrast,
        onBrightRedContainerDarkMediumContrast,
    ),
    brightGreen = ColorFamily(
        brightGreenDarkMediumContrast,
        onBrightGreenDarkMediumContrast,
        brightGreenContainerDarkMediumContrast,
        onBrightGreenContainerDarkMediumContrast,
    ),
    brightYellow = ColorFamily(
        brightYellowDarkMediumContrast,
        onBrightYellowDarkMediumContrast,
        brightYellowContainerDarkMediumContrast,
        onBrightYellowContainerDarkMediumContrast,
    ),
    brightBlue = ColorFamily(
        brightBlueDarkMediumContrast,
        onBrightBlueDarkMediumContrast,
        brightBlueContainerDarkMediumContrast,
        onBrightBlueContainerDarkMediumContrast,
    ),
    brightMagenta = ColorFamily(
        brightMagentaDarkMediumContrast,
        onBrightMagentaDarkMediumContrast,
        brightMagentaContainerDarkMediumContrast,
        onBrightMagentaContainerDarkMediumContrast,
    ),
    brightCyan = ColorFamily(
        brightCyanDarkMediumContrast,
        onBrightCyanDarkMediumContrast,
        brightCyanContainerDarkMediumContrast,
        onBrightCyanContainerDarkMediumContrast,
    ),
    black = ColorFamily(
        blackDarkMediumContrast,
        onBlackDarkMediumContrast,
        blackContainerDarkMediumContrast,
        onBlackContainerDarkMediumContrast,
    ),
    white = ColorFamily(
        whiteDarkMediumContrast,
        onWhiteDarkMediumContrast,
        whiteContainerDarkMediumContrast,
        onWhiteContainerDarkMediumContrast,
    ),
    brightBlack = ColorFamily(
        brightBlackDarkMediumContrast,
        onBrightBlackDarkMediumContrast,
        brightBlackContainerDarkMediumContrast,
        onBrightBlackContainerDarkMediumContrast,
    ),
    brightWhite = ColorFamily(
        brightWhiteDarkMediumContrast,
        onBrightWhiteDarkMediumContrast,
        brightWhiteContainerDarkMediumContrast,
        onBrightWhiteContainerDarkMediumContrast,
    ),
)

val extendedDarkHighContrast = ExtendedColorScheme(
    red = ColorFamily(
        redDarkHighContrast,
        onRedDarkHighContrast,
        redContainerDarkHighContrast,
        onRedContainerDarkHighContrast,
    ),
    green = ColorFamily(
        greenDarkHighContrast,
        onGreenDarkHighContrast,
        greenContainerDarkHighContrast,
        onGreenContainerDarkHighContrast,
    ),
    yellow = ColorFamily(
        yellowDarkHighContrast,
        onYellowDarkHighContrast,
        yellowContainerDarkHighContrast,
        onYellowContainerDarkHighContrast,
    ),
    blue = ColorFamily(
        blueDarkHighContrast,
        onBlueDarkHighContrast,
        blueContainerDarkHighContrast,
        onBlueContainerDarkHighContrast,
    ),
    magenta = ColorFamily(
        magentaDarkHighContrast,
        onMagentaDarkHighContrast,
        magentaContainerDarkHighContrast,
        onMagentaContainerDarkHighContrast,
    ),
    cyan = ColorFamily(
        cyanDarkHighContrast,
        onCyanDarkHighContrast,
        cyanContainerDarkHighContrast,
        onCyanContainerDarkHighContrast,
    ),
    brightRed = ColorFamily(
        brightRedDarkHighContrast,
        onBrightRedDarkHighContrast,
        brightRedContainerDarkHighContrast,
        onBrightRedContainerDarkHighContrast,
    ),
    brightGreen = ColorFamily(
        brightGreenDarkHighContrast,
        onBrightGreenDarkHighContrast,
        brightGreenContainerDarkHighContrast,
        onBrightGreenContainerDarkHighContrast,
    ),
    brightYellow = ColorFamily(
        brightYellowDarkHighContrast,
        onBrightYellowDarkHighContrast,
        brightYellowContainerDarkHighContrast,
        onBrightYellowContainerDarkHighContrast,
    ),
    brightBlue = ColorFamily(
        brightBlueDarkHighContrast,
        onBrightBlueDarkHighContrast,
        brightBlueContainerDarkHighContrast,
        onBrightBlueContainerDarkHighContrast,
    ),
    brightMagenta = ColorFamily(
        brightMagentaDarkHighContrast,
        onBrightMagentaDarkHighContrast,
        brightMagentaContainerDarkHighContrast,
        onBrightMagentaContainerDarkHighContrast,
    ),
    brightCyan = ColorFamily(
        brightCyanDarkHighContrast,
        onBrightCyanDarkHighContrast,
        brightCyanContainerDarkHighContrast,
        onBrightCyanContainerDarkHighContrast,
    ),
    black = ColorFamily(
        blackDarkHighContrast,
        onBlackDarkHighContrast,
        blackContainerDarkHighContrast,
        onBlackContainerDarkHighContrast,
    ),
    white = ColorFamily(
        whiteDarkHighContrast,
        onWhiteDarkHighContrast,
        whiteContainerDarkHighContrast,
        onWhiteContainerDarkHighContrast,
    ),
    brightBlack = ColorFamily(
        brightBlackDarkHighContrast,
        onBrightBlackDarkHighContrast,
        brightBlackContainerDarkHighContrast,
        onBrightBlackContainerDarkHighContrast,
    ),
    brightWhite = ColorFamily(
        brightWhiteDarkHighContrast,
        onBrightWhiteDarkHighContrast,
        brightWhiteContainerDarkHighContrast,
        onBrightWhiteContainerDarkHighContrast,
    ),
)
