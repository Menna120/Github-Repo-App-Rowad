package com.example.githubreposapp.data.data_sources.remote.retrofit.api

import com.example.githubreposapp.data.Constants.Companion.GITHUB_REPOS_ENDPOINT
import com.example.githubreposapp.data.data_sources.remote.retrofit.datamodel.GithubReposDataModel
import retrofit2.Response
import retrofit2.http.GET

interface GithubApi {
    @GET(GITHUB_REPOS_ENDPOINT)
    fun fetchGithubRepos(): Response<GithubReposDataModel>
}