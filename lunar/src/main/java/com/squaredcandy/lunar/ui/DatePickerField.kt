package com.squaredcandy.lunar.ui

import androidx.annotation.RequiresApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.platform.LocalFocusManager
import com.squaredcandy.lunar_common.StringResource
import com.squaredcandy.lunar_common.resolve
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.MaterialDialogState
import com.vanpra.composematerialdialogs.datetime.date.datepicker
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import java.time.LocalDate

@Composable
@RequiresApi(26)
fun DatePickerField(
    modifier: Modifier = Modifier,
    value: LocalDate?,
    enabled: Boolean = true,
    maxLines: Int = DatePickerFieldMaxLines,
    focusManager: FocusManager = LocalFocusManager.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    timeFormatter: @Composable (LocalDate) -> String,
    onValueChange: (LocalDate) -> Unit,
    dialogTitle: StringResource,
    dialogPositiveButtonText: StringResource,
    dialogNegativeButtonText: StringResource,
    dialogNeutralButtonText: StringResource? = null,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    yearRange: IntRange = IntRange(DatePickerFieldMinYearRange, DatePickerFieldMaxYearRange),
    dialogAutoDismiss: Boolean = true,
    onDialogCloseRequest: (MaterialDialogState) -> Unit = { it.hide(focusManager) },
    onPositiveButtonClick: () -> Unit = {},
    onNegativeButtonClick: () -> Unit = {},
    onNeutralButtonClick: () -> Unit = {},
) {
    val dialogState = rememberMaterialDialogState()

    val currentValue = if (value != null) timeFormatter(value) else ""

    OutlinedTextField(
        modifier = modifier.onFocusEvent { focusState ->
            if (focusState.isFocused) {
                dialogState.show()
            }
        },
        value = currentValue,
        onValueChange = {}, // The dialog will be the one calling the changer
        label = label,
        enabled = enabled,
        interactionSource = interactionSource,
        readOnly = true,
        maxLines = maxLines,
        placeholder = placeholder,
        trailingIcon = trailingIcon,
    )

    MaterialDialog(
        dialogState = dialogState,
        autoDismiss = dialogAutoDismiss,
        onCloseRequest = onDialogCloseRequest,
        buttons = {
            positiveButton(
                text = dialogPositiveButtonText.resolve(),
                onClick = {
                    focusManager.clearFocus(force = true)
                    onPositiveButtonClick()
                },
            )
            negativeButton(
                text = dialogNegativeButtonText.resolve(),
                onClick = {
                    focusManager.clearFocus(force = true)
                    onNegativeButtonClick()
                },
            )
            if (dialogNeutralButtonText != null) {
                button(
                    text = dialogNeutralButtonText.resolve(),
                    onClick = {
                        focusManager.clearFocus(force = true)
                        onNeutralButtonClick()
                        onDialogCloseRequest(dialogState)
                    },
                )
            }
        },
        content = {
            datepicker(
                initialDate = value ?: LocalDate.now(),
                onDateChange = { onValueChange(it) },
                title = dialogTitle.resolve(),
                yearRange = yearRange,
            )
        },
    )
}

const val DatePickerFieldMinYearRange = 1900
const val DatePickerFieldMaxYearRange = 2100
private const val DatePickerFieldMaxLines = 1
