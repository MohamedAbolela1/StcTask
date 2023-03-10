package com.example.samplearch.source.remote.executer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/samplearch/source/remote/executer/RemoteExecutor;", "", "()V", "executeApiCall", "R", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapApiCallException", "", "cause", "", "mapErrorBodyResponse", "response", "Lretrofit2/Response;", "app_debug"})
public class RemoteExecutor {
    
    public RemoteExecutor() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <R extends java.lang.Object>java.lang.Object executeApiCall(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super R> continuation) {
        return null;
    }
    
    private final void mapApiCallException(java.lang.Throwable cause) {
    }
    
    private final void mapErrorBodyResponse(retrofit2.Response<?> response) {
    }
}