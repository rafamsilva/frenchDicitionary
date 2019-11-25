package com.example.franch

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.media.Image
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat


class WordAdapter(context: Context, words: ArrayList<Word>, val colorResourceId: Int = 0) : ArrayAdapter<Word>(context, 0, words) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(
                R.layout.list_item, parent, false
            )
        }
        val words: Word? = getItem(position)
        if (words!!.hasSong()) {
            val mediaPlayer = MediaPlayer.create(context, words!!.songId)
            setSongListener(listItemView, mediaPlayer)
        }
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
        if (hasColorResource()) {
            val wordsContainer = listItemView.findViewById(R.id.words_view) as LinearLayout
            wordsContainer?.setBackgroundColor(ContextCompat.getColor(context, colorResourceId))
        }
        return listItemView
    }

    private fun setSongListener(listItemView: View?, mediaPlayer: MediaPlayer) {
        listItemView?.findViewById<LinearLayout>(R.id.list_item_view)?.setOnClickListener {
            mediaPlayer.setOnCompletionListener {
                changePlayerIcon(listItemView, R.drawable.play)
            }
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause()
                changePlayerIcon(listItemView, R.drawable.play)
            } else {
                mediaPlayer.start()
                changePlayerIcon(listItemView, R.drawable.pause)
            }
        }
    }

    private fun hasColorResource(): Boolean {
        return colorResourceId != 0
    }

    private fun changePlayerIcon(listItemView: View?, iconResource: Int) {
        listItemView?.findViewById<ImageView>(R.id.player_control)?.setImageResource(iconResource)
    }
}