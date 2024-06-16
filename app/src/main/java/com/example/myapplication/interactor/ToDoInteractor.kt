package com.example.myapplication.interactor

import com.example.myapplication.entity.ToDoItem
import java.time.LocalDate

class ToDoInteractor {
    private val toDoItems = mutableListOf<ToDoItem>()

    fun getToDoItems(): List<ToDoItem> {
        return listOf(ToDoItem(1, "本", "本", false, LocalDate.now()),
            ToDoItem(2, "本", "本", false, LocalDate.now()),
            ToDoItem(3, "本", "本", false, LocalDate.now()))
    }

    fun addToDoItem(item: ToDoItem) {
        toDoItems.add(item)
    }

    fun toggleToDoItemCompletion(id: Int) {
        val item = toDoItems.find { it.id == id }
        item?.let {
            val updatedItem = it.copy(isCompleted = !it.isCompleted)
            toDoItems[toDoItems.indexOf(it)] = updatedItem
        }
    }
}