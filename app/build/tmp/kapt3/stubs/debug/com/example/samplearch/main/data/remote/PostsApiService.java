package com.example.samplearch.main.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/samplearch/main/data/remote/PostsApiService;", "", "getPostsList", "Lcom/example/samplearch/main/data/model/PostResponse;", "type", "", "apiKey", "pageSize", "", "page", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PostsApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "everything")
    public abstract java.lang.Object getPostsList(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "q")
    java.lang.String type, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @retrofit2.http.Query(value = "pageSize")
    int pageSize, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.samplearch.main.data.model.PostResponse> continuation);
}