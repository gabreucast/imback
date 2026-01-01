package com.example.imback.ficheros

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MySliderParent(modifier: Modifier = Modifier) {
    Column(modifier.padding(30.dp)) {
        MyValue()
        MySliderAdvance()
    }

}

@Composable
fun MyValue() {
    var myValue by rememberSaveable { mutableStateOf(0f) }
    Slider(
        myValue, onValueChange = { myValue = it },
        colors = SliderDefaults.colors(
            thumbColor = Color.Red,
            Color.Green,
            inactiveTrackColor = Color.Yellow
        )
    )
    Text(myValue.toString())
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySliderAdvance(modifier: Modifier = Modifier) {
    var textValueChangeFinished by remember { mutableStateOf(true) }

    val state = remember {
        SliderState(
            value = 5f,
            valueRange = 0f..10f,
            steps = 3,
            onValueChangeFinished = { textValueChangeFinished = !textValueChangeFinished }
        )
    }

    val colors = SliderDefaults.colors(
        thumbColor = Color.Blue,
        Color.Red,
        inactiveTrackColor = Color.Green
    )

    Column {
        Slider(
            state,
            colors = colors,
            thumb = { state: SliderState -> Text(state.value.toString()) },
        )
        Text((state.value.toString()))
        Text(if (textValueChangeFinished) "HAPPY" else "SAD")
    }
}