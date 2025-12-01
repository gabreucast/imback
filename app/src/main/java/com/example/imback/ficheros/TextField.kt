package com.example.imback.ficheros

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)

@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    var user: String by rememberSaveable() { mutableStateOf("Gabriel") }
    var value: String by rememberSaveable() { mutableStateOf("Borra todo") }

    Column(modifier = Modifier) {
        MyTextField(user = user) { user = it }
        Spacer(Modifier.height(5.dp))
        MySecondTextField(value = value) {
            value = it
        }
    }
}

@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(user, onValueChange = { onUserChange(it) })
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value,
        onValueChange = { onValueChange(it) },
        readOnly = value.isEmpty(),
        placeholder = {
            Text("Se Bloqueó :)")}, label = { Text("Prueba")}
    )
}
