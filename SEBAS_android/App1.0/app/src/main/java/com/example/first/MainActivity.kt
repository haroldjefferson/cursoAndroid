package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first.ui.theme.FirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Sebas"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface (color = Color.Blue, modifier = Modifier.padding(100.dp, 400.dp)) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(80.dp, 15.dp, 60.dp, 56.dp )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstTheme {
        Greeting("Sebas")
    }
}