package com.example.imback.ficheros

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyButtons(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Button(
            onClick = { Log.i("Gabriel", "Botón pulsado") },
//            enabled = false
            shape = RoundedCornerShape(20),
            border = BorderStroke(5.dp, Color.Red),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = Color.Green,
                disabledContainerColor = Color.Yellow,
                disabledContentColor = Color.Green
            )
        ) { Text("Button: Boton normal", color = Color.Blue) }

        OutlinedButton(onClick = {}) {
            Text("Outlined: Botón sin fondo (por defecto)", color = Color.Black)
        }

        TextButton(
            onClick = {}, shape = RoundedCornerShape(10),
        ) {
            Text("TextButton")
        }

        ElevatedButton(onClick = {}, colors = ButtonDefaults.elevatedButtonColors(Color.White)){
            Text("ElevatedButton: que tien un borde")
        }

        FilledTonalButton(onClick = {}) {
            Text("FilledTonalButton: Color secundario de la paleta (por defecto)")
        }
    }
}