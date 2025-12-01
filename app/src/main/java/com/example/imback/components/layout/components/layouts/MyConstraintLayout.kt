package com.example.imback.components.layout.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

/* Para usar constraintlayout, hay que colocar las dependencias en el gradle
constraintVersion = "1.1.0"
constraint-layout = {module = "androidx.constraintlayout:constraintlayout-compose", version.ref = "constraintVersion"}
implementation(libs.constraint.layout)
 */

@Preview(showBackground = true)
@Composable
fun MyConstaintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxGray, boxGreen, boxMagenta, boxYellow) = createRefs()

        Box(Modifier
            .size(150.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                start.linkTo(boxYellow.end)
                top.linkTo(boxYellow.bottom)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Gray)
            .constrainAs(boxGray) {
                end.linkTo((boxYellow.start))
                top.linkTo(boxYellow.bottom)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                start.linkTo(boxYellow.end)
                bottom.linkTo(boxYellow.top)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                end.linkTo(boxYellow.start)
                bottom.linkTo(boxYellow.top)
            })

        Box(Modifier
            .size(150.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                top.linkTo((parent.top))
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
                start.linkTo((parent.start))
            })
    }
}