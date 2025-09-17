package com.squaredcandy.lunar.theme

import androidx.compose.material3.ColorScheme
import com.google.android.material.color.ColorContrast

internal inline fun ColorScheme.applyContrast(
    contrastProvider: ContrastProvider,
    mediumContrastColorScheme: ColorScheme,
    highContrastColorScheme: ColorScheme,
): ColorScheme {
    return applyContrast(
        contrastProvider = contrastProvider,
        mediumContrast = mediumContrastColorScheme,
        highContrast = highContrastColorScheme,
    )
}

internal inline fun AccentColorScheme.applyContrast(
    contrastProvider: ContrastProvider,
    mediumContrastAccentColorScheme: AccentColorScheme,
    highContrastAccentColorScheme: AccentColorScheme,
): AccentColorScheme {
    return applyContrast(
        contrastProvider = contrastProvider,
        mediumContrast = mediumContrastAccentColorScheme,
        highContrast = highContrastAccentColorScheme,
    )
}

private inline fun <T> T.applyContrast(
    contrastProvider: ContrastProvider,
    mediumContrast: T,
    highContrast: T,
): T {
    val contrast = contrastProvider() ?: return this
    return when {
        contrast > HIGH_CONTRAST_THRESHOLD -> highContrast
        contrast > MEDIUM_CONTRAST_THRESHOLD -> mediumContrast
        else -> this
    }
}

/** Copied from [ColorContrast] */
private const val MEDIUM_CONTRAST_THRESHOLD = 1 / 3f
private const val HIGH_CONTRAST_THRESHOLD = 2 / 3f
