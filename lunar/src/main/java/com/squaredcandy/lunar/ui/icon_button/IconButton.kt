package com.squaredcandy.lunar.ui

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics

/**
 * Icon button that includes a [onClickLabel]
 */
@Composable
fun IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onClickLabel: String? = null,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable () -> Unit
) {
    androidx.compose.material.IconButton(
        onClick = onClick,
        modifier = modifier.semantics {
            onClick(
                label = onClickLabel,
                action = { onClick(); true },
            )
            role = Role.Button
        },
        enabled = enabled,
        interactionSource = interactionSource,
        content = content,
    )
}