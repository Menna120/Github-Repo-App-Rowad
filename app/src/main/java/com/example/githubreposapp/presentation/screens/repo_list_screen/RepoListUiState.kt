package com.example.githubreposapp.presentation.screens.repo_list_screen

import com.example.githubreposapp.presentation.model.CustomExceptionUiModel
import com.example.githubreposapp.presentation.screens.repo_list_screen.model.GithubRepoUiModel

data class RepoListUiState(
    val isLoading:Boolean = false,
    val isError:Boolean = false,
    val errorMessage: CustomExceptionUiModel? = null,
    val repoList: List<GithubRepoUiModel> = emptyList()
)
