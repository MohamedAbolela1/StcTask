package com.example.samplearch.base

import androidx.core.view.isVisible
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.databinding.LayoutProgressHoverBinding
import com.example.samplearch.databinding.LayoutProgressMainBinding


interface LoadingBinding {
    fun bindLoading(
        loadingTypes: LoadingTypes,
        layoutProgressMain: LayoutProgressMainBinding? = null,
        layoutHover: LayoutProgressHoverBinding? = null,
        layoutProgressPaging: LayoutProgressMainBinding? = null,
        swipeRefresh: SwipeRefreshLayout? = null,
    ) {
        when (loadingTypes) {
            is LoadingTypes.MainLoading ->
                bindLoadingMain(loadingTypes.isLoading, layoutProgressMain)
            is LoadingTypes.HoverLoading ->
                bindLoadingHover(loadingTypes.isLoading, layoutHover)
            is LoadingTypes.RefreshLoading ->
                bindLoadingRefresh(loadingTypes.isLoading, swipeRefresh)
            is LoadingTypes.PagingLoading ->
                bindLoadingPaging(loadingTypes.isLoading, layoutProgressPaging)
        }
    }

    fun bindLoadingMain(isLoading: Boolean, layoutProgress: LayoutProgressMainBinding?) {
        layoutProgress?.let {
            it.progress.isVisible = isLoading
        }
    }

    fun bindLoadingHover(isLoading: Boolean, layoutProgress: LayoutProgressHoverBinding?) {
        layoutProgress?.let {
            it.progressHover.isVisible = isLoading
        }
    }

    fun bindLoadingPaging(isLoading: Boolean, layoutProgress: LayoutProgressMainBinding?) {
        layoutProgress?.let {
            it.progress.isVisible = isLoading
        }
    }

    fun bindLoadingRefresh(isLoading: Boolean, layoutProgress: SwipeRefreshLayout?) {
        layoutProgress?.let {
            it.isRefreshing = isLoading
        }
    }
}