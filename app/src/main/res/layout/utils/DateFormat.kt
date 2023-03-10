package com.khabeer.tamshia_user.utils

import java.text.SimpleDateFormat
import java.util.*

object DateFormat {
    private const val UI_TIME_PATTERN = "hh:mm a"
    private const val SERVER_TIME_PATTERN = "hh:mm a"
    private const val SERVER_DATE_PATTERN = "yyyy-MM-dd"
    const val DD_MM_YYYY = "dd-MM-yyyy"
    const val HH_MM = "hh:mm"
    const val UI_DATE_PATTERN = "dd MMM yyy"
    const val UI_DATE_TIME_PATTERN = "dd MMM yyy - hh:mm a"
    private const val OFFER_DATE_TIME_PATTERN = "dd/MM/yyyy - hh:mm a"
    private const val SERVER_DATE_TIME_PATTERN = "yyyy-MM-dd hh:mm a"
    const val UI_DATE_SPLASHES = "dd/MM/yyy"

    fun formatDateToString(
        date: Date?,
        desiredFormat: String = UI_TIME_PATTERN,
        locale: Locale = Locale.getDefault()
    ): String? {
        return try {
            val format = SimpleDateFormat(desiredFormat, locale)
            date?.let { format.format(it) }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun formatDateTimeToString(
        date: String?,
        currentFormat: String = SERVER_DATE_TIME_PATTERN,
        desiredFormat: String = OFFER_DATE_TIME_PATTERN,
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

    fun formatStringTimeToString(
        date: String?,
        currentFormat: String = SERVER_TIME_PATTERN,
        desiredFormat: String = UI_TIME_PATTERN,
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