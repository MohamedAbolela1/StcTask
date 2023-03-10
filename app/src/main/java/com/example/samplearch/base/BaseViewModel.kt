package com.example.samplearch.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.samplearch.model.ErrorTypes
import com.example.samplearch.model.LoadingTypes
import com.example.samplearch.model.StringModel
import com.example.samplearch.model.ViewState
import com.example.samplearch.source.remote.executer.ApiException
import com.example.samplearch.source.remote.executer.UnAuthorizedException
import com.example.samplearch.source.remote.interceptors.NoNetworkConnectionException
import com.example.samplearch.R


abstract class BaseViewModel : ViewModel() {

    private val _loadingStateLiveData = MutableLiveData<LoadingTypes>()
    val loadingStateLiveData: LiveData<LoadingTypes> = _loadingStateLiveData

    private val _messageStateLiveData = MutableLiveData<StringModel>()
    val messageStateLiveData: LiveData<StringModel> = _messageStateLiveData

    protected fun emitLoadingState(loadingTypes: LoadingTypes) {
        _loadingStateLiveData.value = loadingTypes
    }

    protected fun emitMessageState(message: StringModel) {
        _messageStateLiveData.value = message
    }

    protected suspend fun <T> validateResponse(call: suspend () -> T?): ViewState<T> {
        return try {
            val apiResponse: T? = call()
            getResponseState(apiResponse)
        } catch (exception: NoNetworkConnectionException) {
            return getNoNetworkExceptionState()
        } catch (exception: UnAuthorizedException) {
            ViewState.Error(ErrorTypes.UnAuthorized)
        } catch (exception: ApiException) {
            getApiExceptionState(exception)
        }
    }

    private fun <T> getResponseState(apiResponse: T?): ViewState<T> {
        return if (apiResponse != null)
            ViewState.Valid(apiResponse)
        else
            ViewState.Error(
                ErrorTypes.GeneralError(
                    StringModel(target = R.string.something_went_wrong_please_try_again)
                )
            )
    }

    private fun getNoNetworkExceptionState(): ViewState.Error {
        return ViewState.Error(
            ErrorTypes.NoNetwork()
        )
    }

    private fun getApiExceptionState(exception: ApiException): ViewState.Error {
        val error = exception.errorResponse?.message
        val message = if (error.isNullOrEmpty()) {
            StringModel(R.string.something_went_wrong_please_try_again)
        } else {
            StringModel(error)
        }
        return ViewState.Error(ErrorTypes.GeneralError(message))
    }
}