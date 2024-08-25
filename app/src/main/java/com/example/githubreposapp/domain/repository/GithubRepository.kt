package com.example.githubreposapp.domain.repository

import com.example.githubreposapp.domain.model.GithubRepoDomainModel

interface GithubRepository {
    fun fetchGithubRepos(): List<GithubRepoDomainModel>
}