package com.example.githubreposapp.presentation.screens.repo_list_screen.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubreposapp.domain.usecase.FetchGithubReposListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RepoListViewModel @Inject constructor(
    private val fetchGithubReposUseCase: FetchGithubReposListUseCase
): ViewModel() {

    fun requestGithubRepoList() {
        // loading

        // result
        viewModelScope.launch(Dispatchers.IO) {
            val data = fetchGithubReposUseCase.invoke()
        }

        // error
    }
}