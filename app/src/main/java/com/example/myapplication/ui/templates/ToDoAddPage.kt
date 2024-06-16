package com.example.myapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.myapplication.entity.ToDoItem
import com.example.myapplication.ui.organisms.AppBar
import java.time.LocalDate

@Composable
fun ToDoAddPage(navController: NavController, onAddToDoItem: (ToDoItem) -> Unit) {
    var selectedDate by remember { mutableStateOf(LocalDate.now()) }
    var showDialog by remember { mutableStateOf(false) }

    Scaffold(
        // TopAppBarを表示する
        topBar = { AppBar(title = "TODO追加", navController = navController) }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            //        CalendarView(
            //            startDate = LocalDate.now().minusMonths(1),
            //            endDate = LocalDate.now().plusMonths(1),
            //            selectedDate = selectedDate,
            //            onDateSelected = { date ->
            //                selectedDate = date
            //                showDialog = true
            //            }
            //        )

            //        if (showDialog) {
            //            AddToDoDialog(
            //                selectedDate = selectedDate,
            //                onDismiss = { showDialog = false },
            //                onAddToDoItem = { item ->
            //                    onAddToDoItem(item)
            //                    showDialog = false
            //                }
            //            )
            //        }
        }
    }
}