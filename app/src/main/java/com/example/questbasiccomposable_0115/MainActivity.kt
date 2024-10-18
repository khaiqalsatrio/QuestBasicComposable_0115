package com.example.questbasiccomposable_0115

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_0115.ui.theme.QuestBasicComposable_0115Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PER2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BasicLayout(modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "SAYA LOGIN",
            style = TextStyle(
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Text(
            text = "King Indo",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )
        // Lebar 200dp dan tinggi 100dp
        Modifier.size(width = 200.dp, height = 100.dp).also { modifier = it }

        )

        // New Text added below the Image
        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium
            )
        )
        Text(
            text = "Khaiqal Satrio Alfirdaus",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Red
            )
        )

        Text(
            text = "20220140115"    ,
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Medium
            )
        )
        Image(
            painter = painterResource(id = R.drawable.kingindo),
            contentDescription = null,
        )

