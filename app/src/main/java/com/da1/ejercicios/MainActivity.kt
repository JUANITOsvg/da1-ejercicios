package com.da1.ejercicios

// Ejercicios
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.da1.ejercicios.implementaciones.Greeting
import com.da1.ejercicios.implementaciones.Presentacion
import com.da1.ejercicios.implementaciones.datoEstudiante
import com.da1.ejercicios.implementaciones.descripcionEdad
import com.da1.ejercicios.implementaciones.differentOrderModifier
import com.da1.ejercicios.implementaciones.fichaEstudiante
import com.da1.ejercicios.ui.theme.DA1EjerciciosTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DA1EjerciciosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier= Modifier.padding(innerPadding)) {
                        NavegacionEjercicios()
                    }
                }
            }
        }
    }
}


@Composable
fun NavegacionEjercicios() {

    var pantallaActual by remember { mutableStateOf("menu") }

    Column (modifier = Modifier.fillMaxSize()){

        if (pantallaActual != "menu"){
            Button(onClick = {pantallaActual = "menu"},
                modifier = Modifier.padding(16.dp)) {
                Text(" <- Volver")
            }
        }

        when (pantallaActual) {
            "menu" -> {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    Text("Selector de Ejercicios")
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {

                    for (i in 1..13) {
                        BotonEjercicio(numero = i, onClick = { pantallaActual = "ejercicio$i" })
                    }
                }
            }

            "ejercicio1" -> {
                Greeting("Android")
            }

            "ejercicio2" -> {
                Presentacion()
            }

            "ejercicio3" -> {
                fichaEstudiante()
            }

            "ejercicio4" -> {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    datoEstudiante("Nombre", "Ana")
                    datoEstudiante("Carrera", "Sistemas")
                    datoEstudiante("Anio", "1")
                    Text(descripcionEdad(edad=18))
                }
            }

            "ejercicio5" -> differentOrderModifier()

            "ejercicio6" -> {}
        }
    }
}

@Composable
fun BotonEjercicio(numero: Int, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(0.6f)
    ) {
        Text("goto $numero")
    }
}
