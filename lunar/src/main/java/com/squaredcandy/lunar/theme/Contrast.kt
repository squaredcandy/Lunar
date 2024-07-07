package com.squaredcandy.lunar.theme

import android.app.UiModeManager
import android.content.Context
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.google.android.material.color.ColorContrast

@Composable
internal fun ColorScheme.applyContrast(
    mediumContrastColorScheme: ColorScheme,
    highContrastColorScheme: ColorScheme,
): ColorScheme {
    return applyContrast(
        mediumContrast = mediumContrastColorScheme,
        highContrast = highContrastColorScheme,
    )
}

@Composable
internal fun ExtendedColorScheme.applyContrast(
    mediumContrastExtendedColorScheme: ExtendedColorScheme,
    highContrastExtendedColorScheme: ExtendedColorScheme,
): ExtendedColorScheme {
    return applyContrast(
        mediumContrast = mediumContrastExtendedColorScheme,
        highContrast = highContrastExtendedColorScheme,
    )
}

@Composable
private fun <T> T.applyContrast(
    mediumContrast: T,
    highContrast: T,
): T {
    if (!ColorContrast.isContrastAvailable()) return this
    val context = LocalContext.current
    val uiModeService = remember(context) {
        context.getSystemService(Context.UI_MODE_SERVICE) as? UiModeManager
    } ?: return this
    val contrast = remember(uiModeService) { uiModeService.contrast }
    return when {
        contrast > HIGH_CONTRAST_THRESHOLD -> highContrast
        contrast > MEDIUM_CONTRAST_THRESHOLD -> mediumContrast
        else -> this
    }
}

/** Copied from [ColorContrast] */
private const val MEDIUM_CONTRAST_THRESHOLD = 1 / 3f
private const val HIGH_CONTRAST_THRESHOLD = 2 / 3f
