package com.example.samplearch.utils.platform

import android.os.Build
import com.example.samplearch.BuildConfig
import javax.inject.Inject

class Versions @Inject constructor() {
    fun isAndroidM(): Boolean =
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

    fun baseUrl(): String =
        BuildConfig.BASE_URL
}