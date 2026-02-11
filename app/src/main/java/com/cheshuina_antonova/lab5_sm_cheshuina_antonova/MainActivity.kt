package com.cheshuina_antonova.lab5_sm_cheshuina_antonova

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cheshuina_antonova.lab5_sm_cheshuina_antonova.ui.theme.Lab5_sm_Cheshuina_AntonovaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}
@Composable
fun TitleBlock(){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
           Text(
               text = "Пример Compose-приложения",
               fontSize = 16.sp,
           )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "Row, Column, Size, ARGB",
                fontSize = 16.sp,
            )
        }
    }
}
@Composable
fun MainScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        TitleBlock()
        Spacer(modifier = Modifier.height(16.dp))
        ColorRow()
        Spacer(modifier = Modifier.height(16.dp))
        CombinedBlock()
    }
}
@Composable
fun ColorRow(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(color = Color(0xFFFF0000))
        ColorBox(color = Color(0x8000FF00))
        ColorBox(color = Color(0xFF0000FF))
    }
}
@Composable
fun ColorBox(color: Color){
    Box(
        modifier = Modifier
        .size(100.dp)
        .background(color)
    )
}
@Composable
fun CombinedBlock(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0x80808080))
            .padding(5.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Левая колонка",
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            Text(
                text = "Текст 1",
            )
        }
        Column(
            horizontalAlignment = Alignment.End
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) { }
            Text(
                text = "Правая колонка",
            )
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            Text(
                text = "Текст 2",
            )
        }
    }
}
