package com.khabeer.tamshia_user.utils.ui.otp

import android.content.Context
import android.text.InputType
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import com.khabeer.tamshia_user.R

internal class OTPChildEditText : AppCompatEditText {

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr) {
        init(context)
    }

    private fun init(context: Context) {
        isCursorVisible = false
        setTextColor(ContextCompat.getColor(context, R.color.transparent))
        setBackgroundResource(0)
        inputType = InputType.TYPE_CLASS_NUMBER

        setSelectAllOnFocus(false)
        setTextIsSelectable(false)
    }

    public override fun onSelectionChanged(start: Int, end: Int) {

        val text = text
        text?.let {
            if (start != it.length || end != it.length) {
                setSelection(it.length, it.length)
                return
            }
        }

        super.onSelectionChanged(start, end)
    }

}