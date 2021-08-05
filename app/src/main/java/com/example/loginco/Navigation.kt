package com.example.loginco

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Welcome.route) {
        // First route
        composable(Routes.Welcome.route) {
            Welcome(navController = navController)
        }

        // Another Route
        composable(Routes.SignIn.route) {
            SignIn()
        }
    }

}

