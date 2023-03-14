package com.example.samplearch.home.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB-\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J6\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/samplearch/home/data/model/PostResponse;", "", "totalResults", "", "status", "", "articles", "", "Lcom/example/samplearch/home/data/model/PostResponse$Articles;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getArticles", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "getTotalResults", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/example/samplearch/home/data/model/PostResponse;", "equals", "", "other", "hashCode", "toString", "Articles", "app_debug"})
public final class PostResponse {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalResults = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> articles = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.samplearch.home.data.model.PostResponse copy(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "totalResults")
    java.lang.Integer totalResults, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "articles")
    java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> articles) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public PostResponse() {
        super();
    }
    
    public PostResponse(@org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "totalResults")
    java.lang.Integer totalResults, @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "articles")
    java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> articles) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.samplearch.home.data.model.PostResponse.Articles> getArticles() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/samplearch/home/data/model/PostResponse$Articles;", "", "author", "", "title", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getImage", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Articles {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String author = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.home.data.model.PostResponse.Articles copy(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "author")
        java.lang.String author, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "title")
        java.lang.String title, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "urlToImage")
        java.lang.String image) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Articles(@org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "author")
        java.lang.String author, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "title")
        java.lang.String title, @org.jetbrains.annotations.Nullable
        @com.squareup.moshi.Json(name = "urlToImage")
        java.lang.String image) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAuthor() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImage() {
            return null;
        }
    }
}