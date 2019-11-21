package com.example.franch

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class NumbersActivity : AppCompatActivity() {

    private val portugueseNumbers = arrayListOf("Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez")
    private val frenchNumbers = arrayListOf("Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)
        renderNumbers()
    }

    private fun renderNumbers() {
        val listView: ListView = findViewById(R.id.numberView)
        listView.setAdapter(ArrayAdapter<String>(this, R.layout.list_item, portugueseNumbers))
    }

}
