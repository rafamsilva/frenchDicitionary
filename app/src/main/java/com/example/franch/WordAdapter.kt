package com.example.franch

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class WordAdapter(context: Context, words: ArrayList<Word>) : ArrayAdapter<Word>(context, 0, words) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false
            )
        }
        val words: Word? = getItem(position)
        val frenchTextView = listItemView?.findViewById(R.id.french_text_view) as TextView
        frenchTextView.setText(words?.frenchTranslation)
        val defaultTextView =  listItemView.findViewById(R.id.default_text_view) as TextView
        defaultTextView.setText(words?.defaultTranslation)
        if (words?.imageId != 0) {
            val imageView =  listItemView.findViewById(R.id.image_view) as ImageView
            imageView.setImageResource(words!!.imageId)
        }

        return listItemView
    }
}