package com.khabeer.tamshia_user.utils.ui.slider.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.khabeer.tamshia_user.base.BaseAdapter
import com.khabeer.tamshia_user.base.BaseViewHolder
import com.khabeer.tamshia_user.databinding.ItemSliderImageBinding
import com.khabeer.tamshia_user.utils.ui.slider.domain.model.Slider

class SliderAdapter : BaseAdapter<Slider>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Slider> {
        val binding =
            ItemSliderImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagesSliderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<Slider>, position: Int) {
        holder.onBind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ImagesSliderViewHolder(private val binding: ItemSliderImageBinding) :
        BaseViewHolder<Slider>(binding.root) {
        override fun onBind(item: Slider) {
            with(binding) {
                Glide.with(root.context)
                    .load(item.imageUrl)
                    .placeholder(item.placeHolder)
                    .into(imgSlider)
            }
        }
    }
}