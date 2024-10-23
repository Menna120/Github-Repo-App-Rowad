package com.example.githubreposapp.data.data_sources.remote

import com.example.githubreposapp.data.data_sources.remote.retrofit.api.GithubApi
import com.example.githubreposapp.data.data_sources.remote.retrofit.api.RepoDetailsApi
import com.example.githubreposapp.data.data_sources.remote.retrofit.datamodel.repo_details.RepositoryDetailsDataModel
import com.example.githubreposapp.data.data_sources.remote.retrofit.datamodel.repo_list.GithubReposDataModel
import com.example.githubreposapp.data.mapper.toCustomExceptionDomainModel
import com.example.githubreposapp.domain.model.CustomExceptionDomainModel
import java.io.IOException
import javax.inject.Inject

class GithubRemoteDataSource @Inject constructor(
    private val githubApi: GithubApi,
    private val repoDetailsApi: RepoDetailsApi
) {
    suspend fun fetchGithubRepos(): GithubReposDataModel {
        return try {
//            throw IOException()
            githubApi.fetchGithubRepos().body() as GithubReposDataModel
        } catch (e: Exception){
           throw e.toCustomExceptionDomainModel()
        }
    }
    suspend fun fetchGithubRepoDetails(
        owner: String,
        name:String
    ):RepositoryDetailsDataModel  {
        return repoDetailsApi.fetchRepoDetails(
            owner, name
        ).body() as RepositoryDetailsDataModel
    }
}