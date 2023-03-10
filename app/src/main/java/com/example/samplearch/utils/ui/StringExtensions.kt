package com.example.samplearch.utils.ui

fun String?.getValidText(validText: String = "---"): String {
    return this ?: validText
}