package com.khabeer.tamshia_user.utils.ui.toolbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.Toolbar
import com.khabeer.tamshia_user.databinding.ToolbarWithImageBinding
import com.khabeer.tamshia_user.utils.ui.helper.LoadImage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ImageToolbar(context: Context, attrs: AttributeSet) : Toolbar(context, attrs) {

    private var binding =
        ToolbarWithImageBinding.inflate(LayoutInflater.from(context), this, true)

    val toolbar = binding.toolbar
    val imgToolbarPersonal = binding.imgToolbarPersonal

    init {
        initViews()
    }

    private fun initViews() {

    }

    fun bindUserImage(url: String?) {
        LoadImage.loadUserImage(context, url, imgToolbarPersonal)
    }
}