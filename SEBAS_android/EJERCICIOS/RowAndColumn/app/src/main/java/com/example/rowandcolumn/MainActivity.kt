package com.example.rowandcolumn

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
import com.example.rowandcolumn.ui.theme.RowAndColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowAndColumnTheme {
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
fun Quater(modifier: Modifier, titulo: String, parrafo: String) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = titulo, fontWeight = FontWeight.Bold, modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp))
        Text(text = parrafo, textAlign = TextAlign.Justify)
    }

}


@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f)
                .background(Color.Cyan)

        ) {
            Quater(
                modifier = Modifier
                    .background(Color(0xFFEADDFF))
                    .fillMaxHeight(1f)
                    .fillMaxWidth(0.5f),
                titulo = stringResource(R.string.titulo1),
                parrafo = stringResource(R.string.parrafo1)
            )
            Quater(
                modifier = Modifier
                    .background(Color(0xFFD0BCFF))
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f),
                titulo = stringResource(R.string.titulo2),
                parrafo = stringResource(R.string.parrafo2)
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(1f)
                .background(Color.Green)
        ) {
            Quater(
                modifier = Modifier
                    .background(Color(0xFFB69DF8))
                    .fillMaxHeight(1f)
                    .fillMaxWidth(0.5f),
                titulo = stringResource(R.string.titulo3),
                parrafo = stringResource(R.string.parrafo3)
            )
            Quater(
                modifier = Modifier
                    .background(Color(0xFFF6EDFF))
                    .fillMaxHeight(1f)
                    .fillMaxWidth(1f),
                titulo = stringResource(R.string.titulo4),
                parrafo = stringResource(R.string.parrafo4)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    RowAndColumnTheme {
        Greeting()
    }
}