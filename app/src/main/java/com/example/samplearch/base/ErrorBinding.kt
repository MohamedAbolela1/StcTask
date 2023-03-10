package com.example.samplearch.base

import android.content.Context
import android.view.View
import android.view.View.VISIBLE
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.databinding.LayoutMainErrorBinding


interface ErrorBinding {
    val errorLayoutBinding: LayoutMainErrorBinding

    fun bindError(
        context: Context,
        errorMessage: String,
        errorImage: Int? = null,
        errorSubMessage: String? = null
    ) {
        with(errorLayoutBinding) {
            root.visibility = VISIBLE
            errorMessage.let { tvErrorText.text = it }
            errorSubMessage?.let { tvErrorSubText.text = it }
            errorImage?.let {
                imgError.setImageDrawable(ContextCompat.getDrawable(context, errorImage))
            }
        }
    }

    fun bindError(
        context: Context,
        errorType: ErrorTypes
    ) {
        with(errorLayoutBinding) {
            root.visibility = VISIBLE
            errorType.errorMessage?.let { tvErrorText.text = it.getMessage(context) }
            errorType.errorSubMessage?.let { tvErrorSubText.text = it.getMessage(context) }
            errorType.errorIcon?.let {
                imgError.setImageDrawable(ContextCompat.getDrawable(context, it))
            }
        }
    }

    fun bindError(
        context: Context,
        errorType: ErrorTypes,
        allowReload: Boolean = false,
        vararg hiddenLayout: View,
        onReload: (() -> Unit)? = null
    ) {
        for (view in hiddenLayout) {
            view.isVisible = false
        }
        with(errorLayoutBinding) {
            root.visibility = VISIBLE
            errorType.errorMessage?.let { tvErrorText.text = it.getMessage(context) }
            errorType.errorSubMessage?.let { tvErrorSubText.text = it.getMessage(context) }
            errorType.errorIcon?.let {
                imgError.setImageDrawable(ContextCompat.getDrawable(context, it))
            }
            btnReload.isVisible = allowReload
            btnReload.setOnClickListener {
                root.isVisible = false
                onReload?.invoke()
            }
        }
    }

    fun bindSuccess(vararg hiddenLayout: View) {
        errorLayoutBinding.root.isVisible = false
        for (view in hiddenLayout) {
            view.isVisible = true
        }
    }
}