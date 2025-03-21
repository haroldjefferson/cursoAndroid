package com.example.ejercicioquadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicioquadrante.ui.theme.EjercicioQuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioQuadranteTheme {
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
fun Quadrante(modifier: Modifier = Modifier, titulo: String, parrafo: String) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = titulo,
            fontWeight = FontWeight.Bold,
            )
        Text(text = parrafo,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify)
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .background(Color.Green)
                .fillMaxWidth(1f)
        ) {
            Quadrante(
                titulo = stringResource(R.string.titulo1),
                parrafo = stringResource(R.string.parrafo1),
                modifier = Modifier.fillMaxWidth(0.5f)
                    .fillMaxHeight(1F)
                    .background(Color(0xFFEADDFF))
            )
            Quadrante(
                titulo = stringResource(R.string.titulo1),
                parrafo = stringResource(R.string.parrafo1),
                modifier =  Modifier.fillMaxWidth(1F)
                    .fillMaxHeight(1F)
                    .background(Color(0xFFD0BCFF))
            )

        }
        Row {
            Quadrante(
                titulo = stringResource(R.string.titulo1),
                parrafo = stringResource(R.string.parrafo1),
                modifier = Modifier.fillMaxWidth(0.5f)
                    .fillMaxHeight(1F)
                    .background(Color(0xFFEADDFF))
            )
            Quadrante(
                titulo = stringResource(R.string.titulo1),
                parrafo = stringResource(R.string.parrafo1),
                modifier =  Modifier.fillMaxWidth(1F)
                    .fillMaxHeight(1F)
                    .background(Color(0xFFD0BCFF))
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EjercicioQuadranteTheme {
        Greeting()
    }
}