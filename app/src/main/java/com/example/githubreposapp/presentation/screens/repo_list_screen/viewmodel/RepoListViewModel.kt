package com.example.githubreposapp.presentation.screens.repo_list_screen.viewmodel

import androidx.lifecycle.ViewModel
import com.example.githubreposapp.domain.usecase.FetchGithubReposListUseCase

class RepoListViewModel(
    private val fetchGithubReposUseCase: FetchGithubReposListUseCase
): ViewModel() {

    fun requestGithubRepoList() {
        // loading
        val data = fetchGithubReposUseCase.invoke()
        // result

        // error
    }
}