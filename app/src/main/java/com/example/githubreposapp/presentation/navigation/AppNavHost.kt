package com.example.githubreposapp.presentation.navigation

import android.util.Log
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.githubreposapp.presentation.screens.repo_list_screen.RepoListScreen
import com.example.githubreposapp.presentation.screens.repo_list_screen.preview_data.fakeRepoUiModelList
import com.example.githubreposapp.presentation.utils.Constants.Companion.NAME_KEY

@ExperimentalMaterial3Api
@Composable
fun AppNavHost() {
    val navController = rememberNavController()
   // var githubRepoUiModel: GithubRepoUiModel? = null
    NavHost(
        navController = navController,
        startDestination = Screens.RepoListScreen.route
    ) {
        composable(route = Screens.RepoListScreen.route) {
            RepoListScreen(repoListUiModel = fakeRepoUiModelList) {
             //   githubRepoUiModel = it
                navController.navigate(Screens.RepoDetailsScreen.passRepoName(name = it.name))
            }
        }

        composable(
            route = Screens.RepoDetailsScreen.route,
            arguments = listOf(navArgument(NAME_KEY){
                type = NavType.StringType
            })
        ) {
//            githubRepoUiModel?.let {
//            val passedRepoDetailsUiModel = RepoDetailsUiModel(
//                name = it.name,
//                description = it.description,
//                forksCount = "20",
//                starsCount = it.stars,
//                imageUrl = it.avatar,
//                language = "Kotlin"
//            )
//                RepoDetailsScreen(repoDetailsUiModel = passedRepoDetailsUiModel, onClickBack = { }) {
//
//                }
//            }
            val passedName = it.arguments?.getString(NAME_KEY)
            passedName?.let {name ->
                     Log.d("RepoDetilsScreen", "passed name = $name")
            }
        }

    }
}