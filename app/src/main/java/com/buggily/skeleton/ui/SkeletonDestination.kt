package com.buggily.skeleton.ui

sealed class SkeletonDestination {

    abstract val route: String

    object Default : SkeletonDestination() {

        override val route: String
            get() = "default"
    }
}
