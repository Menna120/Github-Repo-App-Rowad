package com.example.githubreposapp.presentation.mapper

import com.example.githubreposapp.domain.model.GithubRepoDomainModel
import com.example.githubreposapp.presentation.screens.repo_list_screen.model.GithubRepoUiModel

fun GithubRepoDomainModel.toGithubRepoUiModel(): GithubRepoUiModel{
    return GithubRepoUiModel(
        id = this.id,
        name = this.name,
        avatar = this.avatar,
        description = this.description,
        stars = this.stars,
        owner = this.owner
    )
}