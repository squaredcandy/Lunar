package com.squaredcandy.lunar.lunar

import androidx.compose.animation.*
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.squaredcandy.lunar.MainState
import com.squaredcandy.lunar.theme.LunarTheme
import com.squaredcandy.lunar.theme.surfacePrimary
import com.squaredcandy.lunar.ui.app_bar.LunarTopAppBar
import com.squaredcandy.lunar.ui.checkbox.LunarCheckbox
import com.squaredcandy.lunar.ui.checkbox.LunarTriStateCheckbox
import com.squaredcandy.lunar.ui.float_action_button.LunarExtendedFloatingActionButton
import com.squaredcandy.lunar.ui.float_action_button.LunarFloatingActionButton
import com.squaredcandy.lunar.ui.radio_button.LunarRadioButton
import com.squaredcandy.lunar.ui.switch.LunarSwitch
import com.squaredcandy.lunar_common.LunarIcons

@Composable
fun LunarScreen(
    state: MutableState<MainState>,
) {
    LunarTheme {
        LunarMainPage(state)
    }
}

@Composable
private fun LunarMainPage(
    state: MutableState<MainState>,
) {
    var morePopupVisible by remember { mutableStateOf(false) }
    val lazyListState = rememberLazyListState()

    val demoList = listOf(
        typographyDemo(),
        buttonDemo(),
        checkBoxDemo(),
        progressIndicatorDemo(),
        dialogDemo(),
        sliderDemo(),
        tabDemo(),
        textFieldDemo(),
        bottomNavigation(),
    )

    // Dropdown Menu
    // Bottom Navigation
    // Top app bar
    // Bottom app bar
    // Snackbar
    // Modal Drawer
    // Bottom Drawer
    // Backdrop

    Scaffold(
        topBar = {
            LunarTopAppBar(
                title = {
                    Text(
                        text = "Material Theme Demo",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
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
                actions = {
                    IconButton(
                        onClick = {
                            morePopupVisible = true
                        },
                        content = {
                            Icon(
                                imageVector = LunarIcons.MoreVert,
                                contentDescription = null
                            )
                        }
                    )
                    if (morePopupVisible) {
                        Popup(
                            onDismissRequest = {
                                morePopupVisible = false
                            },
                            properties = PopupProperties()
                        ) {
                            Card(
                                modifier = Modifier.padding(4.dp)
                            ) {
                                Box(
                                    modifier = Modifier.padding(vertical = 12.dp)
                                ) {
                                    Text(
                                        text = "Click on me",
                                        modifier = Modifier
                                            .clickable {
                                                morePopupVisible = false
                                            }
                                            .padding(horizontal = 12.dp, vertical = 8.dp)
                                    )
                                }
                            }
                        }
                    }
                },
            )
        },
        content = {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
            ) {
                LazyColumn(state = lazyListState) {
                    demoList.forEach { it() }
                }
            }
        },
    )
}

@Composable
private fun typographyDemo(): LazyListScope.() -> Unit {
    return section(title = "Typography Demo") {
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header1",
            style = MaterialTheme.typography.h1,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header2",
            style = MaterialTheme.typography.h2,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header3",
            style = MaterialTheme.typography.h3,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header4",
            style = MaterialTheme.typography.h4,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header5",
            style = MaterialTheme.typography.h5,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Header6",
            style = MaterialTheme.typography.h6,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Subtitle1",
            style = MaterialTheme.typography.subtitle1,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Subtitle2",
            style = MaterialTheme.typography.subtitle2,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Body1",
            style = MaterialTheme.typography.body1,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Body2",
            style = MaterialTheme.typography.body2,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Caption",
            style = MaterialTheme.typography.caption,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Overline",
            style = MaterialTheme.typography.overline,
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = "Button",
            style = MaterialTheme.typography.button,
        )
    }
}

@Composable
private fun buttonDemo(): LazyListScope.() -> Unit {
    return section(
        title = "Button Demo",
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Tap button title to enable/disable button",
            style = MaterialTheme.typography.caption
        )
        Spacer(modifier = Modifier.height(8.dp))

        SubSectionWithEnabled(
            text = "Default Button",
            content = { enabled ->
                Button(
                    onClick = {},
                    content = { Text(text = if (enabled) "Enabled Button" else "Disabled Button") },
                    enabled = enabled,
                )
            },
        )

        SubSectionWithEnabled(
            text = "Icon Button",
            content = { enabled ->
                IconButton(
                    onClick = {},
                    content = { SearchIcon() },
                    enabled = enabled,
                )
            },
        )

        SubSectionWithEnabled(
            text = "Outline Button",
            content = { enabled ->
                OutlinedButton(
                    onClick = {},
                    content = { Text(text = if (enabled) "Enabled Button" else "Disabled Button") },
                    enabled = enabled
                )
            },
        )

        SubSectionWithEnabled(
            text = "Text Button",
            content = { enabled ->
                TextButton(
                    onClick = {},
                    enabled = enabled,
                    content = { Text(text = if (enabled) "Enabled Button" else "Disabled Button") },
                )
            }
        )

        var iconToggleButtonChecked by rememberSaveable { mutableStateOf(false) }
        SubSectionWithEnabled(
            text = "Icon Toggle Button",
            content = { enabled ->
                IconToggleButton(
                    checked = iconToggleButtonChecked,
                    onCheckedChange = { iconToggleButtonChecked = !iconToggleButtonChecked },
                    content = { SearchIcon() },
                    enabled = enabled
                )
            },
        )

        var radioButtonSelectedIndex by rememberSaveable { mutableStateOf(0) }
        SubSectionWithEnabled(
            text = "Radio Button",
            content = { enabled ->
                LunarRadioButton(
                    selected = radioButtonSelectedIndex == 0,
                    onClick = { radioButtonSelectedIndex = 0 },
                    enabled = enabled,
                )

                LunarRadioButton(
                    selected = radioButtonSelectedIndex == 1,
                    onClick = { radioButtonSelectedIndex = 1 },
                    enabled = enabled,
                )

                LunarRadioButton(
                    selected = radioButtonSelectedIndex == 2,
                    onClick = { radioButtonSelectedIndex = 2 },
                    enabled = enabled,
                )
            }
        )

        SubSection(
            text = "Floating Action Button",
            content = {
                LunarFloatingActionButton(
                    onClick = {},
                    content = { SearchIcon() },
                )
            },
        )

        SubSection(
            text = "Extended Floating Action Button",
            content = {
                LunarExtendedFloatingActionButton(
                    onClick = { },
                    text = {
                        Text(text = "Extended Floating Action Button")
                    },
                    icon = {
                        Icon(imageVector = LunarIcons.Search, contentDescription = null)
                    },
                )
            }
        )

        var switchChecked by rememberSaveable { mutableStateOf(false) }
        SubSectionWithEnabled(
            text = "Switch",
            content = { enabled ->
                LunarSwitch(
                    checked = switchChecked,
                    onCheckedChange = { switchChecked = !switchChecked },
                    enabled = enabled,
                )
            }
        )
    }
}

@Composable
private fun checkBoxDemo(): LazyListScope.() -> Unit {
    return section(
        title = "CheckBox Demo",
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var checkboxChecked by rememberSaveable { mutableStateOf(false) }
        SubSectionWithEnabled(text = "Checkbox") { enabled ->
            LunarCheckbox(
                checked = checkboxChecked,
                onCheckedChange = { checkboxChecked = !checkboxChecked },
                enabled = enabled,
            )
        }

        var triCheckboxState by rememberSaveable { mutableStateOf(ToggleableState.Off) }
        SubSectionWithEnabled(text = "TriStateCheckbox") { enabled ->
            LunarTriStateCheckbox(
                state = triCheckboxState,
                onClick = {
                    val newIndex = (triCheckboxState.ordinal + 1) % ToggleableState.values().size
                    triCheckboxState = ToggleableState.values()[newIndex]
                },
                enabled = enabled,
            )
        }
    }
}

@Composable
private fun progressIndicatorDemo(): LazyListScope.() -> Unit {
    return section(
        title = "Progress Indicator Demo",
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val infiniteTransition = rememberInfiniteTransition()
        val progress by infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = 1f,
            animationSpec = infiniteRepeatable(animation = tween(durationMillis = 3000))
        )

        SubSection(
            text = "Linear Progress Indicator",
        ) {
            LinearProgressIndicator(progress = progress)
        }

        SubSection(
            text = "Indeterminate Linear Progress Indicator",
        ) {
            LinearProgressIndicator()
        }

        SubSection(
            text = "Circular Progress Indicator",
        ) {
            CircularProgressIndicator(progress = progress)
        }

        SubSection(
            text = "Indeterminate Circular Progress Indicator",
        ) {
            CircularProgressIndicator()
        }

    }
}

@Composable
private fun dialogDemo(): LazyListScope.() -> Unit {
    return section(
        title = "Dialog Demo",
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var showAlertDialog by rememberSaveable { mutableStateOf(false) }

        Button(
            onClick = { showAlertDialog = true },
            content = { Text(text = "Show Alert Dialog") }
        )

        if (showAlertDialog) {
            AlertDialog(
                onDismissRequest = { showAlertDialog = false },
                confirmButton = {
                    TextButton(
                        onClick = { showAlertDialog = false },
                        content = { Text(text = "Confirm") }
                    )
                },
                dismissButton = {
                    TextButton(
                        onClick = { showAlertDialog = false },
                        content = { Text(text = "Dismiss") }
                    )
                },
                title = {
                    Text(text = "Sample Title")
                },
                text = {
                    Text(text = "Sample Content")
                },
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun sliderDemo(): LazyListScope.() -> Unit {
    return section(title = "Slider Demo") {
        var slider by rememberSaveable { mutableStateOf(0f) }
        SubSectionWithEnabled(text = "Slider") { enabled ->
            Slider(
                modifier = Modifier.padding(horizontal = 16.dp),
                value = slider,
                onValueChange = { slider = it },
                enabled = enabled,
            )
        }

        Box(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            var rangeSlider by remember { mutableStateOf(0f..0f) }
            SubSectionWithEnabled(text = "Range Slider") { enabled ->
                RangeSlider(
                    values = rangeSlider,
                    onValueChange = { rangeSlider = it },
                    enabled = enabled,
                    valueRange = 0f..100f
                )
            }
        }
    }
}

@Composable
private fun tabDemo(): LazyListScope.() -> Unit {
    return section(
        modifier = Modifier.padding(horizontal = 16.dp),
        title = "Tab Demo",
    ) {
        val tabs = listOf(
            "Tab 1",
            "Tab 2",
            "Tab 3",
            "Tab 4",
            "Tab 5",
        )

        var tabIndex by rememberSaveable { mutableStateOf(0) }
        SubSection(text = "Tab Row") {
            TabRow(
                selectedTabIndex = tabIndex,
                tabs = {
                    tabs.forEachIndexed { index, s ->
                        Tab(
                            selected = index == tabIndex,
                            onClick = { tabIndex = index },
                            text = {
                                Text(text = s)
                            }
                        )
                    }
                }
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        var scrollableTabIndex by rememberSaveable { mutableStateOf(0) }
        SubSection(text = "Scrollable Tab Row") {
            ScrollableTabRow(
                selectedTabIndex = scrollableTabIndex,
                tabs = {
                    tabs.forEachIndexed { index, s ->
                        Tab(
                            selected = index == scrollableTabIndex,
                            onClick = { scrollableTabIndex = index },
                            text = {
                                Text(text = s)
                            }
                        )
                    }
                }
            )
        }
    }
}

@Composable
private fun textFieldDemo(): LazyListScope.() -> Unit {
    return section(
        title = "Text Field Demo",
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 32.dp)
    ) {
        var textFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Text Field") { enabled ->
            TextField(
                value = textFieldValue,
                onValueChange = { textFieldValue = it },
                enabled = enabled,
                placeholder = {
                    Text(text = "Some placeholder text")
                },
                label = {
                    Text(text = "Default text field")
                },
            )
        }

        var errorTextFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Text Field with error") { enabled ->
            TextField(
                value = errorTextFieldValue,
                onValueChange = { errorTextFieldValue = it },
                enabled = enabled,
                isError = true,
                label = {
                    Text(text = "Error label")
                },
            )
        }

        SubSectionWithEnabled(text = "Read-Only Text Field") { enabled ->
            TextField(
                value = "Read only value",
                onValueChange = { },
                enabled = enabled,
                readOnly = true,
                label = {
                    Text(text = "Read only label")
                },
            )
        }

        var iconsTextFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Text Field with leading and trailing icon") { enabled ->
            TextField(
                value = iconsTextFieldValue,
                onValueChange = { iconsTextFieldValue = it },
                enabled = enabled,
                placeholder = {
                    Text(text = "100")
                },
                label = {
                    Text(text = "Price")
                },
                leadingIcon = {
                    Text(text = "$")
                },
                trailingIcon = {
                    Text(text = ".00")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
        }

        var outlineTextFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Outline Text Field") { enabled ->
            OutlinedTextField(
                value = outlineTextFieldValue,
                onValueChange = { outlineTextFieldValue = it },
                enabled = enabled,
                placeholder = {
                    Text(text = "Some placeholder text")
                },
                label = {
                    Text(text = "Default outline text field")
                },
            )
        }

        var errorOutlineTextFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Outline Text Field with error") { enabled ->
            OutlinedTextField(
                value = errorOutlineTextFieldValue,
                onValueChange = { errorOutlineTextFieldValue = it },
                enabled = enabled,
                isError = true,
                label = {
                    Text(text = "Outline error label")
                },
            )
        }

        SubSectionWithEnabled(text = "Outline Read-Only Text Field") { enabled ->
            OutlinedTextField(
                value = "Read only value",
                onValueChange = { },
                enabled = enabled,
                readOnly = true,
                label = {
                    Text(text = "Outline read only label")
                },
            )
        }

        var outlineIconsTextFieldValue by rememberSaveable(stateSaver = TextFieldValue.Saver) {
            mutableStateOf(TextFieldValue())
        }
        SubSectionWithEnabled(text = "Text Field with leading and trailing icon") { enabled ->
            OutlinedTextField(
                value = outlineIconsTextFieldValue,
                onValueChange = { outlineIconsTextFieldValue = it },
                enabled = enabled,
                placeholder = {
                    Text(text = "100")
                },
                label = {
                    Text(text = "Price")
                },
                leadingIcon = {
                    Text(text = "$")
                },
                trailingIcon = {
                    Text(text = ".00")
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
        }
    }
}

@Composable
private fun bottomNavigation(): LazyListScope.() -> Unit {
    val bottomNavigationList = listOf(
        "Item 1",
        "Item 2",
        "Item 3",
        "Item 4",
    )
    var selectedIndex by rememberSaveable { mutableStateOf(0) }
    return section(title = "Bottom Navigation") {
        SubSectionWithEnabled(text = "Bottom") { enabled ->
            BottomNavigation {
                bottomNavigationList.forEachIndexed { index, item ->
                    BottomNavigationItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = { Icon(imageVector = LunarIcons.Home, contentDescription = null) },
                        label = { Text(text = item) },
                        selectedContentColor = MaterialTheme.colors.surfacePrimary,
                        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.medium),
                        enabled = enabled,
                    )
                }
            }
        }
    }
}

@Composable
private fun SearchIcon() {
    Icon(imageVector = LunarIcons.Search, contentDescription = null)
}

@Composable
private fun SubSection(
    text: String,
    content: @Composable RowScope.() -> Unit,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = text,
                style = MaterialTheme.typography.subtitle2,
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            content()
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Composable
private fun SubSectionWithEnabled(
    text: String,
    content: @Composable RowScope.(enabled: Boolean) -> Unit,
) {
    var enabled by rememberSaveable { mutableStateOf(true) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                modifier = Modifier.clickable(
                    onClick = {
                        enabled = !enabled
                    }
                ),
                text = text,
                style = MaterialTheme.typography.subtitle2,
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            content(enabled)
        }
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun section(
    modifier: Modifier = Modifier,
    title: String,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    content: @Composable ColumnScope.() -> Unit,
): LazyListScope.() -> Unit {
    var visibleState by rememberSaveable { mutableStateOf(false) }
    return {
        stickyHeader(key = title) {
            Box(
                modifier = Modifier
                    .clickable { visibleState = !visibleState }
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.align(Alignment.Center)
                )
                Icon(
                    imageVector = if (visibleState) LunarIcons.UnfoldLess else LunarIcons.UnfoldMore,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 8.dp)
                )
            }
        }
        item {
            AnimatedVisibility(
                visible = visibleState,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically(),
                modifier = Modifier
                    .fillMaxSize(),
            ) {
                Column(
                    modifier = Modifier
                        .then(modifier)
                        .padding(8.dp)
                        .fillMaxWidth(),
                    content = content,
                    horizontalAlignment = horizontalAlignment
                )
            }
        }
    }
}