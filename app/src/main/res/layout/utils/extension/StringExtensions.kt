package com.khabeer.tamshia_user.utils.extension

fun String?.getValidText(validText: String = "---"): String {
    return this ?: validText
}