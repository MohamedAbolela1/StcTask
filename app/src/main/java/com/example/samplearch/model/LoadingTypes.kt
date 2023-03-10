package com.example.samplearch.model

sealed class LoadingTypes(open val isLoading: Boolean) {
    data class MainLoading(override val isLoading: Boolean) : LoadingTypes(isLoading)
    data class PagingLoading(override val isLoading: Boolean) : LoadingTypes(isLoading)
    data class HoverLoading(override val isLoading: Boolean) : LoadingTypes(isLoading)
    data class RefreshLoading(override val isLoading: Boolean) : LoadingTypes(isLoading)
}