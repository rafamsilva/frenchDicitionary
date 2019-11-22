package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MembersFamilyActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Pai", "Père"),
        Word("Mãe", "Mère"),
        Word("Filho", "Fils"),
        Word("Filha", "Fille"),
        Word("Irmão mais velho", "Grand frère"),
        Word("Irmão mais novo", "Petit frère"),
        Word("Irmã mais velha", "Grande soeur"),
        Word("Irmã mais nova", "Petite soeur"),
        Word("Avó", "Grand-père"),
        Word("Avô", "Grand-mère")
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
