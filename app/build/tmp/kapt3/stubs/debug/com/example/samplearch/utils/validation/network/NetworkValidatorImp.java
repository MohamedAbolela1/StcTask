package com.example.samplearch.utils.validation.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/samplearch/utils/validation/network/NetworkValidatorImp;", "Lcom/example/samplearch/utils/validation/network/NetworkValidator;", "context", "Landroid/content/Context;", "versions", "Lcom/example/samplearch/utils/platform/Versions;", "(Landroid/content/Context;Lcom/example/samplearch/utils/platform/Versions;)V", "isConnected", "", "app_debug"})
public final class NetworkValidatorImp implements com.example.samplearch.utils.validation.network.NetworkValidator {
    private final android.content.Context context = null;
    private final com.example.samplearch.utils.platform.Versions versions = null;
    
    @javax.inject.Inject
    public NetworkValidatorImp(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.example.samplearch.utils.platform.Versions versions) {
        super();
    }
    
    @java.lang.Override
    public boolean isConnected() {
        return false;
    }
}