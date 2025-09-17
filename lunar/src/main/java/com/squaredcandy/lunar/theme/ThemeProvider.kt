package com.squaredcandy.lunar.theme

import android.content.Context

typealias DarkThemeProvider = () -> Boolean
val NoDarkThemeProvider: DarkThemeProvider = { false }

typealias DynamicColorProvider = () -> Boolean
val DefaultDynamicColorProvider: DynamicColorProvider = { true }

typealias ContrastProvider = () -> Float?
val NoContrastProvider: ContrastProvider = { null }

typealias ContextProvider = () -> Context?
val NoContextProvider: ContextProvider = { null }

data class ThemeProvider(
    val darkThemeProvider: DarkThemeProvider = NoDarkThemeProvider,
    val dynamicColorProvider: DynamicColorProvider = DefaultDynamicColorProvider,
    val contrastProvider: ContrastProvider = NoContrastProvider,
    val contextProvider: ContextProvider = NoContextProvider,
)
