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
    ToDoRouter().createNavHost()
}