package com.buggily.skeleton.ui.main

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.buggily.skeleton.ui.SkeletonDestination
import com.buggily.skeleton.ui.home.HomeScreen

@Composable
@OptIn(ExperimentalLayoutApi::class)
fun MainScreen(
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        contentWindowInsets = WindowInsets.ime,
        modifier = modifier,
    ) {
        NavHost(
            navController = rememberNavController(),
            startDestination = SkeletonDestination.Home.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .consumeWindowInsets(it),
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
}
