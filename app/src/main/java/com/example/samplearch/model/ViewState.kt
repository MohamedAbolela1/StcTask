package com.example.samplearch.model

sealed class ViewState<out T> {
    data class Valid<T>(val data: T?) : ViewState<T>()
    data class Success<T>(val data: T) : ViewState<T>()
    data class Error(val errorTypes: ErrorTypes) : ViewState<Nothing>()
    object Idle : ViewState<Nothing>()
}
