package com.example.githubreposapp.domain.usecase

import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.domain.repository.GithubRepository
import javax.inject.Inject

class FetchGithubReposListUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    suspend operator fun invoke() :List<GithubRepoDomainModel> {
        return githubRepository.fetchGithubRepos()
    }
}