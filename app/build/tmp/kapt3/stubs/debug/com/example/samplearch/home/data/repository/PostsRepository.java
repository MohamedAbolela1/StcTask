package com.example.samplearch.home.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/samplearch/home/data/repository/PostsRepository;", "", "postsRemoteDataSource", "Lcom/example/samplearch/home/data/remote/PostsRemoteDataSource;", "(Lcom/example/samplearch/home/data/remote/PostsRemoteDataSource;)V", "getPostsList", "Lcom/example/samplearch/home/data/model/PostResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PostsRepository {
    private final com.example.samplearch.home.data.remote.PostsRemoteDataSource postsRemoteDataSource = null;
    
    @javax.inject.Inject
    public PostsRepository(@org.jetbrains.annotations.NotNull
    com.example.samplearch.home.data.remote.PostsRemoteDataSource postsRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPostsList(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.samplearch.home.data.model.PostResponse> continuation) {
        return null;
    }
}