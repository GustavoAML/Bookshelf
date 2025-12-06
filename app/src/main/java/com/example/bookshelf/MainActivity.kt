package com.example.bookshelf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelf.ui.theme.BookshelfScreen
import com.example.bookshelf.ui.theme.BookshelfTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Aplicamos el tema visual
            BookshelfTheme {
                val vm: BookViewModel = viewModel()
                // Pantalla principal con la cuadrícula de portadas
                BookshelfScreen(viewModel = vm)
            }
        }
    }
}
