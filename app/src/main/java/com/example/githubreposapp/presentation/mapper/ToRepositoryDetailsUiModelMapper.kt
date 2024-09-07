package com.example.presentation.mapper

import com.example.githubreposapp.domain.model.RepositoryDetailsDomainModel
import com.example.githubreposapp.presentation.screens.repo_details_screen.model.RepoDetailsUiModel

fun RepositoryDetailsDomainModel.toRepositoryDetailsUIModel(): RepoDetailsUiModel {
    return RepoDetailsUiModel(
        id = id,
        name = name,
        avatar = avatar,
        description = description,
        stars = stars,
        owner = owner,
        forks = forks,
        language = language,
        fullName = fullName,
        url = url,
        createdAt = createdAt
    )
}