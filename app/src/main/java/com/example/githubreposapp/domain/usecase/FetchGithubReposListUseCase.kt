package com.example.githubreposapp.domain.usecase

import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.domain.repository.GithubRepository

class FetchGithubReposListUseCase(
    private val githubRepository: GithubRepository
) {
    operator fun invoke() :List<GithubRepoDomainModel> {
        return githubRepository.fetchGithubRepos()
    }
}