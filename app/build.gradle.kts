plugins {
    id("skeleton.android.application")
    id("skeleton.android.application.compose")
    id("skeleton.android.hilt")
}

android {

    namespace = "com.buggily.skeleton"

    defaultConfig {
        applicationId = namespace

        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true

            proguardFiles(
                getDefaultProguardFile("proguard-android.txt"),
                "proguard-rules.pro",
            )
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {
    with(libs) {
        implementation(kotlin)
        implementation(kotlinx.coroutines)
        implementation(kotlinx.coroutines.android)

        implementation(androidx.core)
        implementation(androidx.core.splashscreen)

        implementation(androidx.lifecycle.viewModel)
    }
}
