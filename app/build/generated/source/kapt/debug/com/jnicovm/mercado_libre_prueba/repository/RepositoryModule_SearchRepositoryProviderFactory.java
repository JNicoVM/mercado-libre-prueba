// Generated by Dagger (https://dagger.dev).
package com.jnicovm.mercado_libre_prueba.repository;

import com.jnicovm.mercado_libre_prueba.dao.SearchDao;
import com.jnicovm.mercado_libre_prueba.data.RemoteSearchDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_SearchRepositoryProviderFactory implements Factory<SearchRepository> {
  private final RepositoryModule module;

  private final Provider<RemoteSearchDataSource> remoteSearchDataSourceProvider;

  private final Provider<SearchDao> searchDaoProvider;

  public RepositoryModule_SearchRepositoryProviderFactory(RepositoryModule module,
      Provider<RemoteSearchDataSource> remoteSearchDataSourceProvider,
      Provider<SearchDao> searchDaoProvider) {
    this.module = module;
    this.remoteSearchDataSourceProvider = remoteSearchDataSourceProvider;
    this.searchDaoProvider = searchDaoProvider;
  }

  @Override
  public SearchRepository get() {
    return searchRepositoryProvider(module, remoteSearchDataSourceProvider.get(), searchDaoProvider.get());
  }

  public static RepositoryModule_SearchRepositoryProviderFactory create(RepositoryModule module,
      Provider<RemoteSearchDataSource> remoteSearchDataSourceProvider,
      Provider<SearchDao> searchDaoProvider) {
    return new RepositoryModule_SearchRepositoryProviderFactory(module, remoteSearchDataSourceProvider, searchDaoProvider);
  }

  public static SearchRepository searchRepositoryProvider(RepositoryModule instance,
      RemoteSearchDataSource remoteSearchDataSource, SearchDao searchDao) {
    return Preconditions.checkNotNull(instance.searchRepositoryProvider(remoteSearchDataSource, searchDao), "Cannot return null from a non-@Nullable @Provides method");
  }
}
