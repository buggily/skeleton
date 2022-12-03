package com.buggily.skeleton.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Box(modifier) {
        Text(
            text = "Hello World!",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}
