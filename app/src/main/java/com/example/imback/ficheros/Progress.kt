package com.example.imback.ficheros

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun Progress(modifier: Modifier = Modifier) {
    var progress by rememberSaveable() { mutableStateOf(0.5f) }
    var progress1 by rememberSaveable() { mutableStateOf(0.5f) }
    var show by rememberSaveable() { mutableStateOf(true)}

    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        label = "progress animation"
    )

    val animatedProgress1 by animateFloatAsState(
        targetValue = progress1,
        label = "progress animation"
    )


    Column(
        modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(
            Modifier.size(140.dp),
            color = Color.Green,
            10.dp,
            Color.Blue,
            strokeCap = StrokeCap.Square
        )

        Spacer(Modifier.height(25.dp))

        LinearProgressIndicator(
            color = Color.Red,
            strokeCap = StrokeCap.Round
        )

        Spacer(Modifier.height(25.dp))

        CircularProgressIndicator(
        progress = { progress },
        modifier = Modifier.size(140.dp),
        color = Color.Red,
        strokeWidth = 10.dp,
        trackColor = Color.Blue,
        strokeCap = StrokeCap.Square,
        )

        Row(Modifier.padding(24.dp)) {
            Button(onClick = { if (progress > 0.1f) progress -= 0.1f }) { Text("<-") }
            Spacer(Modifier.width(5.dp))
            Button(onClick = { if (progress < 1f) progress += 0.1f }) { Text("->") }
        }
        if (show) {
            CircularProgressIndicator(
                progress = { animatedProgress1 },
                modifier = Modifier.size(100.dp),
                color = Color.Yellow,
                strokeWidth = 10.dp
            )
            Spacer(Modifier.height(15.dp))
            LinearProgressIndicator(
                progress = { animatedProgress1 },
                color = Color.White,
                strokeCap = StrokeCap.Round
            )
            Spacer(Modifier.height(5.dp))

            Row {
                Button(onClick = {
                    progress1 = (progress1 - 0.1f).coerceIn(0f, 1f)
                }) { Text("<-") }
                Spacer(Modifier.width(5.dp))
                Button(onClick = {
                    progress1 = (progress1 + 0.1f).coerceIn(0f, 1f)
                }) { Text("->") }
                Spacer(Modifier.width(5.dp))
            }
        }
        Spacer(Modifier.height(15.dp))
        Button(onClick = { show = !show }) { Text("Mostrar/Ocultar")}
    }
}