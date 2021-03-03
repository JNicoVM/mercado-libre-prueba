// Generated by Dagger (https://dagger.dev).
package com.jnicovm.mercado_libre_prueba.retrofit;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIModules_LoginRequestProviderFactory implements Factory<RequestSearch> {
  private final APIModules module;

  private final Provider<String> baseUrlProvider;

  public APIModules_LoginRequestProviderFactory(APIModules module,
      Provider<String> baseUrlProvider) {
    this.module = module;
    this.baseUrlProvider = baseUrlProvider;
  }

  @Override
  public RequestSearch get() {
    return loginRequestProvider(module, baseUrlProvider.get());
  }

  public static APIModules_LoginRequestProviderFactory create(APIModules module,
      Provider<String> baseUrlProvider) {
    return new APIModules_LoginRequestProviderFactory(module, baseUrlProvider);
  }

  public static RequestSearch loginRequestProvider(APIModules instance, String baseUrl) {
    return Preconditions.checkNotNull(instance.loginRequestProvider(baseUrl), "Cannot return null from a non-@Nullable @Provides method");
  }
}