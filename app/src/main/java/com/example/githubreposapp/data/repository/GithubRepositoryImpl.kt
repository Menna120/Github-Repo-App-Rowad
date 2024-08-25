package com.example.githubreposapp.data.repository

import com.example.githubreposapp.data.data_sources.remote.GithubRemoteDataSource
import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.domain.repository.GithubRepository

class GithubRepositoryImpl(
    private val githubRemoteDataSource: GithubRemoteDataSource
): GithubRepository {
    override fun fetchGithubRepos(): List<GithubRepoDomainModel> {
        return emptyList()
    }
}