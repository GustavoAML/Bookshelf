package com.example.bookshelf.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.bookshelf.BookItem

@Composable
fun BookCard(book: BookItem) {
    val imageUrl = book.volumeInfo.imageLinks?.thumbnail?.replace("http://", "https://")

    Column(modifier = Modifier.padding(8.dp)) {
        AsyncImage(
            model = imageUrl,
            contentDescription = book.volumeInfo.title ?: "Sin título",
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
        )
        Text(book.volumeInfo.title ?: "Sin título")
    }
}

