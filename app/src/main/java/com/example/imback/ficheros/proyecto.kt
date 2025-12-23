package com.example.imback.ficheros

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            .padding(22.dp)
    ) {
        val (block1, block2, block3, textBlock4, block4) = createRefs()
        val (spacer1, spacer2, spacer3, spacer4) = createRefs()

//        -------------- Block 1 -----------------
        Column(Modifier.constrainAs(block1) {
            start.linkTo(parent.start)
            top.linkTo(parent.top)
            end.linkTo(parent.end)
        }) {
            Row(
                modifier = Modifier.fillMaxWidth(), Arrangement.SpaceBetween
            ) {
                Column() {
                    Text(
                        "Buenos días",
                        Modifier.padding(5.dp),
                        fontSize = 15.sp,
                        color = Color(0xFF627884)
                    )
                    Text(
                        "Cuida Tu Bienestar",
                        Modifier.padding(5.dp),
                        color = Color(0xFF263740),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                } // Column
                Icon(
                    painterResource(R.drawable.ic_fire),
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

        Spacer(
            Modifier
                .fillMaxWidth()
                .height(20.dp)
                .constrainAs(spacer1) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(block1.bottom)
                    bottom.linkTo(block2.top)
                }
        )


        //  -------------- Block 2 -----------------
        Box(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(20))
                .background(Color.White)
                .padding(horizontal = 16.dp)
                .constrainAs(block2) {
                    start.linkTo(parent.start)
                    top.linkTo(spacer1.bottom)
                    end.linkTo(parent.end)
                    bottom.linkTo(spacer2.top)
                }) {
            Column() {
//                Spacer(Modifier.height(20.dp))
                Text(
                    "¿Cómo se siente hoy?",
                    color = Color(0xFF263740),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
//                Spacer(Modifier.height(5.dp).background(Color.Black))
                Row(
                    Modifier
                        .fillMaxWidth(), Arrangement.SpaceAround
                )
                {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "🙂",
                             modifier.border(2.dp, Color.Black, CircleShape),
                            fontSize = 26.sp,
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Genial",
                            color = Color(0xFF627884),
                            fontSize = 14.sp,
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "\uD83D\uDE42",
                            modifier.border(2.dp, Color.Black, CircleShape),
                            fontSize = 26.sp,
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Bien",
                            color = Color(0xFF627884),
                            fontSize = 14.sp,
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "\uD83D\uDE10",
                            modifier.border(2.dp, Color.Black, CircleShape),
                            fontSize = 26.sp,
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Normal",
                            color = Color(0xFF627884),
                            fontSize = 14.sp,
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "\uD83D\uDE14",
                            modifier.border(2.dp, Color.Black, CircleShape),
                            fontSize = 26.sp,
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Bajo",
                            color = Color(0xFF627884),
                            fontSize = 14.sp,
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "\uD83D\uDE29",
                            modifier.border(2.dp, Color.Black, CircleShape),
                            fontSize = 26.sp,
                        )
                        Spacer(Modifier.height(7.dp))
                        Text(
                            "Agotado",
                            color = Color(0xFF627884),
                            fontSize = 14.sp,
                        )
                    } //Column
                } //Row
            } //Column
        } //Box Blanco

        Spacer(
            Modifier
                .fillMaxWidth()
                .height(30.dp)
                .constrainAs(spacer2) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(block2.bottom)
                    bottom.linkTo(block3.top)
                })

        Box(
            Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(30))
                .background(Color(0xFFF9E3DC))
                .constrainAs(block3) {
                    start.linkTo(parent.start)
                    top.linkTo(spacer2.bottom)
                    end.linkTo(parent.end)
                }


        ) {
            Row(Modifier.padding(20.dp)) {
                Icon(
                    painter = painterResource(R.drawable.ic_star),
                    contentDescription = "star icon",
                    Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(30))
                        .background(Color(0xffF7D4C7)),
                    tint = Color(0xffF09475)
                )

                Column(Modifier.padding(start = 15.dp)) {
                    Text(
                        "Tip del Día",
                        color = Color(0xff263740),
                        fontSize = 15.sp,
//                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(
                        Modifier
                            .fillMaxWidth()
                            .height(7.dp)
                    )
                    Text(
                        "Tu salud mental es tan importante como tu salud física.",
                        color = Color(0xff627884),
                        fontSize = 13.sp
                    )
                } //Column
            } //Row
        } //Box

        Spacer(
            Modifier
                .fillMaxWidth()
                .height(30.dp)
                .constrainAs(spacer3) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(block3.bottom)
                    bottom.linkTo(textBlock4.top)
                })

        // --------- Block 3 -------

        Text(
            "¿Qué te gustaría hacer?",
            Modifier
                .constrainAs(textBlock4) {
                    start.linkTo(parent.start)
//                end.linkTo(parent.end)
                    top.linkTo(spacer3.bottom)
                    bottom.linkTo(block4.top)
                },
            color = Color(0xff263740),
            fontSize = 18.sp

        )

        Column(
            Modifier.fillMaxWidth().height(300.dp)
                .constrainAs(block4) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(textBlock4.bottom)
                },  verticalArrangement = Arrangement.SpaceAround) {
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround) {
                HomeCard(
                    "Hacer Quiz",
                    "Evalúa tu nivel",
                    Color(0xFF4FB0A6),
                    0xFF7FC5BB,
                    R.drawable.ic_quiz,
                    "Make quiz icon",
                    modifier = Modifier
                )
                HomeCard(
                    "Hacer Quiz",
                    "Escribe tus pensamientos",
                    Color(0xFFF1AE81),
                    0xFFF5BEA4,
                    R.drawable.ic_book,
                    "description icon",
                    modifier = Modifier
                )
            }
            Row(Modifier.fillMaxWidth(), Arrangement.SpaceAround) {
                HomeCard(
                    "Aprende",
                    "Sobre el burnout",
                    Color(0xFFD5CDE4),
                    0xFFE2DCEC,
                    R.drawable.ic_learn,
                    "icon learn",
                    modifier = Modifier
                )
                HomeCard(
                    "Hacer Quiz",
                    "Ve tus reportes",
                    Color(0xFFACD2BF),
                    0xFFC5E0D2,
                    R.drawable.ic_progress,
                    "icon do test",
                    modifier = Modifier
                )
            }
        }

    } //ContrainLayout
} //fun Start

@Composable
fun HomeCard(
    title: String,
    subtitle: String,
    backgroundColor: Color,
    iconBackgroundColor: Long,
    icon: Int,
    iconDescription: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .height(130.dp)
            .width(160.dp)
            .clip(RoundedCornerShape(20))
            .background(backgroundColor)
            .padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Column() {
            Icon(
                painterResource(icon),
                iconDescription,
                Modifier
                    .size(40.dp)
                    .background(Color(iconBackgroundColor), CircleShape)
                    .padding(8.dp),
                tint = Color(0xFF0263740)
            )
            Spacer(Modifier.height(5.dp))
            Text(
                title,
                color = Color(0xFF263740),
                fontWeight = FontWeight.SemiBold
            )
            Spacer(Modifier.height(5.dp))
            Text(
                subtitle,
                color = Color(0xFF263740)
            )
        } // column
    } //Box
} //composable