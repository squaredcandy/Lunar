package com.squaredcandy.lunar.lunar3

import android.content.Context
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.squaredcandy.lunar.MainState
import com.squaredcandy.lunar3.theme.LunarTheme
import com.squaredcandy.lunar_common.LunarIcons

@ExperimentalMaterial3Api
@Composable
fun Lunar3Screen(
    context: Context,
    state: MutableState<MainState>,
) {
    LunarTheme(context = context) {
        LunarMainPage(state)
    }
}

@ExperimentalMaterial3Api
@Composable
private fun LunarMainPage(
    state: MutableState<MainState>
) {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = {
                    Text(text = "Material 3 Theme Demo")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            state.value = MainState.MainMenu
                        },
                        content = {
                            Icon(
                                imageVector = LunarIcons.ArrowBack,
                                contentDescription = null
                            )
                        }
                    )
                },
            )
        },
        content = {

        }
    )
}