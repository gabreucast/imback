package com.example.imback.ficheros

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imback.R

@Preview
@Composable
fun MyDropDownItem(modifier: Modifier = Modifier) {
    Column(modifier = modifier){
        DropdownMenuItem(
            text = { Text("Example 1",
                fontSize = 22.sp
            ) },
            onClick = {},
            leadingIcon = { Icon(
                painter = painterResource(R.drawable.ic_fire),
                contentDescription = "",
                Modifier.size(40.dp),
            ) },
            trailingIcon = { Icon(
                painter = painterResource(R.drawable.ic_star),
                contentDescription = "",
                Modifier.size(40.dp),
            )},
            contentPadding = PaddingValues(16.dp),
            colors = MenuDefaults.itemColors(
                textColor = Color.Red,
                leadingIconColor = Color.Blue,
                trailingIconColor = Color.Green,
            )
            )
    }
}