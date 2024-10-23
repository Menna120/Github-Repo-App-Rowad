package com.example.githubreposapp.di

import com.example.githubreposapp.data.Constants.Companion.BASE_URL
import com.example.githubreposapp.data.data_sources.remote.GithubRemoteDataSource
import com.example.githubreposapp.data.data_sources.remote.retrofit.api.GithubApi
import com.example.githubreposapp.data.data_sources.remote.retrofit.api.RepoDetailsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRemoteDataSource(
        githubApi: GithubApi,
        repoDetailsApi: RepoDetailsApi
    ): GithubRemoteDataSource {
        return GithubRemoteDataSource(githubApi, repoDetailsApi)
    }

    @Provides
    @Singleton
    fun provideGithubApi(
        retrofit: Retrofit
    ): GithubApi {
        return retrofit.create(GithubApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepoDetailsApi(
        retrofit: Retrofit
    ): RepoDetailsApi {
        return retrofit.create(RepoDetailsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()
    }

}