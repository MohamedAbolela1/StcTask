package com.example.samplearch.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B%\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u0082\u0001\u0004\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/samplearch/model/ErrorTypes;", "", "errorMessage", "Lcom/example/samplearch/model/StringModel;", "errorSubMessage", "errorIcon", "", "(Lcom/example/samplearch/model/StringModel;Lcom/example/samplearch/model/StringModel;Ljava/lang/Integer;)V", "getErrorIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "()Lcom/example/samplearch/model/StringModel;", "getErrorSubMessage", "GeneralError", "NoData", "NoNetwork", "UnAuthorized", "Lcom/example/samplearch/model/ErrorTypes$UnAuthorized;", "Lcom/example/samplearch/model/ErrorTypes$NoData;", "Lcom/example/samplearch/model/ErrorTypes$NoNetwork;", "Lcom/example/samplearch/model/ErrorTypes$GeneralError;", "app_debug"})
public abstract class ErrorTypes {
    @org.jetbrains.annotations.Nullable
    private final com.example.samplearch.model.StringModel errorMessage = null;
    @org.jetbrains.annotations.Nullable
    private final com.example.samplearch.model.StringModel errorSubMessage = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer errorIcon = null;
    
    private ErrorTypes(com.example.samplearch.model.StringModel errorMessage, com.example.samplearch.model.StringModel errorSubMessage, java.lang.Integer errorIcon) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.samplearch.model.StringModel getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.samplearch.model.StringModel getErrorSubMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getErrorIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/samplearch/model/ErrorTypes$UnAuthorized;", "Lcom/example/samplearch/model/ErrorTypes;", "()V", "app_debug"})
    public static final class UnAuthorized extends com.example.samplearch.model.ErrorTypes {
        @org.jetbrains.annotations.NotNull
        public static final com.example.samplearch.model.ErrorTypes.UnAuthorized INSTANCE = null;
        
        private UnAuthorized() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/samplearch/model/ErrorTypes$NoData;", "Lcom/example/samplearch/model/ErrorTypes;", "message", "Lcom/example/samplearch/model/StringModel;", "subMessage", "icon", "", "(Lcom/example/samplearch/model/StringModel;Lcom/example/samplearch/model/StringModel;I)V", "getIcon", "()I", "getMessage", "()Lcom/example/samplearch/model/StringModel;", "getSubMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class NoData extends com.example.samplearch.model.ErrorTypes {
        @org.jetbrains.annotations.NotNull
        private final com.example.samplearch.model.StringModel message = null;
        @org.jetbrains.annotations.NotNull
        private final com.example.samplearch.model.StringModel subMessage = null;
        private final int icon = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.ErrorTypes.NoData copy(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
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
        
        public NoData() {
            super(null, null, null);
        }
        
        public NoData(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel getSubMessage() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/samplearch/model/ErrorTypes$NoNetwork;", "Lcom/example/samplearch/model/ErrorTypes;", "message", "Lcom/example/samplearch/model/StringModel;", "subMessage", "icon", "", "(Lcom/example/samplearch/model/StringModel;Lcom/example/samplearch/model/StringModel;I)V", "getIcon", "()I", "getMessage", "()Lcom/example/samplearch/model/StringModel;", "getSubMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class NoNetwork extends com.example.samplearch.model.ErrorTypes {
        @org.jetbrains.annotations.NotNull
        private final com.example.samplearch.model.StringModel message = null;
        @org.jetbrains.annotations.NotNull
        private final com.example.samplearch.model.StringModel subMessage = null;
        private final int icon = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.ErrorTypes.NoNetwork copy(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
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
        
        public NoNetwork() {
            super(null, null, null);
        }
        
        public NoNetwork(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel getSubMessage() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/samplearch/model/ErrorTypes$GeneralError;", "Lcom/example/samplearch/model/ErrorTypes;", "message", "Lcom/example/samplearch/model/StringModel;", "subMessage", "icon", "", "(Lcom/example/samplearch/model/StringModel;Lcom/example/samplearch/model/StringModel;I)V", "getIcon", "()I", "getMessage", "()Lcom/example/samplearch/model/StringModel;", "getSubMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class GeneralError extends com.example.samplearch.model.ErrorTypes {
        @org.jetbrains.annotations.NotNull
        private final com.example.samplearch.model.StringModel message = null;
        @org.jetbrains.annotations.Nullable
        private final com.example.samplearch.model.StringModel subMessage = null;
        private final int icon = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.ErrorTypes.GeneralError copy(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.Nullable
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
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
        
        public GeneralError() {
            super(null, null, null);
        }
        
        public GeneralError(@org.jetbrains.annotations.NotNull
        com.example.samplearch.model.StringModel message, @org.jetbrains.annotations.Nullable
        com.example.samplearch.model.StringModel subMessage, @androidx.annotation.DrawableRes
        int icon) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.samplearch.model.StringModel getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.samplearch.model.StringModel component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.samplearch.model.StringModel getSubMessage() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
    }
}