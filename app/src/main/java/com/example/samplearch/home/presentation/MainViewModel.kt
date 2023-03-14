package com.example.samplearch.home.presentation

import androidx.lifecycle.*
import com.example.samplearch.base.BaseViewModel
import com.example.samplearch.home.data.model.PostResponse
import com.example.samplearch.home.data.repository.PostsRepository
import com.example.samplearch.home.domain.mapper.toPostList
import com.example.samplearch.home.domain.model.Post
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.model.ViewState
import com.example.samplearch.utils.ui.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val postsRepository: PostsRepository
) : BaseViewModel() {
    private val _productListState =
        MutableLiveData<ViewState<MutableList<Post>>>()
    val postListState: LiveData<ViewState<MutableList<Post>>> =
        _productListState

    private val _shouldClearPreviousList = SingleLiveEvent<Boolean>()
    val shouldClearPreviousList: LiveData<Boolean> = _shouldClearPreviousList


    init {
        getProductsServicesList()
    }

    fun refreshServicesList() {
        viewModelScope.launch {
            emitLoadingState(LoadingTypes.RefreshLoading(true))
            val productState = executeProductsListState()
            if (productState is ViewState.Success)
                clearPreviousData()
            emitProductListSate(productState)
            emitLoadingState(LoadingTypes.RefreshLoading(false))
        }
    }

    private fun clearPreviousData() {
        _shouldClearPreviousList.value = true
    }

    fun reloadServicesList() {
        getProductsServicesList()
    }

     fun getProductsServicesList() {
        viewModelScope.launch {
            emitLoadingState(LoadingTypes.MainLoading(true))
            val productState = executeProductsListState()
            if (productState is ViewState.Success)
                clearPreviousData()
            emitProductListSate(productState)
            emitLoadingState(LoadingTypes.MainLoading(false))
        }
    }

    private suspend fun executeProductsListState(): ViewState<MutableList<Post>> {
        val customizedServicesListState =
            validateResponse { postsRepository.getPostsList(1) }
        return mapProductListState(customizedServicesListState)
    }

    private fun mapProductListState(state: ViewState<PostResponse>): ViewState<MutableList<Post>> {
        return when (state) {
            is ViewState.Valid -> onProductListValid(state.data?.articles?.toMutableList())
            is ViewState.Error -> state
            else -> ViewState.Idle
        }
    }

    private fun onProductListValid(data: MutableList<PostResponse.Articles>?): ViewState<MutableList<Post>> {
        return if (data.isNullOrEmpty()) {
            ViewState.Error(ErrorTypes.NoData())
        } else {
            ViewState.Success(data.toPostList())
        }
    }

    private fun emitProductListSate(postListState: ViewState<MutableList<Post>>) {
        _productListState.value = postListState
    }

}
