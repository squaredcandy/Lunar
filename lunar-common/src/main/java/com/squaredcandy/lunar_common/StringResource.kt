package com.squaredcandy.lunar_common

import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext

/**
 * Interface denoting that this is a string resource.
 */
interface StringResource {
    fun resolve(resources: Resources): String
}

@Composable
@ReadOnlyComposable
fun StringResource.resolve(): String {
    LocalConfiguration.current
    return resolve(LocalContext.current.resources)
}