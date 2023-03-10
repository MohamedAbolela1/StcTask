package com.example.samplearch.utils.ui

import android.content.Context
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.example.samplearch.R


object LoadImage {
    fun loadFestivalImage(context: Context, src: String?, imageView: ImageView) {
        loadImage(context, src, R.drawable.ic_launcher_background, imageView)
    }

    private fun loadImage(
        context: Context,
        src: String?,
        @DrawableRes placeholder: Int? = R.drawable.ic_launcher_background,
        imageView: ImageView
    ) {
        placeholder?.let {
            Glide.with(context)
                .load(src)
                .placeholder(it)
                .into(imageView)
        } ?: run {
            Glide.with(context)
                .load(src)
                .into(imageView)
        }
    }
}