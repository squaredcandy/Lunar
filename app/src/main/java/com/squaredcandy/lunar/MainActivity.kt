package com.squaredcandy.lunar

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.squaredcandy.lunar.lunar.LunarScreen
import com.squaredcandy.lunar.lunar3.Lunar3Screen
import com.squaredcandy.lunar.theme.LunarTheme
import com.squaredcandy.lunar.ui.app_bar.LunarAppBarDefaults

@ExperimentalMaterial3Api
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            val useMaterial3 = rememberSaveable { mutableStateOf(false) }
            val state = rememberSaveable { mutableStateOf(MainState.MainMenu) }

            when (state.value) {
                MainState.MainMenu -> MainMenu(state, useMaterial3)
                MainState.MaterialDemo -> LunarScreen(state)
                MainState.Material3Demo -> Lunar3Screen(this, state)
            }
        }
    }

    @Composable
    private fun MainMenu(
        setMainState: MutableState<MainState>,
        useMaterial3: MutableState<Boolean>,
    ) {
        if (useMaterial3.value) {
            Lunar3MainMenu(setMainState, useMaterial3)
        } else {
            LunarMainMenu(setMainState, useMaterial3)
        }
    }

    @Composable
    private fun Lunar3MainMenu(
        setMainState: MutableState<MainState>,
        useMaterial3: MutableState<Boolean>,
    ) {
        com.squaredcandy.lunar3.theme.LunarTheme(context = this) {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                Column {
                    SmallTopAppBar(
                        title = {
                            androidx.compose.material3.Text(text = "Lunar Theme Demo")
                        },
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        androidx.compose.material3.Text(text = "Use Material 3")

                        Spacer(modifier = Modifier.width(4.dp))

                        Checkbox(
                            checked = useMaterial3.value,
                            onCheckedChange = {
                                useMaterial3.value = it
                            },
                            colors = CheckboxDefaults.colors(
                                checkedColor = MaterialTheme.colorScheme.primaryContainer,
                                uncheckedColor = MaterialTheme.colorScheme.primaryContainer.copy(
                                    alpha = 0.6f
                                ),
                                checkmarkColor = MaterialTheme.colorScheme.onPrimaryContainer,
                                disabledColor = MaterialTheme.colorScheme.onSurface.copy(alpha = ContentAlpha.disabled),
                                disabledIndeterminateColor = MaterialTheme.colorScheme.surface.copy(
                                    alpha = ContentAlpha.disabled
                                ),
                            )
                        )
                    }

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        shape = RoundedCornerShape(20.0.dp),
                        content = {
                            androidx.compose.material3.Text(
                                modifier = Modifier.padding(16.dp),
                                text = "Material Demo",
                            )
                        },
                        onClick = {
                            setMainState.value = MainState.MaterialDemo
                        },
                        tonalElevation = 1.dp,
                    )

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        shape = RoundedCornerShape(20.0.dp),
                        content = {
                            androidx.compose.material3.Text(
                                modifier = Modifier.padding(16.dp),
                                text = "Material 3 Demo",
                            )
                        },
                        onClick = {
                            setMainState.value = MainState.Material3Demo
                        },
                        tonalElevation = 1.dp,
                    )
                }
            }
        }
    }

    @Composable
    private fun LunarMainMenu(
        mainState: MutableState<MainState>,
        useMaterial3: MutableState<Boolean>,
    ) {
        LunarTheme {
            androidx.compose.material.Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    TopAppBar(
                        title = {
                            Text(text = "Lunar Theme Demo")
                        },
                        elevation = LunarAppBarDefaults.topAppBarElevation()
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(text = "Use material 3")

                        Spacer(modifier = Modifier.width(4.dp))

                        Checkbox(
                            checked = useMaterial3.value,
                            onCheckedChange = {
                                useMaterial3.value = it
                            }
                        )
                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable {
                                mainState.value = MainState.MaterialDemo
                            },
                        content = {
                            Text(
                                modifier = Modifier.padding(16.dp),
                                text = "Material Demo",
                            )
                        },
                    )

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                            .clickable {
                                mainState.value = MainState.Material3Demo
                            },
                        content = {
                            Text(
                                modifier = Modifier.padding(16.dp),
                                text = "Material 3 Demo",
                            )
                        },
                    )
                }
            }
        }
    }
}


