package com.da1.ejercicios.implementaciones

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

@Composable
fun Presentacion() {
    Column() {
        Text("nombre: ");
        Text("carrera: ");
        Text("tecnología a aprender: ")
    }
}

@Preview(showBackground = true)
@Composable
fun PresentacionPreview() {
    Presentacion()
}