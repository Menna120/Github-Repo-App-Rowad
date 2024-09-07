package com.example.githubreposapp.data.mapper

import com.example.githubreposapp.data.data_sources.remote.retrofit.datamodel.repo_details.RepositoryDetailsDataModel

import com.example.githubreposapp.domain.model.RepositoryDetailsDomainModel

fun RepositoryDetailsDataModel.toGithubRepoDomainModel(): RepositoryDetailsDomainModel {
    return RepositoryDetailsDomainModel(
        id = this.id,
        name = this.name,
        avatar = this.owner.avatar_url,
        description = this.description,
        stars = this.stargazersCount,
        owner = this.owner.login,
        forks = this.forks,
        language = this.language ?: "",
        fullName = this.fullName,
        url = this.url,
        createdAt = this.createdAt
    )
}