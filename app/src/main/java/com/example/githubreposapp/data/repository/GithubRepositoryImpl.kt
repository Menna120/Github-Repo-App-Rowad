package com.example.githubreposapp.data.repository

import com.example.githubreposapp.data.data_sources.remote.GithubRemoteDataSource
import com.example.githubreposapp.data.mapper.toGithubRepoDomainModel
import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.domain.model.RepositoryDetailsDomainModel
import com.example.githubreposapp.domain.repository.GithubRepository
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val githubRemoteDataSource: GithubRemoteDataSource
): GithubRepository {
    override suspend fun fetchGithubRepos(): List<GithubRepoDomainModel> {
        return githubRemoteDataSource.fetchGithubRepos().toGithubRepoDomainModel()
    }

    override suspend fun fetchGithubRepoDetails(owner:String, name: String): RepositoryDetailsDomainModel {
        return githubRemoteDataSource.fetchGithubRepoDetails(owner, name).toGithubRepoDomainModel()
    }
}