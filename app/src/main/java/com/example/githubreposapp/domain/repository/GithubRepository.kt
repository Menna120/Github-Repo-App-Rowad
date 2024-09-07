package com.example.githubreposapp.domain.repository

import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.domain.model.RepositoryDetailsDomainModel

interface GithubRepository {
    suspend fun fetchGithubRepos(): List<GithubRepoDomainModel>
    suspend fun fetchGithubRepoDetails(owner:String, name:String): RepositoryDetailsDomainModel
}