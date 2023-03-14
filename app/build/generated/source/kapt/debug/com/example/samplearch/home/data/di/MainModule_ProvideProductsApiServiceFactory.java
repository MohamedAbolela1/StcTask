// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.home.data.di;

import com.example.samplearch.home.data.remote.PostsApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainModule_ProvideProductsApiServiceFactory implements Factory<PostsApiService> {
  private final MainModule module;

  private final Provider<Retrofit> retrofitProvider;

  public MainModule_ProvideProductsApiServiceFactory(MainModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PostsApiService get() {
    return provideProductsApiService(module, retrofitProvider.get());
  }

  public static MainModule_ProvideProductsApiServiceFactory create(MainModule module,
      Provider<Retrofit> retrofitProvider) {
    return new MainModule_ProvideProductsApiServiceFactory(module, retrofitProvider);
  }

  public static PostsApiService provideProductsApiService(MainModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductsApiService(retrofit));
  }
}