package com.example.lab11.uo.components  // Paquete actualizado

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.lab11.viewmodel.TaskViewModel

@Composable
fun TaskInput(viewModel: TaskViewModel) {
    var text by remember { mutableStateOf("") }

    Row(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.weight(1f),
            placeholder = { Text("Enter task...") }
        )
        Button(onClick = {
            viewModel.addTask(text)
            text = ""
        }) {
            Text("Add")
        }
    }
}