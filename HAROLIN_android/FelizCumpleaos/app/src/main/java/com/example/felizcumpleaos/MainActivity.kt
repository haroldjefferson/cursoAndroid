package com.example.felizcumpleaos

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.felizcumpleaos.ui.theme.FelizCumpleañosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FelizCumpleañosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        modifier = Modifier.padding(innerPadding)
                    )
                    Greeting(stringResource(R.string.mensaje),
                        stringResource(R.string.from),)
                }
            }
        }
    }
}

@Composable
fun Greeting(saludo: String, deParte: String, modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize(1f),

    ) {
        Text(
            text = saludo,
            modifier = modifier,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = deParte,
            modifier = modifier
                .fillMaxWidth(1f)
                .background(color = Color.Red)
                .align(Alignment.CenterHorizontally),
            fontSize = 36.sp,
            textAlign = TextAlign.Center,

        )
    }

}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = image, contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.9F
        )
    }

}

@Preview(
    showBackground = true,
    name = "mi pantallita",
    showSystemUi = true

)
@Composable
fun GreetingPreview() {
    FelizCumpleañosTheme {
        GreetingImage(
        )
        Greeting(stringResource(R.string.mensaje),
            stringResource(R.string.from),)
    }
}