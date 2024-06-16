package com.example.myapplication.ui.templates

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.ui.organisms.AppBar

@Composable
fun MainLayout(
    title: String,
    navController: NavController,
    content: @Composable () -> Unit
) {
    Scaffold(
        topBar = { AppBar(title = title, navController = navController) },
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                content()
            }
        }
    )
}