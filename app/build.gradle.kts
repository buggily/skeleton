plugins {
    id("com.android.application")

    kotlin("android")
    kotlin("kapt")

    id("dagger.hilt.android.plugin")
}

android {

    compileSdk = Build.Sdk.COMPILE

    defaultConfig {
        applicationId = Build.ID

        minSdk = Build.Sdk.MIN
        targetSdk = Build.Sdk.TARGET

        versionCode = Version.CODE
        versionName = Version.NAME

        testInstrumentationRunner = Build.RUNNER
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

    buildFeatures {
        compose = true
    }

    hilt {
        enableAggregatingTask = true
    }

    compileOptions {
        sourceCompatibility = Version.JAVA
        targetCompatibility = Version.JAVA
    }

    kotlinOptions {
        jvmTarget = Version.JAVA.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Version.Compose.COMPILER
    }
}

dependencies {
    implementation(Dependency.Kotlin.Core.KTX)

    implementation(Dependency.Hilt.IDENTITY)
    kapt(Dependency.Hilt.COMPILER)

    implementation(Dependency.Hilt.Android.NAVIGATION)
    kapt(Dependency.Hilt.Android.COMPILER)

    implementation(Dependency.Room.IDENTITY)
    kapt(Dependency.Room.COMPILER)

    implementation(Dependency.Room.COROUTINES)
    implementation(Dependency.Room.PAGING)

    implementation(Dependency.Paging.IDENTITY)
    implementation(Dependency.Paging.COMPOSE)

    implementation(Dependency.Retrofit.IDENTITY)

    implementation(Dependency.Compose.ACTIVITY)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.Compose.NAVIGATION)

    implementation(Dependency.Compose.Ui.IDENTITY)
    implementation(Dependency.Compose.Ui.Tooling.PREVIEW)
    debugImplementation(Dependency.Compose.Ui.Tooling.IDENTITY)

    implementation(Dependency.Compose.Lifecycle.IDENTITY)
    implementation(Dependency.Compose.Lifecycle.KTX)
    implementation(Dependency.Compose.Lifecycle.ViewModel.IDENTITY)
    implementation(Dependency.Compose.Lifecycle.ViewModel.KTX)

    implementation(Dependency.Coil.IDENTITY)
}

kapt {
    correctErrorTypes = true
}
