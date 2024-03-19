package com.buggily.skeleton.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.buggily.skeleton.R

@Composable
@OptIn(ExperimentalLayoutApi::class)
fun SkeletonApp(
    viewModel: SkeletonViewModel,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        contentWindowInsets = WindowInsets.ime,
        modifier = modifier,
    ) {
        NavHost(
            navController = rememberNavController(),
            startDestination = SkeletonDestination.Skeleton.route,
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .consumeWindowInsets(it),
        ) {
            composable(
                route = SkeletonDestination.Skeleton.route,
                arguments = emptyList(),
                deepLinks = emptyList(),
            ) {
                Box(Modifier.fillMaxSize()) {
                    Text(
                        text = stringResource(R.string.greeting),
                        modifier = Modifier.align(Alignment.Center),
                    )
                }
            }
        }
    }
}
