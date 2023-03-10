package com.example.samplearch.model

import androidx.annotation.DrawableRes
import com.example.samplearch.R

sealed class ErrorTypes(
    val errorMessage: StringModel?,
    val errorSubMessage: StringModel?,
    val errorIcon: Int?
) {
    object UnAuthorized : ErrorTypes(null, null, null)

    data class NoData(
        val message: StringModel = StringModel(R.string.no_data_found),
        val subMessage: StringModel = StringModel(R.string.please_try_again),
        @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
    ) : ErrorTypes(message, subMessage, icon)

    data class NoNetwork(
        val message: StringModel = StringModel(R.string.no_network_connection),
        val subMessage: StringModel = StringModel(R.string.please_try_again),
        @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
    ) : ErrorTypes(message, subMessage, icon)

    data class GeneralError(
        val message: StringModel = StringModel(R.string.something_went_wrong_please_try_again),
        val subMessage: StringModel? = null,
        @DrawableRes val icon: Int = R.drawable.ic_launcher_foreground
    ) : ErrorTypes(message, subMessage, icon)
}
