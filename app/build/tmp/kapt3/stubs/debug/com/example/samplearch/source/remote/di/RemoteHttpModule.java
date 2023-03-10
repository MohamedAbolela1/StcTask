package com.example.samplearch.source.remote.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/samplearch/source/remote/di/RemoteHttpModule;", "", "()V", "TIME_OUT", "", "cacheSize", "providesOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "Lcom/example/samplearch/source/remote/interceptors/LoggingInterceptor;", "connectionInterceptor", "Lcom/example/samplearch/source/remote/interceptors/ConnectionInterceptor;", "baseHeaderInterceptor", "Lcom/example/samplearch/source/remote/interceptors/BaseHeaderInterceptor;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class RemoteHttpModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.samplearch.source.remote.di.RemoteHttpModule INSTANCE = null;
    private static final long TIME_OUT = 60L;
    private static long cacheSize = 10485760L;
    
    private RemoteHttpModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final okhttp3.OkHttpClient providesOkHttpClient(@org.jetbrains.annotations.NotNull
    com.example.samplearch.source.remote.interceptors.LoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull
    com.example.samplearch.source.remote.interceptors.ConnectionInterceptor connectionInterceptor, @org.jetbrains.annotations.NotNull
    com.example.samplearch.source.remote.interceptors.BaseHeaderInterceptor baseHeaderInterceptor, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
}