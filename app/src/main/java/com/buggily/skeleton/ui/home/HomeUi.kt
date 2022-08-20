package com.buggily.skeleton.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.buggily.skeleton.ui.SkeletonDestination

@Composable
fun HomeScreen() {
    NavHost(
        navController = rememberNavController(),
        startDestination = SkeletonDestination.Default.route,
        modifier = Modifier.fillMaxSize(),
    ) {
        composable(
            route = SkeletonDestination.Default.route,
            arguments = emptyList(),
            deepLinks = emptyList(),
        ) {

        }
    }
}
