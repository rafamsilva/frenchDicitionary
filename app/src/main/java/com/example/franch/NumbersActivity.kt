package com.example.franch

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class NumbersActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Um", "Un"),
        Word("Dois", "Deux"),
        Word("Três", "Trois"),
        Word("Quatro", "Quatre"),
        Word("Cinco", "Cinq"),
        Word("Seis", "Six"),
        Word("Sete", "Sept"),
        Word("Oito", "Huit"),
        Word("Nove", "Neuf"),
        Word("Dez", "Dix")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        renderView()
    }

    private fun renderView() {
        val adapter = WordAdapter(this, words)
        val listView: ListView = findViewById(R.id.word_list_view)
        listView.setAdapter(adapter)
    }

}
