package com.example.bookshelf

import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET("volumes")
    suspend fun searchBooks(@Query("q") query: String): BookResponse
}