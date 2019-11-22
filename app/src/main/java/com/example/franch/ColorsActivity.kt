package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorsActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Vermelho", "Rouge"),
        Word("Verde", "Vert"),
        Word("Marrom", "Brown"),
        Word("Cinza", "Gris"),
        Word("Preto", "Noir"),
        Word("Branco", "Blanc"),
        Word("Rosa", "Rose"),
        Word("Laranja", "Orange")
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
