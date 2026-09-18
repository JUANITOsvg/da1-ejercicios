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
import com.da1.ejercicios.implementaciones.Greeting
import com.da1.ejercicios.implementaciones.Presentacion
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

    Column {

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
                    Button(onClick = { pantallaActual = "ejercicio1" }) {
                        Text("Ir a Ejercicio 1")
                    }

                    Button(onClick = { pantallaActual = "ejercicio2" }) {
                        Text("Ir a Ejercicio 2")
                    }

                    Button(onClick = { pantallaActual = "ejercicio3" }) {
                        Text("Ir a Ejercicio 3")
                    }

                    Button(onClick = { pantallaActual = "ejercicio4" }) {
                        Text("Ir a Ejercicio 4")
                    }

                    Button(onClick = { pantallaActual = "ejercicio5" }) {
                        Text("Ir a Ejercicio 5")
                    }

                    Button(onClick = { pantallaActual = "ejercicio6" }) {
                        Text("Ir a Ejercicio 6")
                    }

                    Button(onClick = { pantallaActual = "ejercicio7" }) {
                        Text("Ir a Ejercicio 7")
                    }

                    Button(onClick = { pantallaActual = "ejercicio8" }) {
                        Text("Ir a Ejercicio 8")
                    }

                    Button(onClick = { pantallaActual = "ejercicio9" }) {
                        Text("Ir a Ejercicio 9")
                    }

                    Button(onClick = { pantallaActual = "ejercicio10" }) {
                        Text("Ir a Ejercicio 10")
                    }

                    Button(onClick = { pantallaActual = "ejercicio11" }) {
                        Text("Ir a Ejercicio 11")
                    }

                    Button(onClick = { pantallaActual = "ejercicio12" }) {
                        Text("Ir a Ejercicio 12")
                    }

                    Button(onClick = { pantallaActual = "ejercicio13" }) {
                        Text("Ir a Ejercicio 13")
                    }
                }
            }

            "ejercicio1" -> {
                Button(onClick = { pantallaActual = "menu"}) {
                    Text(" <- Volver")
                }

                Greeting("Android")
            }

            "ejercicio2" -> {
                Button(onClick = { pantallaActual = "menu" }) {
                    Text("<- Volver")
                }

                Presentacion()
            }

            "ejercicio3" -> {
                Button(onClick = { pantallaActual = "menu" }) {
                    Text("<- Volver")
                }

                fichaEstudiante()
            }

            "ejercicio4" -> {
                Button(onClick = { pantallaActual = "menu" }) {
                    Text("<- Volver")
                }

                fichaEstudiante()
            }
        }
    }
}
