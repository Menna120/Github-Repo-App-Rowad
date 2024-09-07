package com.example.githubreposapp.presentation.screens.issues_screen

import com.example.githubreposapp.presentation.model.CustomExceptionUiModel
import com.example.githubreposapp.presentation.screens.issues_screen.model.IssuesUiModel


data class IssuesUiState(
    val issuesList: List<IssuesUiModel>? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val customErrorExceptionUiModel: CustomExceptionUiModel = CustomExceptionUiModel.Unknown
)