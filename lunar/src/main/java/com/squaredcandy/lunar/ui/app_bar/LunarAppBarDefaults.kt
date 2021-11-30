package com.squaredcandy.lunar.ui.app_bar

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object LunarAppBarDefaults {
    @Composable
    fun topAppBarElevation(): Dp {
        return if (isSystemInDarkTheme()) 0.dp else 4.dp
    }
}