package com.example.imback.login

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imback.ui.theme.Purple40

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.background(Purple40)
    )
}

@Preview(
    widthDp = 200,
    heightDp = 500,
    showBackground = false,
    showSystemUi = true,
)

@Composable
fun Example() {
    Text("Gabriell", modifier = Modifier
        .padding(top = 30.dp)
        .background(Color.Red)
        .clickable { })
}

@Preview
@Composable
fun Example1(){
    Text("Gabriel2")
}

@Preview
@Composable
fun Example2(){
    Text("Gabriel..2")
}