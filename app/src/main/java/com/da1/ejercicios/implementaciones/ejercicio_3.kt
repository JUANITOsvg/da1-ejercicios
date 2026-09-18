package com.da1.ejercicios.implementaciones

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun fichaEstudiante(){
    val nombre = "Ana"
    val edad = 20
    val promedio = 8.25
    val cursaProgramacion = true
    val anioProximo = edad + 1

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Nombre: $nombre")
        Text("Edad: $edad")
        Text("Edad en 2027: $anioProximo")
        Text("Promedio: $promedio")
        Text("Está cursando?: $cursaProgramacion")
    }
}

@Preview
@Composable
fun estudiantePreview(){
    fichaEstudiante()
}