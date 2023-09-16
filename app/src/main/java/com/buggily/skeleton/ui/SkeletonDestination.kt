package com.buggily.skeleton.ui

sealed interface SkeletonDestination {

    val route: String

    data object Home : SkeletonDestination {
        override val route: String = "home"
    }
}
