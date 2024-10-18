package com.example.questbasiccomposable_0115

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
            style = TextStyle
