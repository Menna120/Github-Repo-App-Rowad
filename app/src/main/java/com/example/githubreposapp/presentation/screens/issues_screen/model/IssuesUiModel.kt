package com.example.githubreposapp.presentation.screens.issues_screen.model

import com.example.githubreposapp.domain.model.IssueState

data class IssuesUiModel(
    val id:Int,
    val title: String,
    val author: String,
    val date: String,
    val state: IssueState,
)