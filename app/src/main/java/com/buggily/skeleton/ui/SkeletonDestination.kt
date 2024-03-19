package com.buggily.skeleton.ui

sealed interface SkeletonDestination {

    val route: String

    data object Skeleton : SkeletonDestination {
        override val route: String = "skeleton"
    }
}
