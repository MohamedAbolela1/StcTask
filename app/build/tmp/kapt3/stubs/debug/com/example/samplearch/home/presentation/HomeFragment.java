package com.example.samplearch.home.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001c\u0010\u001e\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\"H\u0002J\u0016\u0010&\u001a\u00020\u00192\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0016J\b\u0010-\u001a\u00020\u0019H\u0002R.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/samplearch/home/presentation/HomeFragment;", "Lcom/example/samplearch/base/BaseFragment;", "Lcom/example/samplearch/databinding/FragmentHomeBinding;", "Lcom/example/samplearch/base/ErrorBinding;", "()V", "bindingInflater", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "getBindingInflater", "()Lkotlin/jvm/functions/Function3;", "errorLayoutBinding", "Lcom/example/samplearch/databinding/LayoutMainErrorBinding;", "getErrorLayoutBinding", "()Lcom/example/samplearch/databinding/LayoutMainErrorBinding;", "mainViewModel", "Lcom/example/samplearch/home/presentation/MainViewModel;", "getMainViewModel", "()Lcom/example/samplearch/home/presentation/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "postsAdapter", "Lcom/example/samplearch/home/presentation/adapter/PostsAdapter;", "bindAdapterState", "", "shouldClearAdapter", "bindLoadingState", "loadingTypes", "Lcom/example/samplearch/model/LoadingTypes;", "bindPostsListState", "state", "Lcom/example/samplearch/model/ViewState;", "", "Lcom/example/samplearch/home/domain/model/Post;", "observeViewModels", "onPostItemClicked", "post", "onPostsSuccess", "postsList", "onViewStateError", "errorTypes", "Lcom/example/samplearch/model/ErrorTypes;", "setListeners", "setup", "setupRecyclerView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class HomeFragment extends com.example.samplearch.base.BaseFragment<com.example.samplearch.databinding.FragmentHomeBinding> implements com.example.samplearch.base.ErrorBinding {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.samplearch.home.presentation.adapter.PostsAdapter postsAdapter;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, com.example.samplearch.databinding.FragmentHomeBinding> getBindingInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.samplearch.databinding.LayoutMainErrorBinding getErrorLayoutBinding() {
        return null;
    }
    
    private final com.example.samplearch.home.presentation.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void setup() {
    }
    
    private final void setListeners() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void onPostItemClicked(com.example.samplearch.home.domain.model.Post post) {
    }
    
    private final void observeViewModels() {
    }
    
    private final void bindAdapterState(boolean shouldClearAdapter) {
    }
    
    private final void bindPostsListState(com.example.samplearch.model.ViewState<? extends java.util.List<com.example.samplearch.home.domain.model.Post>> state) {
    }
    
    private final void onPostsSuccess(java.util.List<com.example.samplearch.home.domain.model.Post> postsList) {
    }
    
    private final void onViewStateError(com.example.samplearch.model.ErrorTypes errorTypes) {
    }
    
    private final void bindLoadingState(com.example.samplearch.model.LoadingTypes loadingTypes) {
    }
    
    public void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.samplearch.model.ErrorTypes errorType) {
    }
    
    public void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.samplearch.model.ErrorTypes errorType, boolean allowReload, @org.jetbrains.annotations.NotNull
    android.view.View[] hiddenLayout, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onReload) {
    }
    
    public void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.lang.Integer errorImage, @org.jetbrains.annotations.Nullable
    java.lang.String errorSubMessage) {
    }
    
    public void bindSuccess(@org.jetbrains.annotations.NotNull
    android.view.View... hiddenLayout) {
    }
}