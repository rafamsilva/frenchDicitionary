package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PhrasesActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Onde você está indo?", "Où allez vous?"),
        Word("Qual o seu nome?", "Quel est votre nom?"),
        Word("Meu nome é...", "Je m'appelle..."),
        Word("Como você está?", "Comment ça va?"),
        Word("Eu estou me sentindo bem.", "Je me sens bien."),
        Word("Você está vindo?", "Tu viens?"),
        Word("Sim, eu estou indo.", "Oui, je vais."),
        Word("Estou indo.", "Je vais."),
        Word("Vamos.", "Allons."),
        Word("Vem aqui.", "Viens ici.")
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
