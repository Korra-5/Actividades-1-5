package com.example.actividades1_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividades1_5.Screens.Actividad1
import com.example.actividades1_5.Screens.Actividad2
import com.example.actividades1_5.Screens.Actividad3
import com.example.actividades1_5.Screens.Actividad4
import com.example.actividades1_5.Screens.Actividad5
import com.example.actividades1_5.ui.theme.Actividades1_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividades1_5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(Modifier.padding(innerPadding)){
                        Actividad5()
                    }
                    }
                }
            }
        }

}
