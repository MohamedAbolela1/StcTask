package com.example.samplearch.home

import android.view.LayoutInflater
import com.example.samplearch.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import com.example.samplearch.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun setup() {

    }
}
