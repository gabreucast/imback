package com.example.imback.components.layout.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyReto2(modifier: Modifier = Modifier) {
    ConstraintLayout(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        val (boxYellow, boxMagenta, boxGray, boxGreen, boxRed, boxBlue, boxCyan, boxBlack, boxDarkGray) = createRefs()
        Box(
            modifier
                .size(75.dp)
                .background(Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                })
        Box(
            modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    end.linkTo(boxYellow.start)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    start.linkTo(boxYellow.end)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            modifier
                .size(175.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

        Box(
            modifier
                .size(75.dp)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                })


        Box(
            modifier
                .size(75.dp)
                .background(Red)
                .constrainAs(boxRed) {
                    start.linkTo(boxYellow.end)
                    top.linkTo(boxYellow.bottom)
                })

        Box(
            modifier
                .size(175.dp)
                .background(Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                })

        Box(
            modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    start.linkTo(boxCyan.end)
                    top.linkTo(boxCyan.top)
                    bottom.linkTo(boxCyan.bottom)
                })

        Box(
            modifier
                .size(175.dp)
                .background(Color.DarkGray)
                .constrainAs(boxDarkGray) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxGreen.start)
                })
    }
}

//@Preview(showBackground = true)
@Composable
fun ConstrainsExampleGuide(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val boxRed = createRef()
        val toGuide = createGuidelineFromTop(0.1f)

        Box(Modifier
            .size(150.dp)
            .background(Red)
            .constrainAs(boxRed) {
                top.linkTo(toGuide)
            })
    }
}

//@Preview(showBackground = true)
@Composable
fun ConstraintBarrier(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxRed, boxYellow)

        Box(Modifier
            .size(65.dp)
            .background(Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            })

        Box(modifier
            .size(200.dp)
            .background(Yellow)
            .constrainAs(boxYellow) {
                start.linkTo(boxRed.start, margin = 40.dp)
                top.linkTo((boxRed.bottom), 35.dp)
            })

        Box(modifier
            .size(70.dp)
            .background(Cyan)
            .constrainAs(boxCyan) {
                start.linkTo(barrier)
            })
    }
}

//@Preview(showBackground = true)
@Composable
fun ConstrainChain(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()

        Box(Modifier
            .size(100.dp)
            .background(Red)
            .constrainAs(boxRed) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(boxYellow.top)

            })

        Box(modifier
            .size(100.dp)
            .background(Yellow)
            .constrainAs(boxYellow) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxRed.bottom)
                bottom.linkTo(boxCyan.top)
            })

        Box(modifier
            .size(100.dp)
            .background(Cyan)
            .constrainAs(boxCyan) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(boxYellow.bottom)
                bottom.linkTo(parent.bottom)
            })

//        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.Packed)
//        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.Spread)
        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)


    }

}