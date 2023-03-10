package com.example.samplearch.model

import android.content.Context
import java.util.*

class StringModel(
    private val target: Any?,
    private vararg val args: String
) {
    fun getMessage(context: Context, local: Locale = Locale.getDefault()): String {
        return when (target) {
            is String -> String.format(local, target, *args)
            is Int -> String.format(local, context.getString(target), *args)
            else -> throw IllegalArgumentException("Please, pass string or string resource")
        }
    }
}