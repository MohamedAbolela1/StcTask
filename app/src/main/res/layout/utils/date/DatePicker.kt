package com.khabeer.tamshia_user.utils.date

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.widget.DatePicker
import android.widget.TimePicker
import com.khabeer.tamshia_user.R
import java.util.*

object DatePicker {
    private val calendar: Calendar = Calendar.getInstance()

    fun showDateTime(
        context: Context,
        minDate: Long? = null,
        maxDate: Long? = null,
        initializedDate: Date? = null,
        onDateTimePicked: (Date) -> Unit
    ) {
        showDatePicker(context, minDate, maxDate, initializedDate) {
            showTimePicker(context, onDateTimePicked)
        }
    }

    fun showDatePicker(
        context: Context,
        minDate: Long? = null,
        maxDate: Long? = null,
        initializedDate: Date? = null,
        selectedDat: (Date) -> Unit
    ) {
        showDatePickerDialog(
            context,
            minDate,
            maxDate,
            initializedDate
        ) { _: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->

            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            calendar.set(Calendar.HOUR_OF_DAY, 0)
            calendar.set(Calendar.MINUTE, 0)
            calendar.set(Calendar.SECOND, 0)
            calendar.set(Calendar.MILLISECOND, 0)
            val selectedDate = calendar.time
            selectedDat(selectedDate)
        }
    }

    private fun showTimePicker(context: Context, onTimePicked: (Date) -> Unit) {
        showTimePickerDialog(context) { _: TimePicker?, hours: Int, minutes: Int ->
            calendar.set(Calendar.HOUR_OF_DAY, hours)
            calendar.set(Calendar.MINUTE, minutes)
            val selectedDateTime = calendar.time
            onTimePicked(selectedDateTime)
        }
    }

    private fun showTimePickerDialog(
        context: Context,
        listener: ((view: TimePicker?, hours: Int, min: Int) -> Unit)? = null
    ) {
        val calendar = Calendar.getInstance(TimeZone.getDefault())
        val timePicker = TimePickerDialog(
            context,
            R.style.DatePickerTheme,
            listener,
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            false
        )
        timePicker.show()
    }

    private fun showDatePickerDialog(
        context: Context,
        minDate: Long? = null,
        maxDate: Long? = null,
        initializedDate: Date? = null,
        listener: ((view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) -> Unit)? = null
    ) {
        val calendar = Calendar.getInstance(TimeZone.getDefault())
        initializedDate?.let { calendar.time = it }
        val datePickerDialog = DatePickerDialog(
            context,
            R.style.DatePickerTheme,
            listener,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )
        val datePicker = datePickerDialog.datePicker
        minDate?.let { datePicker.minDate = it }
        maxDate?.let { datePicker.maxDate = it }
        datePickerDialog.show()
    }
}