package com.squaredcandy.lunar.theme

import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MotionScheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object LunarTheme {
    val colorScheme: LunarColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalLunarColorScheme.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.typography

    /**
     * Retrieves the current [Shapes] at the call site's position in the hierarchy.
     */
    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.shapes

    @OptIn(ExperimentalMaterial3ExpressiveApi::class)
    val motionScheme: MotionScheme
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.motionScheme
}
