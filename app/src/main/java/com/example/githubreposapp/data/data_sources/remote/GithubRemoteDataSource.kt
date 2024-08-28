package com.example.githubreposapp.data.data_sources.remote

import com.example.githubreposapp.data.data_sources.remote.retrofit.api.GithubApi
import com.example.githubreposapp.data.data_sources.remote.retrofit.datamodel.GithubReposDataModel
import javax.inject.Inject

class GithubRemoteDataSource @Inject constructor(
    private val githubApi: GithubApi
) {
    suspend fun fetchGithubRepos(): GithubReposDataModel{
        return githubApi.fetchGithubRepos().body() as GithubReposDataModel
    }
}