package com.squaredcandy.lunar.ui.radio_button

import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButtonColors
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.squaredcandy.lunar.theme.inversePrimary

object LunarRadioButtonDefaults {
    @Composable
    fun colors(
        selectedColor: Color = MaterialTheme.colors.inversePrimary,
        unselectedColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f),
        disabledColor: Color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled)
    ): RadioButtonColors {
        return RadioButtonDefaults.colors(selectedColor, unselectedColor, disabledColor)
    }
}
