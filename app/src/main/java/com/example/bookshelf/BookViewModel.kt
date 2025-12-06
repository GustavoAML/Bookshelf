package com.example.bookshelf

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {
    private val repo = BookRepository(RetrofitInstance.api)
    var books by mutableStateOf<List<BookItem>>(emptyList())
        private set

    init {
        loadBooks()
    }

    private fun loadBooks() {
        viewModelScope.launch {
            books = repo.searchBooks("jazz history") // puedes cambiar el término
        }
    }
}
