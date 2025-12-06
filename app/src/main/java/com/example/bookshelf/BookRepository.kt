package com.example.bookshelf

class BookRepository(private val api: BookService) {
    suspend fun searchBooks(query: String): List<BookItem> {
        return api.searchBooks(query).items ?: emptyList()
    }
}