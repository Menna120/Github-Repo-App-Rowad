package com.example.githubreposapp.data.data_sources.local

import com.example.githubreposapp.data.data_sources.local.data_store.DataStorePreference
import com.example.githubreposapp.data.data_sources.local.room.entities.GithubRepositoriesEntity
import com.example.githubreposapp.data.data_sources.local.room.GithubRepositoriesDao
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val githubRepositoriesDao: GithubRepositoriesDao,
    private val datsStorePreference: DataStorePreference
) {
    fun getTrendingRepositories(): List<GithubRepositoriesEntity> {
        return githubRepositoriesDao.getTrendingRepositories()
    }

    suspend fun insertTrendingRepositories(githubRepositoriesEntity: List<GithubRepositoriesEntity>) {
        githubRepositoriesDao.insertTrendingRepositories(githubRepositoriesEntity)
    }

    suspend fun readIsFirstTime(): Boolean { // support flows
        return datsStorePreference.readIsFirstTime()
    }

    suspend fun saveIsFirstTime(isFirstTime: Boolean) {
        datsStorePreference.saveIsFirstTime(isFirstTime = isFirstTime)
    }
}
