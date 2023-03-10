package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H&R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\f\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/samplearch/base/BaseActivity;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_binding", "binding", "getBinding$annotations", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "getBindingInflater", "()Lkotlin/jvm/functions/Function1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setup", "app_debug"})
public abstract class BaseActivity<T extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    private androidx.viewbinding.ViewBinding _binding;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.jvm.functions.Function1<android.view.LayoutInflater, T> getBindingInflater();
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated
    protected static void getBinding$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final T getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void setup();
    
    @java.lang.Override
    protected void onDestroy() {
    }
}