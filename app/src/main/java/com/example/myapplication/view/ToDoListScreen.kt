package com.example.myapplication.view

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.entity.ToDoItem
import androidx.compose.material3.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToDoListScreen(toDoItems: List<ToDoItem>, onAddClick: () -> Unit) {
    Scaffold(
        // TopAppBarを表示する
        topBar = {
            TopAppBar (
                // TopAppBarの色を設定する
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                // TopAppBarのタイトルを設定する
                title = {
                    Text("TODO管理")

                }
            )
        },
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
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