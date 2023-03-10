package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/example/samplearch/base/LoadingBinding;", "", "bindLoading", "", "loadingTypes", "Lcom/example/samplearch/model/LoadingTypes;", "layoutProgressMain", "Lcom/example/samplearch/databinding/LayoutProgressMainBinding;", "layoutHover", "Lcom/example/samplearch/databinding/LayoutProgressHoverBinding;", "layoutProgressPaging", "swipeRefresh", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "bindLoadingHover", "isLoading", "", "layoutProgress", "bindLoadingMain", "bindLoadingPaging", "bindLoadingRefresh", "app_debug"})
public abstract interface LoadingBinding {
    
    public abstract void bindLoading(@org.jetbrains.annotations.NotNull
    com.example.samplearch.model.LoadingTypes loadingTypes, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressMain, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressHoverBinding layoutHover, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressPaging, @org.jetbrains.annotations.Nullable
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefresh);
    
    public abstract void bindLoadingMain(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress);
    
    public abstract void bindLoadingHover(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressHoverBinding layoutProgress);
    
    public abstract void bindLoadingPaging(boolean isLoading, @org.jetbrains.annotations.Nullable
    com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress);
    
    public abstract void bindLoadingRefresh(boolean isLoading, @org.jetbrains.annotations.Nullable
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout layoutProgress);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void bindLoading(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.LoadingBinding $this, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.LoadingTypes loadingTypes, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressMain, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressHoverBinding layoutHover, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgressPaging, @org.jetbrains.annotations.Nullable
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefresh) {
        }
        
        public static void bindLoadingMain(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.LoadingBinding $this, boolean isLoading, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress) {
        }
        
        public static void bindLoadingHover(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.LoadingBinding $this, boolean isLoading, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressHoverBinding layoutProgress) {
        }
        
        public static void bindLoadingPaging(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.LoadingBinding $this, boolean isLoading, @org.jetbrains.annotations.Nullable
        com.example.samplearch.databinding.LayoutProgressMainBinding layoutProgress) {
        }
        
        public static void bindLoadingRefresh(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.LoadingBinding $this, boolean isLoading, @org.jetbrains.annotations.Nullable
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout layoutProgress) {
        }
    }
}