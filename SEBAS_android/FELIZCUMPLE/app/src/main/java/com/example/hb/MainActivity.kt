package com.example.hb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.hb.ui.theme.HBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HBTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
//                        mensaje = "Feliz cumpleaños",
                        mensaje = stringResource(R.string.mensaje),
                        from = stringResource(R.string.from),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(deParte: String, mensaje: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            //.background(color = Color.Green)
            .fillMaxSize(1f),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = deParte,
            // modifier = modifier.background(color = Color.Cyan).fillMaxWidth(1f),
            modifier = modifier.fillMaxWidth(1f),
            fontSize = 36.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = mensaje,
            //modifier = Modifier.background(color = Color.Red),
            modifier = Modifier,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun GreetingImage(mensaje: String, from: String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier.background(Color.Magenta), contentAlignment = Alignment.Center) {
        val image = painterResource(R.drawable.androidparty)
        Image(
            painter = image, contentDescription = "Imagen de carta",
            contentScale = ContentScale.Crop,
            alpha = 0.6F
        )
        Greeting(mensaje, from)

    }
}

@Preview(
    showBackground = true, name = "SODA",
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    HBTheme {
        GreetingImage(
//            mensaje: "Feliz cumpleaños",
//            from: "Eres un gran amigo"
            stringResource(R.string.mensaje),
            stringResource(R.string.from),
        )
    }
}