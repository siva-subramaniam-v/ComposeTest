package com.example.composetest

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    val sharedViewModel: SharedViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController, sharedViewModel = sharedViewModel)
        }

        composable(
            route = Screen.Detail.route
        ) {
            DetailScreen(navController = navController, sharedViewModel = sharedViewModel)
        }
    }
}