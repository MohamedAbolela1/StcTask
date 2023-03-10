package com.example.samplearch.source.remote.interceptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/samplearch/source/remote/interceptors/BaseHeaderInterceptor;", "Lokhttp3/Interceptor;", "networkValidator", "Lcom/example/samplearch/utils/validation/network/NetworkValidator;", "(Lcom/example/samplearch/utils/validation/network/NetworkValidator;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "app_debug"})
public final class BaseHeaderInterceptor implements okhttp3.Interceptor {
    private final com.example.samplearch.utils.validation.network.NetworkValidator networkValidator = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.samplearch.source.remote.interceptors.BaseHeaderInterceptor.Companion Companion = null;
    private static final java.lang.String HEADER_PRAGMA = "Pragma";
    private static final java.lang.String HEADER_CACHE_CONTROL = "Cache-Control";
    
    @javax.inject.Inject
    public BaseHeaderInterceptor(@org.jetbrains.annotations.NotNull
    com.example.samplearch.utils.validation.network.NetworkValidator networkValidator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/samplearch/source/remote/interceptors/BaseHeaderInterceptor$Companion;", "", "()V", "HEADER_CACHE_CONTROL", "", "HEADER_PRAGMA", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}