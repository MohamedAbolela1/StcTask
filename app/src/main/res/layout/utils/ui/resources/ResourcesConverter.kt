package com.example.samplearch.utils.ui.resources

import androidx.annotation.StringRes

interface ResourcesConverter {
    fun convert(@StringRes stringRes: Int, vararg options: Any): String
}