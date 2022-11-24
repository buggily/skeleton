package com.buggily.skeleton.ui

sealed class SkeletonDestination {

    abstract val route: String

    object Home : SkeletonDestination() {

        override val route: String
            get() = "home"
    }
}
