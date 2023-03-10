package com.khabeer.tamshia_user.utils.extension

import android.text.Editable
import android.text.TextWatcher
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.flow.MutableStateFlow

fun TextInputEditText.getQueryTextChangeStateFlow(): MutableStateFlow<String?> {
    val query = MutableStateFlow<String?>(null)

    addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun afterTextChanged(p0: Editable?) {
            if (this@getQueryTextChangeStateFlow.hasFocus())
                query.value = p0?.toString()
        }
    })
    return query
}