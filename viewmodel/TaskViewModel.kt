package com.example.lab11.viewmodel

import android.net.Uri
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.lab11.model.Task

class TaskViewModel : ViewModel() {
    private var nextId = 1
    val tasks = mutableStateListOf<Task>()  // Estado observable para la lista de tareas

    // Añadir nueva tarea (con imagen opcional)
    fun addTask(title: String, imageUri: Uri? = null) {
        if (title.isNotBlank()) {
            tasks.add(Task(nextId++, title, imageUri))
        }
    }

    // Editar tarea existente
    fun editTask(taskId: Int, newTitle: String) {
        tasks.find { it.id == taskId }?.title = newTitle
    }

    // Eliminar tarea
    fun deleteTask(taskId: Int) {
        tasks.removeAll { it.id == taskId }
    }
}