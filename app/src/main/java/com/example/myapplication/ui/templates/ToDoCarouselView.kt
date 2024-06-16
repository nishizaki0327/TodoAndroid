package com.example.myapplication.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.entity.ToDoItem
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import com.google.accompanist.pager.HorizontalPagerIndicator

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ToDoCarouselView(toDoItems: List<ToDoItem>) {
    val pagerState = rememberPagerState()
    Column {
        HorizontalPager(
            count = toDoItems.size,
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) { page ->
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = toDoItems[page].title)
                    Text(text = toDoItems[page].description)
                }
            }
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp)
        )
    }
}