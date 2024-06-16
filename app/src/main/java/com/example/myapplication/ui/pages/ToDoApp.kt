package com.example.myapplication.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.interactor.ToDoInteractor
import com.example.myapplication.router.ToDoRouter
import java.time.LocalDate

@Composable
fun ToDoApp() {
    val navController = rememberNavController()
    val interactor = remember { ToDoInteractor() }
//    val presenter = remember { ToDoPresenter(ToDoViewImpl(navController), interactor) }
    val router = remember { ToDoRouter() }

    NavHost(navController, startDestination = "todoList") {
        composable("todoList") {
            ToDoListScreen(
                toDoItems = interactor.getToDoItems().filter { it.date == LocalDate.now() },
                navController = navController,
                onAddClick = { router.navigateToAddScreen(navController) }
            )
        }
        composable("addToDo") {
            ToDoAddPage(navController = navController) { newItem ->
                interactor.addToDoItem(newItem)
                navController.navigateUp()
            }
        }
    }
}