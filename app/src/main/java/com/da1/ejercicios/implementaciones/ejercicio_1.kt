package com.da1.ejercicios.implementaciones

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.da1.ejercicios.ui.theme.DA1EjerciciosTheme

// Ejercicio 1
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! - By Juan Suazo.",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DA1EjerciciosTheme {
        Greeting("Android")
    }
}