package com.da1.ejercicios.implementaciones

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun differentOrderModifier() {
    Column(modifier = Modifier.padding(16.dp)) {
        // Caso 1: Fondo primero, Padding después
        Text(
            text = "Fondo primero -> Padding después",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(16.dp)
        )

        // Caso 2: Padding primero, Fondo después
        Text(
            text = "Padding primero -> Fondo después",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Cyan)
        )
    }
}