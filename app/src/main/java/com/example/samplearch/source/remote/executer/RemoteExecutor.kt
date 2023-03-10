package com.example.samplearch.source.remote.executer


import com.example.samplearch.model.ApiErrorResponse
import com.example.samplearch.source.remote.interceptors.NoNetworkConnectionException
import com.example.samplearch.utils.parsing.ParsingHelper
import retrofit2.HttpException
import retrofit2.Response
import java.net.UnknownHostException

open class RemoteExecutor {
    protected suspend fun <R> executeApiCall(apiCall: suspend () -> R): R? {
        return try {
            apiCall.invoke()
        } catch (cause: Throwable) {
            mapApiCallException(cause)
            null
        }
    }

    private fun mapApiCallException(cause: Throwable) {
        when (cause) {
            is HttpException -> mapErrorBodyResponse(cause.response())
            is UnknownHostException -> throw NoNetworkConnectionException()
            else -> throw cause
        }
    }

    private fun mapErrorBodyResponse(response: Response<*>?) {
        if (response?.code() == 401) {
            throw UnAuthorizedException
        }
        val errorResponse = response?.errorBody()?.source()?.let {
            ParsingHelper.getListFromJsonArray(it, ApiErrorResponse::class.java)
        }
        throw ApiException(errorResponse)
    }
}

data class ApiException(val errorResponse: ApiErrorResponse?) : Exception()
object UnAuthorizedException : Exception()