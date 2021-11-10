package com.squaredcandy.lunar.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import com.squaredcandy.lunar_common.LunarIcons

@Composable
fun DropDownField(
    modifier: Modifier = Modifier,
    textFieldModifier: Modifier = Modifier,
    value: String,
    enabled: Boolean = true,
    maxLines: Int = DropDownFieldMaxLines,
    focusManager: FocusManager = LocalFocusManager.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onValueChange: (String) -> Unit,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    dropDownMenuOnDismissRequest: () -> Unit = { focusManager.clearFocus(force = true) },
    dropDownMenuContent: @Composable (ColumnScope.(() -> Unit) -> Unit),
) {
    DropDownField(
        modifier = modifier,
        textFieldModifier = textFieldModifier,
        value = value,
        enabled = enabled,
        maxLines = maxLines,
        focusManager = focusManager,
        interactionSource = interactionSource,
        typeToString = { it },
        onValueChange = onValueChange,
        label = label,
        placeholder = placeholder,
        dropDownMenuOnDismissRequest = dropDownMenuOnDismissRequest,
        dropDownMenuContent = dropDownMenuContent,
    )
}

@Composable
fun <T> DropDownField(
    modifier: Modifier = Modifier,
    textFieldModifier: Modifier = Modifier,
    value: T,
    enabled: Boolean = true,
    maxLines: Int = DropDownFieldMaxLines,
    focusManager: FocusManager = LocalFocusManager.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    typeToString: @Composable (T) -> String,
    onValueChange: (T) -> Unit,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    dropDownMenuOnDismissRequest: () -> Unit = { focusManager.clearFocus(force = true) },
    dropDownMenuContentList: List<T>,
) {
    DropDownField(
        modifier = modifier,
        textFieldModifier = textFieldModifier,
        value = value,
        enabled = enabled,
        maxLines = maxLines,
        focusManager = focusManager,
        interactionSource = interactionSource,
        typeToString = typeToString,
        onValueChange = onValueChange,
        label = label,
        placeholder = placeholder,
        dropDownMenuOnDismissRequest = dropDownMenuOnDismissRequest,
        dropDownMenuContent = {
            dropDownMenuContentList.forEach {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onValueChange(it)
                            dropDownMenuOnDismissRequest()
                        }
                        .padding(8.dp),
                    text = typeToString(it),
                )
            }
        },
    )
}

@Composable
fun <T> DropDownField(
    modifier: Modifier = Modifier,
    textFieldModifier: Modifier = Modifier,
    value: T,
    enabled: Boolean = true,
    maxLines: Int = DropDownFieldMaxLines,
    focusManager: FocusManager = LocalFocusManager.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    typeToString: @Composable (T) -> String,
    onValueChange: (T) -> Unit,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    dropDownMenuOnDismissRequest: () -> Unit = { focusManager.clearFocus(force = true) },
    dropDownMenuContent: @Composable (ColumnScope.(() -> Unit) -> Unit),
) {
    val isFocused by interactionSource.collectIsFocusedAsState()
    val trailingIconRotation = if (isFocused) 180f else 0f

    Box(
        modifier = modifier,
    ) {
        OutlinedTextField(
            modifier = textFieldModifier,
            value = typeToString(value),
            onValueChange = {
                onValueChange(value)
            },
            label = label,
            enabled = enabled,
            interactionSource = interactionSource,
            readOnly = true,
            maxLines = maxLines,
            placeholder = placeholder,
            trailingIcon = {
                Icon(
                    modifier = Modifier.rotate(trailingIconRotation),
                    imageVector = LunarIcons.ArrowDropDown,
                    contentDescription = null,
                )
            },
        )

        DropdownMenu(
            expanded = isFocused,
            onDismissRequest = dropDownMenuOnDismissRequest,
            content = {
                dropDownMenuContent(dropDownMenuOnDismissRequest)
            },
        )
    }
}

private const val DropDownFieldMaxLines: Int = 1