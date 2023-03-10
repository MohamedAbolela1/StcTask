package com.khabeer.tamshia_user.utils.ui.phone

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatEditText
import androidx.constraintlayout.helper.widget.Flow
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import com.khabeer.tamshia_user.databinding.LayoutPhoneBinding

class TamshiaLayoutPhone(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private var binding: LayoutPhoneBinding =
        LayoutPhoneBinding.inflate(LayoutInflater.from(context), this, true)
    lateinit var edtPhoneNumber: AppCompatEditText
    lateinit var flowPhoneCode: Flow
    lateinit var tvPhoneCode: TextView
    lateinit var imgCountryFlag: ImageView

    var isErrorEnabled: Boolean = false
        set(value) {
            enableDisableErrorStyle(value)
        }

    var error: String?
        get() {
            return binding.tvError.text.toString()
        }
        set(value) {
            binding.tvError.text = value
        }

    init {
        initView()
    }

    private fun initView() {
        edtPhoneNumber = binding.edtPhoneNumber
        flowPhoneCode = binding.flowPhoneCode
        tvPhoneCode = binding.tvPhoneCode
        imgCountryFlag = binding.imgCountryFlag
        enableDisableErrorStyle(isErrorEnabled)
    }

    private fun enableDisableErrorStyle(isErrorEnabled: Boolean) {
        if (isErrorEnabled)
            enableErrorMode()
        else
            disableErrorMode()
    }

    private fun enableErrorMode() {
        binding.tvError.isVisible = true
        binding.imgError.isVisible = true
    }

    private fun disableErrorMode() {
        binding.tvError.isVisible = false
        binding.imgError.isVisible = false
    }
}