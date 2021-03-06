// Generated by Dagger (https://dagger.dev).
package com.jnicovm.mercado_libre_prueba.di;

import com.jnicovm.mercado_libre_prueba.activities.searchActivities.SearchViewmodel;
import com.jnicovm.mercado_libre_prueba.useCases.GetSearchUsesCases;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchModule_LoginViewModelProviderFactory implements Factory<SearchViewmodel> {
  private final SearchModule module;

  private final Provider<GetSearchUsesCases> loginUseCaseProvider;

  public SearchModule_LoginViewModelProviderFactory(SearchModule module,
      Provider<GetSearchUsesCases> loginUseCaseProvider) {
    this.module = module;
    this.loginUseCaseProvider = loginUseCaseProvider;
  }

  @Override
  public SearchViewmodel get() {
    return loginViewModelProvider(module, loginUseCaseProvider.get());
  }

  public static SearchModule_LoginViewModelProviderFactory create(SearchModule module,
      Provider<GetSearchUsesCases> loginUseCaseProvider) {
    return new SearchModule_LoginViewModelProviderFactory(module, loginUseCaseProvider);
  }

  public static SearchViewmodel loginViewModelProvider(SearchModule instance,
      GetSearchUsesCases loginUseCase) {
    return Preconditions.checkNotNull(instance.loginViewModelProvider(loginUseCase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
