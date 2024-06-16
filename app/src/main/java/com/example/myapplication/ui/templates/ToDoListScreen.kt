package com.example.myapplication.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.entity.ToDoItem
import androidx.compose.material3.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.ui.organisms.AppBar
import java.time.LocalDate

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToDoListScreen(toDoItems: List<ToDoItem>, navController: NavController, onAddClick: () -> Unit) {
    Scaffold(
        // TopAppBarを表示する
        topBar = { AppBar(title = "TODO管理", navController = navController) }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text(text = "${LocalDate.now()}のTODO", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            if (toDoItems.isNotEmpty()) {
                ToDoCarouselView(toDoItems = toDoItems)
            } else {
                Text(
                    text = "No ToDo items for today.",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(16.dp)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onAddClick,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Add ToDo")
            }
        }
    }
}