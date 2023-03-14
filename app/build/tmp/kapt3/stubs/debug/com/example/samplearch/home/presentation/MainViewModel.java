package com.example.samplearch.home.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\u00020\u00142\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002J\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H\u0002J$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\bH\u0002J\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/samplearch/home/presentation/MainViewModel;", "Lcom/example/samplearch/base/BaseViewModel;", "postsRepository", "Lcom/example/samplearch/home/data/repository/PostsRepository;", "(Lcom/example/samplearch/home/data/repository/PostsRepository;)V", "_productListState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/samplearch/model/ViewState;", "", "Lcom/example/samplearch/home/domain/model/Post;", "_shouldClearPreviousList", "Lcom/example/samplearch/utils/ui/SingleLiveEvent;", "", "postListState", "Landroidx/lifecycle/LiveData;", "getPostListState", "()Landroidx/lifecycle/LiveData;", "shouldClearPreviousList", "getShouldClearPreviousList", "clearPreviousData", "", "emitProductListSate", "executeProductsListState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductsServicesList", "mapProductListState", "state", "Lcom/example/samplearch/home/data/model/PostResponse;", "onProductListValid", "data", "Lcom/example/samplearch/home/data/model/PostResponse$Articles;", "refreshServicesList", "reloadServicesList", "app_debug"})
public final class MainViewModel extends com.example.samplearch.base.BaseViewModel {
    private final com.example.samplearch.home.data.repository.PostsRepository postsRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.Post>>> _productListState = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.Post>>> postListState = null;
    private final com.example.samplearch.utils.ui.SingleLiveEvent<java.lang.Boolean> _shouldClearPreviousList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> shouldClearPreviousList = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.samplearch.home.data.repository.PostsRepository postsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.Post>>> getPostListState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShouldClearPreviousList() {
        return null;
    }
    
    public final void refreshServicesList() {
    }
    
    private final void clearPreviousData() {
    }
    
    public final void reloadServicesList() {
    }
    
    public final void getProductsServicesList() {
    }
    
    private final java.lang.Object executeProductsListState(kotlin.coroutines.Continuation<? super com.example.samplearch.model.ViewState<? extends java.util.List<com.example.samplearch.home.domain.model.Post>>> continuation) {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.Post>> mapProductListState(com.example.samplearch.model.ViewState<com.example.samplearch.home.data.model.PostResponse> state) {
        return null;
    }
    
    private final com.example.samplearch.model.ViewState<java.util.List<com.example.samplearch.home.domain.model.Post>> onProductListValid(java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> data) {
        return null;
    }
    
    private final void emitProductListSate(com.example.samplearch.model.ViewState<? extends java.util.List<com.example.samplearch.home.domain.model.Post>> postListState) {
    }
}