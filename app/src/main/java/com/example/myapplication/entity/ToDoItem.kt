package com.example.myapplication.entity

import java.time.LocalDate

data class ToDoItem(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    val date: LocalDate
)