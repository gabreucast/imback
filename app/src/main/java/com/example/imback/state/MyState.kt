package com.example.imback.state

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyState(modifier: Modifier = Modifier){
    var number by rememberSaveable() { mutableStateOf(0) }

    Column(modifier = modifier) {
        Ejemplo1(number){number += 1}
        Spacer(Modifier.height(20.dp).background(Color.White))
        Ejemplo2(number){number += 1}
    }

}

@Composable
fun Ejemplo1(number: Int, onClick:() -> Unit){
    Text("Púlsame: $number", modifier = Modifier.clickable{ onClick() })
}

@Composable
fun Ejemplo2(number: Int, onClick:() -> Unit){
    Text("Púlsame: $number", modifier= Modifier.clickable{ onClick() })
}