package com.example.goran_tadic_mad_ld3.ui.theme.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import at.ac.fhcampuswien.movieapp.ui.theme.navigation.MovieScreens
import com.example.goran_tadic_mad_ld3.ui.theme.screens.DetailScreen
import com.example.goran_tadic_mad_ld3.ui.theme.screens.HomeScreen
import com.example.goran_tadic_mad_ld3.ui.theme.screens.FavoritesScreen


@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(MovieScreens.HomeScreen.name) { HomeScreen(navController) }

        composable(
            route = MovieScreens.DetailScreen.name + "/{movieId}",
            arguments = listOf(
                navArgument(name = "movieId"){
                    type = NavType.StringType
                }
            )
        ) {backStackEntry ->
            val movieId = backStackEntry.arguments?.getString("movieId")
            DetailScreen(navController = navController, movieId = movieId)
        }
        composable(route = MovieScreens.FavoritesScreen.name){ FavoritesScreen(navController = navController) }
    }
}