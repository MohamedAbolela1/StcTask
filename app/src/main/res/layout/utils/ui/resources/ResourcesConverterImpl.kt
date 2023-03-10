package com.example.samplearch.utils.ui.resources

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ResourcesConverterImpl @Inject constructor(@ApplicationContext private val context: Context) :
    ResourcesConverter {
    override fun convert(stringRes: Int, vararg options: Any): String {
        val string = context.getString(stringRes)
        return String.format(string, *options)
    }
}