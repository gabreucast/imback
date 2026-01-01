package com.example.imback.ficheros

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imback.R
import com.example.imback.state.CheckBoxState

@Preview(showBackground = true)
@Composable
fun ToggleControl(modifier: Modifier = Modifier) {
    var showUi by rememberSaveable() { mutableStateOf(true) }
    var text by rememberSaveable() { mutableStateOf("Show More") }
    var state by rememberSaveable() {
        mutableStateOf(
            listOf(
                CheckBoxState("Terms", "Acepar los Términos y condiciones"),
                CheckBoxState("newsletter", "Recibir la newsletter", true),
                CheckBoxState("updates", "Recibir actalizaciones")
            )
        )
    }

    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showUi) {
            MySwitch()
            MyCheckBox()
        } else {
            state.forEach { myState ->
                AdvanceCheBox(checkBoxState = myState) {
                    state = state.map {
                        if (it.id == myState.id) {
                            myState.copy(checked = !myState.checked)
                        } else it
                    }
                }
            }

            text = "Show Less"
            Spacer(modifier.height(5.dp))
            MyRadioButton()
            MyRadioButtonList()
            Spacer(modifier.height(5.dp))
        }
        Button({ showUi = !showUi }) { Text(text) }
    }
}


@Composable
fun MySwitch(modifier: Modifier = Modifier) {
    var switchState by rememberSaveable() { mutableStateOf(true) }

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
            switchState, { switchState = it }, thumbContent = {
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
    }
}


@Composable
fun MyCheckBox() {
    var state by rememberSaveable() { mutableStateOf(true) }


    Column {
        Checkbox(state, { state = it })

        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                state, { state = it }, enabled = false,
                colors = CheckboxDefaults.colors(
                    disabledCheckedColor = Color.Blue,
                    disabledUncheckedColor = Color.Magenta
                )
            )
            Text("Always Disable")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { state = !state }) {
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

@Composable
fun AdvanceCheBox(
    modifier: Modifier = Modifier,
    checkBoxState: CheckBoxState,
    onChekedChange: (CheckBoxState) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable { onChekedChange(checkBoxState) }) {
        Checkbox(
            checked = checkBoxState.checked,
            onCheckedChange = { onChekedChange(checkBoxState) },
            enabled = true
        )
        Spacer(Modifier.width(12.dp))
        Text(checkBoxState.label)
    }
}


@Composable
fun MyRadioButton(modifier: Modifier = Modifier) {
    var state: Boolean by rememberSaveable() { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        RadioButton(
            state,
            { state = true },
            modifier,
            true,
            RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Magenta
            )
        )
        Text("enable")

        RadioButton(
            state,
            { state = true },
            modifier,
            false,
            RadioButtonDefaults.colors(
                disabledSelectedColor = Color.Green,
                disabledUnselectedColor = Color.Blue
            )
        )
        Text("not enable")
    }
}

@Composable
fun MyRadioButtonList(modifier: Modifier = Modifier) {
    var selectedName: String by rememberSaveable { mutableStateOf("") }
    Column(modifier = modifier) {
        MyRadioButtonComponent("Gabriel", selectedName = selectedName, { selectedName = it })
        MyRadioButtonComponent("Oswaldo", selectedName = selectedName, { selectedName = it })
        MyRadioButtonComponent("Abreu", selectedName = selectedName, { selectedName = it })
        MyRadioButtonComponent("Castillo", selectedName = selectedName, { selectedName = it })
    }
}

@Composable
fun MyRadioButtonComponent(name: String, selectedName: String, onItemSelected: (String) -> Unit) {
    val isSelected = name == selectedName
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            name == selectedName,
            { onItemSelected(name) },
            colors = RadioButtonDefaults.colors(
                unselectedColor = Color.Black
            )
        )
        Text(name,
            modifier = Modifier.clickable { onItemSelected(name) },
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal)
    }
}