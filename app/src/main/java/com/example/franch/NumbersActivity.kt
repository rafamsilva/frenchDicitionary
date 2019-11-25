package com.example.franch

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class NumbersActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Um", "Un", R.drawable.one),
        Word("Dois", "Deux", R.drawable.two),
        Word("Três", "Trois", R.drawable.three),
        Word("Quatro", "Quatre", R.drawable.four),
        Word("Cinco", "Cinq", R.drawable.five),
        Word("Seis", "Six", R.drawable.six),
        Word("Sete", "Sept", R.drawable.seven),
        Word("Oito", "Huit", R.drawable.eight),
        Word("Nove", "Neuf", R.drawable.nine),
        Word("Dez", "Dix", R.drawable.ten)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        renderView()
    }

    private fun renderView() {
        val adapter = WordAdapter(this, words, R.color.colorOrange)
        val listView: ListView = findViewById(R.id.word_list_view)
        listView.adapter = adapter
    }

}
