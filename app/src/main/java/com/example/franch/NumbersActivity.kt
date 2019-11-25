package com.example.franch

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class NumbersActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Um", "Un", R.drawable.one, R.raw.numer_one),
        Word("Dois", "Deux", R.drawable.two, R.raw.number_two),
        Word("Três", "Trois", R.drawable.three, R.raw.number_three),
        Word("Quatro", "Quatre", R.drawable.four, R.raw.number_four),
        Word("Cinco", "Cinq", R.drawable.five, R.raw.number_five),
        Word("Seis", "Six", R.drawable.six, R.raw.number_six),
        Word("Sete", "Sept", R.drawable.seven, R.raw.number_seven),
        Word("Oito", "Huit", R.drawable.eight, R.raw.number_eight),
        Word("Nove", "Neuf", R.drawable.nine, R.raw.number_nine),
        Word("Dez", "Dix", R.drawable.ten, R.raw.number_ten)
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
