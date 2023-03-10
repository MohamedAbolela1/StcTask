package com.khabeer.tamshia_user.utils.ui.slider.presentation

import android.content.Context
import android.os.Handler
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.khabeer.tamshia_user.R
import com.khabeer.tamshia_user.databinding.LayoutSliderBinding
import com.khabeer.tamshia_user.utils.ui.slider.domain.model.Slider

class ImageSlider(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private var binding =
        LayoutSliderBinding.inflate(LayoutInflater.from(context), this, true)
    private lateinit var sliderAdapter: SliderAdapter

    init {
        setup()
    }

    fun bindData(imagesList: MutableList<Slider>) {
        if (!imagesList.isNullOrEmpty()) {
            sliderAdapter.insertAll(imagesList)
            setupIdicatorItems(imagesList)
        }
    }

    private fun setup() {
        setupViews()
        setCurrentIndicator(0)
        syncIndicator()
    }

    private fun setupViews() {
        sliderAdapter = SliderAdapter()
        with(binding) {
            pagerSlider.adapter = sliderAdapter
            layoutDirection = LAYOUT_DIRECTION_LOCALE
        }
    }

    private fun setCurrentIndicator(position: Int) {
        val indicatorsCount: Int = binding.indicator.childCount
        for (index in 0 until indicatorsCount) {
            val indicator = binding.indicator.getChildAt(index) as ImageView
            if (index == position) {
                // active indicator
                indicator.background = ContextCompat.getDrawable(
                    context,
                    R.drawable.background_white_active_indecator
                )
            } else {
                // inactive indicator
                indicator.background = ContextCompat.getDrawable(
                    context,
                    R.drawable.background_white_inactive_indecator
                )
            }
        }
    }

    private fun syncIndicator() {
        binding.pagerSlider.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
    }

    private fun setupIdicatorItems(data: MutableList<Slider>) {
        val indicators = Array(data.size) { ImageView(context) }
        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        val marginHorizontal = resources.getDimension(R.dimen.margin_small).toInt()
        params.setMargins(marginHorizontal, 0, marginHorizontal, 0)
        indicators.forEach {
            it.layoutParams = params
            it.background = ContextCompat.getDrawable(
                context,
                R.drawable.background_onboard_inactive_indecator
            )
            binding.indicator.addView(it)
        }
    }
}