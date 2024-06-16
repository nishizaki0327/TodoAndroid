package com.example.myapplication.router

import androidx.navigation.NavController

class ToDoRouter {

    fun navigateToDetailScreen(navController: NavController, itemId: Int) {
        navController.navigate("todoDetail/$itemId")
    }

    fun navigateToAddScreen(navController: NavController) {
        navController.navigate("addToDo")
    }
}