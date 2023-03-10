package com.example.samplearch.source.remote.di

import android.content.Context
import com.example.samplearch.source.remote.interceptors.BaseHeaderInterceptor
import com.example.samplearch.source.remote.interceptors.ConnectionInterceptor
import com.example.samplearch.source.remote.interceptors.LoggingInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteHttpModule{

    private const val TIME_OUT = 60L
    private var cacheSize = 10 * 1024 * 1024L // 10 MB

    @Provides
    @Singleton
    fun providesOkHttpClient(
        loggingInterceptor: LoggingInterceptor,
        connectionInterceptor: ConnectionInterceptor,
        baseHeaderInterceptor: BaseHeaderInterceptor,
        @ApplicationContext context: Context
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addInterceptor(baseHeaderInterceptor)
            .addInterceptor(connectionInterceptor)
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .cache(Cache(context.cacheDir, cacheSize))
            .build()
    }
}