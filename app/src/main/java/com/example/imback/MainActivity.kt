package com.example.imback

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.imback.ficheros.MyDropDownItem
import com.example.imback.ui.theme.ImbackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImbackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    MyConstaintLayout()
//                    ConstraintBarrier(Modifier.padding(innerPadding))
//                    MyReto1(Modifier.padding(innerPadding))
//                    MyReto2()
//                    Column(Modifier.padding(innerPadding)) {
//                        MyRow()
//                        MyColumn()
//                    }
//                    MyState(Modifier.padding(innerPadding))
//                    MyTextFieldParent(Modifier
//                        .padding(innerPadding)
//                        .background(Color.White)
//                        .fillMaxSize()
//                        .padding(10.dp))
//                    MyButtons(Modifier.padding(innerPadding))
//                    MyImage(Modifier.padding(innerPadding))
//                    Start(Modifier.padding(innerPadding))
//                    Progress(Modifier.padding(innerPadding))
//                    ToggleControl(Modifier.padding(innerPadding))
//                    MySliderParent(Modifier.padding(innerPadding))
                    MyDropDownItem(Modifier.padding(innerPadding))
                }
            }
        }
    }
}



