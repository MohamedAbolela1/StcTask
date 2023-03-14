package com.example.samplearch.home.presentation.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/samplearch/home/presentation/adapter/PostsAdapter;", "Lcom/example/samplearch/base/BaseAdapter;", "Lcom/example/samplearch/home/domain/model/Post;", "onPostItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "Lcom/example/samplearch/base/BaseViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FestivalViewHolder", "app_debug"})
public final class PostsAdapter extends com.example.samplearch.base.BaseAdapter<com.example.samplearch.home.domain.model.Post> {
    private final kotlin.jvm.functions.Function1<com.example.samplearch.home.domain.model.Post, kotlin.Unit> onPostItemClicked = null;
    
    public PostsAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.samplearch.home.domain.model.Post, kotlin.Unit> onPostItemClicked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.samplearch.base.BaseViewHolder<com.example.samplearch.home.domain.model.Post> onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.samplearch.base.BaseViewHolder<com.example.samplearch.home.domain.model.Post> holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/samplearch/home/presentation/adapter/PostsAdapter$FestivalViewHolder;", "Lcom/example/samplearch/base/BaseViewHolder;", "Lcom/example/samplearch/home/domain/model/Post;", "binding", "Lcom/example/samplearch/databinding/ItemPostBinding;", "(Lcom/example/samplearch/home/presentation/adapter/PostsAdapter;Lcom/example/samplearch/databinding/ItemPostBinding;)V", "onBind", "", "item", "app_debug"})
    public final class FestivalViewHolder extends com.example.samplearch.base.BaseViewHolder<com.example.samplearch.home.domain.model.Post> {
        private final com.example.samplearch.databinding.ItemPostBinding binding = null;
        
        public FestivalViewHolder(@org.jetbrains.annotations.NotNull
        com.example.samplearch.databinding.ItemPostBinding binding) {
            super(null);
        }
        
        @java.lang.Override
        public void onBind(@org.jetbrains.annotations.NotNull
        com.example.samplearch.home.domain.model.Post item) {
        }
    }
}