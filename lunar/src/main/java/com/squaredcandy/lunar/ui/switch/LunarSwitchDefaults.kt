package com.squaredcandy.lunar.ui.switch

import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SwitchColors
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import com.squaredcandy.lunar.theme.inversePrimaryVariant

object LunarSwitchDefaults {
    @Composable
    fun colors(
        checkedThumbColor: Color = MaterialTheme.colors.inversePrimaryVariant,
        checkedTrackColor: Color = checkedThumbColor,
        checkedTrackAlpha: Float = 0.54f,
        uncheckedThumbColor: Color = MaterialTheme.colors.surface,
        uncheckedTrackColor: Color = MaterialTheme.colors.onSurface,
        uncheckedTrackAlpha: Float = 0.38f,
        disabledCheckedThumbColor: Color = checkedThumbColor
            .copy(alpha = ContentAlpha.disabled)
            .compositeOver(MaterialTheme.colors.surface),
        disabledCheckedTrackColor: Color = checkedTrackColor
            .copy(alpha = ContentAlpha.disabled)
            .compositeOver(MaterialTheme.colors.surface),
        disabledUncheckedThumbColor: Color = uncheckedThumbColor
            .copy(alpha = ContentAlpha.disabled)
            .compositeOver(MaterialTheme.colors.surface),
        disabledUncheckedTrackColor: Color = uncheckedTrackColor
            .copy(alpha = ContentAlpha.disabled)
            .compositeOver(MaterialTheme.colors.surface)
    ): SwitchColors {
        return SwitchDefaults.colors(
            checkedThumbColor = checkedThumbColor,
            checkedTrackColor = checkedTrackColor,
            checkedTrackAlpha = checkedTrackAlpha,
            uncheckedThumbColor = uncheckedThumbColor,
            uncheckedTrackColor = uncheckedTrackColor,
            uncheckedTrackAlpha = uncheckedTrackAlpha,
            disabledCheckedThumbColor = disabledCheckedThumbColor,
            disabledCheckedTrackColor = disabledCheckedTrackColor,
            disabledUncheckedThumbColor = disabledUncheckedThumbColor,
            disabledUncheckedTrackColor = disabledUncheckedTrackColor,
        )
    }
}