package com.example.franch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MembersFamilyActivity : AppCompatActivity() {

    private val words = arrayListOf(
        Word("Pai", "Père", R.drawable.father),
        Word("Mãe", "Mère", R.drawable.mother),
        Word("Filho", "Fils", R.drawable.son),
        Word("Filha", "Fille", R.drawable.daughter),
        Word("Irmão mais velho", "Grand frère", R.drawable.older_brother),
        Word("Irmão mais novo", "Petit frère", R.drawable.newer_brother),
        Word("Irmã mais velha", "Grande soeur", R.drawable.older_sister),
        Word("Irmã mais nova", "Petite soeur", R.drawable.newer_sister),
        Word("Avó", "Grand-père", R.drawable.grandmother),
        Word("Avô", "Grand-mère", R.drawable.grandfather)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_list)
        renderView()
    }

    private fun renderView() {
        val adapter = WordAdapter(this, words, R.color.colorGreen)
        val listView: ListView = findViewById(R.id.word_list_view)
        listView.adapter = adapter
    }
}
