package com.example.imback.components.layout.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox(height: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .background(Color.LightGray), contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(20.dp)
                .height(30.dp)
                .background(Color.Red)
                .verticalScroll(rememberScrollState())
        ) {
            Text("Hola Hola Hola hola hola hola hola hola")
        }
    }
}