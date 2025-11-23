package com.example.imback.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyReto1(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Cyan), Alignment.Center
        ) {
            Text("Ejemplo 1")
        }
        Spacer(Modifier
            .height(20.dp)
            .background(Color.Black))

        Row(
            Modifier
//                .weight(1f)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 2")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 3")
            }
            Spacer(
                Modifier.width(3.dp).height(305.dp).background(Color.White)
            )
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 4")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 5")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))


            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 6")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 7")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))

            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 8")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 9")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))

            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 10")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 11")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))

            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 12")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 13")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))

            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Red)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 14")
            }
            Spacer(Modifier
                .width(3.dp))
            Box(
                Modifier
//                .weight(1f)
                    .background(Color.Green)
                    .height(305.dp), Alignment.Center
            ) {
                Text("Ejemplo 15")
            }
            Spacer(Modifier.width(3.dp).height(305.dp).background(Color.White))
        }
        Spacer(Modifier
            .height(12.dp))

        Box(
            Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Magenta),
            Alignment.BottomCenter
        ) {
            Text("Ejemplo 4")
        }

        Box(
            Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Yellow), Alignment.BottomStart
        ) {
            Text("Ejemplo 5")
        }

        Box(
            Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(Color.Blue), Alignment.TopEnd
        ) {
            Text("Ejemplo 6")
        }
    } // columna
} // fun