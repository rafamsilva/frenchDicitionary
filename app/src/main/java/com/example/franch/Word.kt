package com.example.franch

data class Word(val defaultTranslation: String, val frenchTranslation: String, val imageId: Int = 0) {
    fun hasImage(): Boolean = imageId != 0
}