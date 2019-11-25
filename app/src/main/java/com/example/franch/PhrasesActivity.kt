package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class PhrasesActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Onde você está indo?", "Où allez vous?", songId = R.raw.phrase_ou_allez_vous),
        Word("Qual o seu nome?", "Quel est votre nom?",songId = R.raw.phrase_quel_est_votre_nom),
        Word("Meu nome é...", "Je m'appelle...", songId = R.raw.phrase_je_mappelle),
        Word("Como você está?", "Comment ça va?", songId = R.raw.phrase_comment_ca_va),
        Word("Eu estou me sentindo bem.", "Je me sens bien.", songId = R.raw.phrase_je_me_sens_bien),
        Word("Você está vindo?", "Tu viens?", songId = R.raw.phrase_tu_vien),
        Word("Sim, eu estou indo.", "Oui, je vais.",songId = R.raw.phrase_oui_je_vais),
        Word("Estou indo.", "Je vais.", songId = R.raw.phrase_je_vais),
        Word("Vamos.", "Allons.", songId = R.raw.phrase_allons),
        Word("Vem aqui.", "Viens ici.", songId = R.raw.phrase_vien_ici)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        renderView()
    }

    private fun renderView() {
        val adapter = WordAdapter(this, words, R.color.colorBlue)
        val listView: ListView = findViewById(R.id.word_list_view)
        listView.adapter = adapter
    }
}
