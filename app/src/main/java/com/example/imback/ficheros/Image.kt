package com.example.imback.ficheros

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.imback.R


@Preview
@Composable
fun MyImage(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize().padding(10.dp)) {
        Image(
            painter = painterResource(R.drawable.flor),
            contentDescription = "avatar image profile",
            modifier = modifier
                .size(200.dp)
                .clip(RoundedCornerShape(50))
                .border(
                    width = 5.dp, shape = CircleShape,
                    brush = Brush.linearGradient(listOf(Color.Magenta, Color.Green, Color.Red))
                ),
            contentScale = ContentScale.FillBounds
        )
        AsyncImage(
            /*antes de usarlo, se deben agregar la librerías, paso a paso:
            1. entrar en https://coil-kt.github.io/coil/
            2. colocar estas 2 librerias en el gradle y sicronizar:
                implementation("io.coil-kt.coil3:coil-compose:3.3.0")
                implementation("io.coil-kt.coil3:coil-network-okhttp:3.3.0")
            */

            model = "https://imagenes.elpais.com/resizer/v2/RESGTJDP6ZHVLLSPQRSS35O33A.jpg?auth=58a8289db14a757c7c1347d3b0ceb43c2e479472571df1d9e0b35582b8d46594&width=500",
            contentDescription = "Dog with glasses",
            modifier = Modifier.size(200.dp),
            onError = {
                Log.i("Image", "it has been an error ${it.result.throwable.message}")
            }
        )

        Icon(
            painter = painterResource(R.drawable.ic_fire),
            contentDescription = "app icon",
            Modifier.size(200.dp),
            tint = Color.Red
        )


    }
}
