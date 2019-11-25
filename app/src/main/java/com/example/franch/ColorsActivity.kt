package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ColorsActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Vermelho", "Rouge", R.drawable.color_red),
        Word("Verde", "Vert", R.drawable.color_green),
        Word("Marrom", "Brown", R.drawable.color_brown),
        Word("Cinza", "Gris", R.drawable.color_gray),
        Word("Preto", "Noir", R.drawable.color_black),
        Word("Branco", "Blanc", R.drawable.color_white),
        Word("Rosa", "Rose", R.drawable.color_pink),
        Word("Amarelo", "Jaune", R.drawable.color_mustard_yellow)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        renderView()
    }

    private fun renderView() {
        val adapter = WordAdapter(this, words, R.color.colorPurple)
        val listView: ListView = findViewById(R.id.word_list_view)
        listView.adapter = adapter
    }
}
