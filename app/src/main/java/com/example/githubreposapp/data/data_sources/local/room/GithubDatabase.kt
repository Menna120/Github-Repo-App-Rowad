package com.example.githubreposapp.data.data_sources.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.githubreposapp.data.data_sources.local.room.entities.GithubRepositoriesEntity

@Database(
    entities = [GithubRepositoriesEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(RepositoriesTypeConverter::class)
abstract class GithubDatabase: RoomDatabase() {
    abstract fun githubRepositoriesDao(): GithubRepositoriesDao
}

// exportSchema = true to tell Room to export the database schema into a folder. Even though it is not
// mandatory, it is a good practice to have version history of your schema in your
// codebase and you should commit the schema files into your version control system
// (but don't ship them with your app!).