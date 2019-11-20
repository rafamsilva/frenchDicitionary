package com.example.franch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createListeners()
    }

    private fun createListeners() {
        findViewById<TextView>(R.id.numberTextView).setOnClickListener {
            openActivity<NumbersActivity>()
        }
        findViewById<TextView>(R.id.membersFamilyTextView).setOnClickListener {
            openActivity<MembersFamilyActivity>()
        }
        findViewById<TextView>(R.id.colorsTextView).setOnClickListener {
            openActivity<ColorsActivity>()
        }
        findViewById<TextView>(R.id.phrasesTextView).setOnClickListener {
            openActivity<PhrasesActivity>()
        }
    }

    private inline fun <reified T> openActivity() {
        val intent = Intent(this, T::class.java)
        startActivity(intent)
    }
}
