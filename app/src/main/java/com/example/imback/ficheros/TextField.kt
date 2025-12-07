package com.example.imback.ficheros

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyTextFieldParent(modifier: Modifier = Modifier) {
    var user: String by rememberSaveable() { mutableStateOf("Gabriel") }
    var value: String by rememberSaveable() { mutableStateOf("Borra todo") }
    var pruebas: String by rememberSaveable() { mutableStateOf("Pruebas") }
    var password: String by rememberSaveable() { mutableStateOf("") }
    var outline: String by rememberSaveable() { mutableStateOf("") }

    Column(
        modifier = modifier
    ) {
        MyTextField(user = user) { user = it }
        Spacer(Modifier.height(6.dp))
        MySecondTextField(value = value) { value = it }
        Spacer(Modifier.height(6.dp))
        MyAdvanceTextField(pruebas) { pruebas = it }
        Spacer(Modifier.height(6.dp))
        MyPasswordTextField(password) { password = it }
        Spacer(Modifier.height(6.dp))
        MyOutlinedTextField(outline) { outline = it }
        Spacer(Modifier.height(6.dp))
        MyTextFieldPruebas(pruebas) { pruebas = it }
    }
}


@Composable
fun MyTextField(user: String, onUserChange: (String) -> Unit) {
    TextField(
        user, onValueChange = { onUserChange(it) },
    )
}

@Composable
fun MySecondTextField(value: String, onValueChange: (String) -> Unit) {
    TextField(
        value,
        onValueChange = { onValueChange(it) },
        colors = TextFieldDefaults.colors(focusedIndicatorColor = Color.Yellow),
        readOnly = value.isEmpty(),
        placeholder = {
            Text("Se Bloqueó :)")
        },
        label = { Text("Prueba") },
        isError = value.isEmpty()
    )
}

@Composable
fun MyAdvanceTextField(pruebas: String, onPruebaChange: (String) -> Unit) {
    TextField(
        pruebas,
        {
            onPruebaChange(it)
            onPruebaChange(it.replace("a", ""))
        },
        label = { Text("No Acepta letra 'A'") }
    )
}

@Composable
fun MyPasswordTextField(password: String, onPasswordChange: (String) -> Unit) {
    var passwordHidden by rememberSaveable() { mutableStateOf(true) }

    TextField(
        password,
        { onPasswordChange(it) },
        singleLine = true,
        label = { Text("Introduce tu contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.NumberPassword),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None,
        trailingIcon = {
            Text(
                if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden })
        }
    )
}

@Composable
fun MyOutlinedTextField(outline: String, onOutlineChange: (String) -> Unit) {
    OutlinedTextField(
        outline,
        { onOutlineChange(it) },
        label = { Text("TextField sin fondo") }
    )
}

@Composable
fun MyTextFieldPruebas(pruebas: String, onPruebaChange: (String) -> Unit) {
    TextField(
        pruebas,
        { onPruebaChange(it) },
        Modifier.fillMaxWidth(),
        placeholder = { Text("Escribe un Texto") },
        label = { Text("TextField de Pruebas") },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Cyan,
            focusedIndicatorColor = Color.Blue,
            focusedTextColor = Color.Red,
            focusedLabelColor = Color.Yellow,
            cursorColor = Color.Yellow,
            unfocusedContainerColor = Color.LightGray,
            unfocusedTextColor = Color.Blue,
            unfocusedLabelColor = Color.Black,
            unfocusedIndicatorColor = Color.Magenta,
        )
    )
}