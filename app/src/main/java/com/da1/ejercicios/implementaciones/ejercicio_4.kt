package com.da1.ejercicios.implementaciones

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun datoEstudiante(etiqueta: String, valor: String){
    Text("$etiqueta: $valor")
}

fun descripcionEdad(edad: Int): String {

    if (edad >= 18){
        return "Edad: $edad años"
    }
    return "Si no ere mayore de eda pue a tu casa, a ver pocoyo"
}