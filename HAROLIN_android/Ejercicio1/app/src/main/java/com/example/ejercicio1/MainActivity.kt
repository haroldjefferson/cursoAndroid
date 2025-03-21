package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                       modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize(1f)) {
        Image(painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null)
        Text(
            text = stringResource(R.string.titulo),
            modifier = modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(R.string.parrafo1),
            modifier = modifier.padding(16.dp).background(Color(0xFFEADDFF)),
            textAlign = TextAlign.Justify)
        Text(
            text = stringResource(R.string.parrafo2),
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify)

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Ejercicio1Theme {
        Greeting()
    }
}