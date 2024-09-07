package com.example.githubreposapp.presentation.screens.repo_list_screen.model

data class GithubRepoUiModel(
    val id: Int,
    val name:String,
    val avatar:String,
    val description:String,
    val stars:Int,
    val owner:String
)
