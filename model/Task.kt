package com.example.lab11.model

import android.net.Uri

data class Task(
    val id: Int,
    var title: String,
    var imageUri: Uri? = null
)