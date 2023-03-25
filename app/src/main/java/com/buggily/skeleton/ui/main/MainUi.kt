package com.buggily.skeleton.ui.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.buggily.skeleton.ui.SkeletonDestination
import com.buggily.skeleton.ui.home.HomeScreen

@Composable
fun MainScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = rememberNavController(),
        startDestination = SkeletonDestination.Home.route,
        modifier = modifier,
    ) {
        composable(
            route = SkeletonDestination.Home.route,
            arguments = emptyList(),
            deepLinks = emptyList(),
        ) {
            HomeScreen(
                viewModel = hiltViewModel(),
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}
