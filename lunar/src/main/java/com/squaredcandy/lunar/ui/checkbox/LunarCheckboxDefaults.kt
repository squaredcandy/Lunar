package com.squaredcandy.lunar.ui.checkbox

import androidx.compose.material.CheckboxColors
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.squaredcandy.lunar.theme.inversePrimary

object LunarCheckboxDefaults {
    @Composable
    fun colors(
        checkedColor: Color = MaterialTheme.colors.inversePrimary,
        uncheckedColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.6f),
        checkmarkColor: Color = MaterialTheme.colors.surface,
        disabledColor: Color = MaterialTheme.colors.onSurface.copy(alpha = ContentAlpha.disabled),
        disabledIndeterminateColor: Color = checkedColor.copy(alpha = ContentAlpha.disabled)
    ): CheckboxColors {
        return CheckboxDefaults.colors(
            checkedColor = checkedColor,
            uncheckedColor = uncheckedColor,
            checkmarkColor = checkmarkColor,
            disabledColor = disabledColor,
            disabledIndeterminateColor = disabledIndeterminateColor,
        )
    }
}