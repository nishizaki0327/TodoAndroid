package com.example.myapplication.router

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.interactor.ToDoInteractor
import com.example.myapplication.view.ToDoAddPage
import com.example.myapplication.view.ToDoListScreen
import java.time.LocalDate

class ToDoRouter {

    @Composable
    fun createNavHost() {
        val navController = rememberNavController()
        val interactor = ToDoInteractor()
//        val presenter = ToDoPresenter(navController, interactor)

        NavHost(navController, startDestination = "todoList") {
            composable("todoList") {
                ToDoListScreen(
                    toDoItems = interactor.getToDoItems().filter { it.date == LocalDate.now() },
                    navController = navController,
                    onAddClick = { navigateToAddScreen(navController) }
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

    fun navigateToAddScreen(navController: NavController) {
        navController.navigate("addToDo")
    }
}