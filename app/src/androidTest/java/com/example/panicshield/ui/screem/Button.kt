package com.example.panicshield.ui.screem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.panicshield.ui.theme.PanicShieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PanicShieldTheme {
                // Llamamos al composable SimpleButtonScreen para mostrar el botón
                SimpleButtonScreen()
            }
        }
    }
}

@Composable
fun SimpleButtonScreen() {
    // Usamos Column para centrar el botón en la pantalla
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(), // Centra el contenido en la pantalla
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            // Acción cuando el botón es presionado
            println("Botón presionado")
        }) {
            Text(text = "Presiona el botón")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimpleButtonScreen() {
    PanicShieldTheme {
        SimpleButtonScreen()
    }
}