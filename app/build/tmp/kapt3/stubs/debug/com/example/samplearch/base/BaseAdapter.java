package com.example.samplearch.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010\u000e\u001a\u00020\fJ\u0014\u0010\u000f\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/example/samplearch/base/BaseAdapter;", "item", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/samplearch/base/BaseViewHolder;", "()V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "addAll", "", "insertedItemList", "clearData", "insertAll", "remove", "index", "", "app_debug"})
public abstract class BaseAdapter<item extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.samplearch.base.BaseViewHolder<item>> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<item> data;
    
    public BaseAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.util.List<item> getData() {
        return null;
    }
    
    protected final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<item> p0) {
    }
    
    public final void insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<item> insertedItemList) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull
    java.util.List<item> insertedItemList) {
    }
    
    public final void clearData() {
    }
    
    public final void remove(int index) {
    }
}