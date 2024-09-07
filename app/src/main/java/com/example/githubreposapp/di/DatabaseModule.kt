package com.example.githubreposapp.di

import android.content.Context
import androidx.room.Room
import com.example.githubreposapp.data.data_sources.local.room.GithubDatabase
import com.example.githubreposapp.data.data_sources.local.room.GithubRepositoriesDao
import com.example.githubreposapp.data.data_sources.local.data_store.DataStorePreference
import com.example.githubreposapp.presentation.utils.Constants.Companion.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        GithubDatabase::class.java,
        DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideDao(database: GithubDatabase): GithubRepositoriesDao {
        return database.githubRepositoriesDao()
    }

    @Singleton
    @Provides
    fun provideDataStorePreference(
        @ApplicationContext context: Context
    ) = DataStorePreference(context)

//    @Singleton
//    @Provides
//    fun provideLocalDataSource(
//        githubRepositoriesDao: GithubRepositoriesDao,
//        dataStorePreference: DataStorePreference
//    ) = LocalDataSource(githubRepositoriesDao, dataStorePreference)
}
