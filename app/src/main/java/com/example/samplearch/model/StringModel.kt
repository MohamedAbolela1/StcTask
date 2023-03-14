package com.example.samplearch.model

import android.content.Context
import java.util.*

data class StringModel(private val target: Any?) {
    fun getMessage(context: Context, local: Locale = Locale.getDefault()): String {
        return when (target) {
            is String -> String.format(local, target)
            is Int -> String.format(local, context.getString(target))
            else -> throw IllegalArgumentException("Please, pass string or string resource")
        }
    }
}