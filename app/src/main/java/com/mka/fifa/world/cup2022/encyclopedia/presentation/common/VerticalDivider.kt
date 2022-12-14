package com.mka.fifa.world.cup2022.encyclopedia.presentation.common

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VerticalDivider(color: Color) {
    Divider(
        color = color,
        modifier = Modifier.fillMaxHeight().width(1.dp)
    )
}