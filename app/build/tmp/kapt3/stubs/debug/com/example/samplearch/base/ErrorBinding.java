package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JM\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J5\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0016\u00a2\u0006\u0002\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f\"\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u001bR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/example/samplearch/base/ErrorBinding;", "", "errorLayoutBinding", "Lcom/example/samplearch/databinding/LayoutMainErrorBinding;", "getErrorLayoutBinding", "()Lcom/example/samplearch/databinding/LayoutMainErrorBinding;", "bindError", "", "context", "Landroid/content/Context;", "errorType", "Lcom/example/samplearch/model/ErrorTypes;", "allowReload", "", "hiddenLayout", "", "Landroid/view/View;", "onReload", "Lkotlin/Function0;", "(Landroid/content/Context;Lcom/example/samplearch/model/ErrorTypes;Z[Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "errorMessage", "", "errorImage", "", "errorSubMessage", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "bindSuccess", "([Landroid/view/View;)V", "app_debug"})
public abstract interface ErrorBinding {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.samplearch.databinding.LayoutMainErrorBinding getErrorLayoutBinding();
    
    public abstract void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.lang.Integer errorImage, @org.jetbrains.annotations.Nullable
    java.lang.String errorSubMessage);
    
    public abstract void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.samplearch.model.ErrorTypes errorType);
    
    public abstract void bindError(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.samplearch.model.ErrorTypes errorType, boolean allowReload, @org.jetbrains.annotations.NotNull
    android.view.View[] hiddenLayout, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> onReload);
    
    public abstract void bindSuccess(@org.jetbrains.annotations.NotNull
    android.view.View... hiddenLayout);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void bindError(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.ErrorBinding $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer errorImage, @org.jetbrains.annotations.Nullable
        java.lang.String errorSubMessage) {
        }
        
        public static void bindError(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.ErrorBinding $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.ErrorTypes errorType) {
        }
        
        public static void bindError(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.ErrorBinding $this, @org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.ErrorTypes errorType, boolean allowReload, @org.jetbrains.annotations.NotNull
        android.view.View[] hiddenLayout, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function0<kotlin.Unit> onReload) {
        }
        
        public static void bindSuccess(@org.jetbrains.annotations.NotNull
        com.example.samplearch.base.ErrorBinding $this, @org.jetbrains.annotations.NotNull
        android.view.View... hiddenLayout) {
        }
    }
}