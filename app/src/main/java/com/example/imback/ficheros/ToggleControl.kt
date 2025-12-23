package com.example.imback.ficheros

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.imback.R

@Preview(showBackground = true)
@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by rememberSaveable() { mutableStateOf(true) }
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column() {
            Switch(switchState, { switchState = it })
            Switch(
                switchState, { switchState = it },
                thumbContent = {
                    Icon(
                        painter = painterResource(R.drawable.ic_learn),
                        contentDescription = ""
                    )
                })
            Switch(switchState, { switchState = it }, enabled = false)
            Switch(
                switchState, { switchState = it },thumbContent = {
                    Icon(
                        painter = painterResource(R.drawable.ic_learn),
                        contentDescription = ""
                    )
                },
                colors = SwitchDefaults.colors(
                    checkedBorderColor = Color.Red,
                    uncheckedBorderColor = Color.Blue,
                    checkedIconColor = Color.Cyan,
                    uncheckedIconColor = Color.Yellow,
                    checkedThumbColor = Color.Gray,
                    uncheckedThumbColor = Color.DarkGray,
                    checkedTrackColor = Color.White,
                    uncheckedTrackColor = Color.DarkGray
                )
            )
            MyCheckBox()
        }
    }
}

@Composable
fun MyCheckBox(){
    var state by rememberSaveable() { mutableStateOf(true)}
    Column {
        Checkbox(state, { state = it })

        Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(state, { state = it }, enabled = false,
            colors = CheckboxDefaults.colors(
                disabledCheckedColor = Color.Blue,
                disabledUncheckedColor = Color.Magenta
            ))
            Text("Always Disable")
        }
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.clickable{state = !state}) {
            Checkbox(
                state, { state = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Red,
                    uncheckedColor = Color.Cyan,
                    checkmarkColor = Color.Green,
                )
            )
            Text("I Accept")
        }
    }
}
