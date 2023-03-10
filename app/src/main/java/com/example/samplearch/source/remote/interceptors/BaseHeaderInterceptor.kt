package com.example.samplearch.source.remote.interceptors

import com.example.samplearch.utils.validation.network.NetworkValidator
import okhttp3.Interceptor
import okhttp3.Response
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import okhttp3.CacheControl


class BaseHeaderInterceptor @Inject constructor(
    private val networkValidator: NetworkValidator
) : Interceptor {
    companion object {
        private const val HEADER_PRAGMA = "Pragma"
        private const val HEADER_CACHE_CONTROL = "Cache-Control"
    }

    override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(
        if(networkValidator.isConnected())
            chain.request().newBuilder()
                .removeHeader(HEADER_PRAGMA)
                .removeHeader(HEADER_CACHE_CONTROL)
                .cacheControl(CacheControl.Builder()
                    .maxStale(
                        2,
                        TimeUnit.DAYS
                    )
                    .build())
                .build()
        else
            chain.request().newBuilder()
                .removeHeader(HEADER_PRAGMA)
                .removeHeader(HEADER_PRAGMA)
                .cacheControl(CacheControl.Builder()
                    .maxStale(
                        2,
                        TimeUnit.DAYS
                    )
                    .build())
                .build()
    )

}