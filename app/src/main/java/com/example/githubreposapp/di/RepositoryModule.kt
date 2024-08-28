package com.example.githubreposapp.di

import com.example.githubreposapp.data.data_sources.remote.GithubRemoteDataSource
import com.example.githubreposapp.data.repository.GithubRepositoryImpl
import com.example.githubreposapp.domain.repository.GithubRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideGithubRepository(
        githubRemoteDataSource: GithubRemoteDataSource
    ): GithubRepository {
        return GithubRepositoryImpl(githubRemoteDataSource)
    }

}