package com.example.imback.ficheros

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.imback.R

@Preview(showBackground = true)
@Composable
fun Start(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(6.dp)
    ) {
        val (block1, block2, block3, block4, block5, greetings, menssage) = createRefs()

        Column(Modifier.constrainAs(block1) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
        }) {
            Row(modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
                Column() {
                    Text("Buenos días",
                        Modifier.padding(5.dp),
                        fontSize = 14.sp,
                        color = Color(0xFF627884))
                    Text(
                        "Cuida Tu Bienestar",
                        Modifier.padding(5.dp),
                        color = Color(0xFF263740),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                } // Column
                Icon(
                    painter = painterResource(R.drawable.ic_fire),
                    "app icon",
                    Modifier
                        .size(50.dp)
                        .padding(end = 10.dp, top = 10.dp)
                        .clip(RoundedCornerShape(30))
                        .background(Color.Cyan),
                    tint = Color.White
                )
            } //Row
        } //Column

        Box(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(15))
                .background(Color.White)
                .padding(15.dp)
                .constrainAs(block2) {
                    start.linkTo(parent.start)
                    top.linkTo(block1.bottom)
                    end.linkTo(parent.end)
                }) {
            Text(
                "¿Cómo se siente hoy?",
                color = Color(0xFF263740),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    } //ContrainLayout
} //fun Start