package com.example.samplearch.utils.ui

import java.text.SimpleDateFormat
import java.util.*

object DateFormat {

    private const val SERVER_DATE_PATTERN = "yyyy-MM-dd"
    const val UI_DATE_PATTERN = "dd MMM yyy"

    fun formatStringDateToString(
        date: String?,
        currentFormat: String = SERVER_DATE_PATTERN,
        desiredFormat: String = UI_DATE_PATTERN,
        locale: Locale = Locale.getDefault()
    ): String? {
        return try {
            var format = SimpleDateFormat(currentFormat, locale)
            val newDate = date?.let { format.parse(date) }

            format = SimpleDateFormat(desiredFormat, locale)
            newDate?.let { format.format(it) }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}