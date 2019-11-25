package com.example.franch

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat


class WordAdapter(context: Context, words: ArrayList<Word>, val colorResourceId: Int) : ArrayAdapter<Word>(context, 0, words) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false
            )
        }
        val words: Word? = getItem(position)
        val frenchTextView = listItemView?.findViewById(R.id.french_text_view) as TextView
        frenchTextView.text = words?.frenchTranslation
        val defaultTextView =  listItemView.findViewById(R.id.default_text_view) as TextView
        defaultTextView.text = words?.defaultTranslation
        val imageView = listItemView.findViewById(R.id.image_view) as ImageView
        if (words!!.hasImage()) {
            imageView.setImageResource(words!!.imageId)
        } else {
            imageView.visibility = View.GONE
        }
        val wordsContainer = listItemView.findViewById(R.id.words_view) as LinearLayout
        wordsContainer.setBackgroundColor(ContextCompat.getColor(context, colorResourceId))
        return listItemView
    }
}