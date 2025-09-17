package com.squaredcandy.lunar.theme

import android.app.UiModeManager
import android.content.Context
import android.content.res.Configuration
import com.google.android.material.color.ColorContrast

object LunarContextUtils {
    fun getThemeProvider(
        context: Context,
        overrideDarkTheme: Boolean? = null,
        overrideDynamicColor: Boolean? = null,
        overrideContrast: Float? = null,
    ) = ThemeProvider(
        darkThemeProvider = overrideDarkTheme?.let { { overrideDarkTheme} } ?: context.getDarkThemeProvider(),
        dynamicColorProvider = overrideDynamicColor?.let { { overrideDynamicColor } } ?: DefaultDynamicColorProvider,
        contrastProvider = overrideContrast?.let { { overrideContrast } } ?: context.getContrastProvider(),
        contextProvider = { context },
    )

    private fun Context.getDarkThemeProvider(): DarkThemeProvider = { isDarkTheme() }

    private fun Context.getContrastProvider(): ContrastProvider {
        if (!ColorContrast.isContrastAvailable()) return NoContrastProvider
        return ContrastProvider@{
            val uiModeService = getSystemService(Context.UI_MODE_SERVICE) as? UiModeManager
                ?: return@ContrastProvider null
            uiModeService.contrast
        }
    }

    fun Context.isDarkTheme(): Boolean {
        return resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    }
}
