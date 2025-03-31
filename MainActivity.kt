package com.example.lab11


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab11.uo.screens.TodoScreen  // Cambiado a "uo"
import com.example.lab11.uo.theme.Lab11Theme   // Cambiado a "uo"
import com.example.lab11.viewmodel.TaskViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab11Theme {
                val viewModel: TaskViewModel = viewModel()
                TodoScreen(viewModel)
            }
        }
    }
}