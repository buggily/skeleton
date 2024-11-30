package com.buggily.skeleton.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import com.buggily.skeleton.ui.theme.SkeletonTheme
import com.buggily.skeleton.ui.theme.darkColorSchemeCompat
import com.buggily.skeleton.ui.theme.lightColorSchemeCompat
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SkeletonActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        enableEdgeToEdge()

        super.onCreate(savedInstanceState)

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
                SkeletonApp(
                    viewModel = hiltViewModel(),
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }
}
