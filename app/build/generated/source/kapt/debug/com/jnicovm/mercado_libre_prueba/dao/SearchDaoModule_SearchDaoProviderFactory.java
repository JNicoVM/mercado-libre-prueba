// Generated by Dagger (https://dagger.dev).
package com.jnicovm.mercado_libre_prueba.dao;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchDaoModule_SearchDaoProviderFactory implements Factory<SearchDao> {
  private final SearchDaoModule module;

  public SearchDaoModule_SearchDaoProviderFactory(SearchDaoModule module) {
    this.module = module;
  }

  @Override
  public SearchDao get() {
    return searchDaoProvider(module);
  }

  public static SearchDaoModule_SearchDaoProviderFactory create(SearchDaoModule module) {
    return new SearchDaoModule_SearchDaoProviderFactory(module);
  }

  public static SearchDao searchDaoProvider(SearchDaoModule instance) {
    return Preconditions.checkNotNull(instance.searchDaoProvider(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
