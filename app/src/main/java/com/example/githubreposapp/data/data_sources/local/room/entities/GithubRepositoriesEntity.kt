package com.example.githubreposapp.data.data_sources.local.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.githubreposapp.data.Constants.Companion.GITHUB_REPOSITORIES_TABLE

@Entity(tableName = GITHUB_REPOSITORIES_TABLE)
data class GithubRepositoriesEntity(
    @PrimaryKey(autoGenerate = false)
    val id:Int,
    val name: String,
    val avatar: String,
    val description: String,
    val forks: Int,
    val language: String,
    val fullName: String,
    val stars: Int,
    val url: String,
    val owner: String
)