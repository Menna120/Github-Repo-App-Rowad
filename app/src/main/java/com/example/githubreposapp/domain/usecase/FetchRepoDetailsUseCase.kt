package com.example.githubreposapp.domain.usecase

import com.example.githubreposapp.domain.model.RepositoryDetailsDomainModel
import com.example.githubreposapp.domain.repository.GithubRepository
import javax.inject.Inject

class FetchRepoDetailsUseCase @Inject constructor(
    private val githubRepository: GithubRepository
) {
    suspend operator fun invoke(
        owner: String,
        name:String
    ) : RepositoryDetailsDomainModel {
        return githubRepository.fetchGithubRepoDetails(owner, name)
    }
}