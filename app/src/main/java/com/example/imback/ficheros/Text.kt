package com.example.imback.ficheros

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun myTexts(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Hola")
        Text("Hola Rojo", color = Red)
        Text("Hola size 35", fontSize = 35.sp)
        Text("fontStyle: Italic", fontStyle = FontStyle.Italic)
        Text(
            "FontWeight: ExtraBold",
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,
            fontSize = 25.sp
        )
        Text("LetterSpacing", letterSpacing = 12.sp)
        Text(
            "TextDecoration",
            textDecoration = TextDecoration.Underline + TextDecoration.LineThrough
        )
        Text(
            "TextDecoration tipo link", Modifier.clickable {},
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
        )
        Text("Align: Center", Modifier
            .fillMaxWidth()
            .background(Red), textAlign = TextAlign.Center)
        Text("Texto en una sola linea, Texto en una sola linea, Texto en una sola linea, Texto en una sola linea, Texto en una sola linea",
            maxLines = 1, overflow = TextOverflow.Ellipsis)
    }

}
