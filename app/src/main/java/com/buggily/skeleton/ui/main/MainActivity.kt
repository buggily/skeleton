package com.buggily.skeleton.ui.main

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.buggily.skeleton.R
import com.buggily.skeleton.ui.theme.SkeletonTheme
import com.buggily.skeleton.ui.theme.darkColorSchemeCompat
import com.buggily.skeleton.ui.theme.lightColorSchemeCompat
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()

        super.onCreate(savedInstanceState)
        setupWindow(Build.VERSION.SDK_INT < Build.VERSION_CODES.O)

        setContent {
            val isLight: Boolean = !isSystemInDarkTheme()
            val colorScheme: ColorScheme = remember(isLight) {
                if (isLight) {
                    lightColorSchemeCompat(this)
                } else {
                    darkColorSchemeCompat(this)
                }
            }

            SkeletonTheme(colorScheme) {
                MainScreen(
                    viewModel = hiltViewModel(),
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }

    private fun setupWindow(decorFitsSystemWindows: Boolean) {
        WindowCompat.setDecorFitsSystemWindows(
            window,
            decorFitsSystemWindows
        )

        val systemBarsColor: Int = if (decorFitsSystemWindows) {
            R.color.system_bars_translucent
        } else {
            R.color.system_bars_transparent
        }.let { ContextCompat.getColor(this, it) }

        window.statusBarColor = systemBarsColor
        window.navigationBarColor = systemBarsColor

        if (decorFitsSystemWindows) {
            return
        }

        val isDark: Boolean = resources.getBoolean(R.bool.is_dark)
        val isLight: Boolean = !isDark

        val insetsController = WindowInsetsControllerCompat(
            window,
            window.decorView
        )

        with(insetsController) {
            isAppearanceLightStatusBars = isLight
            isAppearanceLightNavigationBars = isLight
        }
    }
}
