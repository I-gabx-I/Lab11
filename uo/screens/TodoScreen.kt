package com.example.lab11.uo.screens


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.lab11.viewmodel.TaskViewModel
import com.example.lab11.uo.components.TaskInput  // Cambiado a "uo"
import com.example.lab11.uo.components.TaskItem   // Cambiado a "uo"

@Composable
fun TodoScreen(viewModel: TaskViewModel) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TaskInput(viewModel)
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(viewModel.tasks) { task ->
                TaskItem(task, viewModel)
            }
        }
    }
}