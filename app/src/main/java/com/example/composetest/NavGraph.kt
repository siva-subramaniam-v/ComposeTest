package com.example.composetest

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composetest.model.Person

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route
        ) {
            LaunchedEffect(key1 = it) {
                val result =
                    navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
                Log.d("DetailScreen", result.toString())
            }
            DetailScreen(navController = navController)
        }
    }
}