plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")

    kotlin("kapt")
}

java {
    sourceCompatibility = Version.JAVA
    targetCompatibility = Version.JAVA
}

dependencies {
    implementation(Dependency.Hilt.CORE)
    kapt(Dependency.Hilt.COMPILER)
}

kapt {
    correctErrorTypes = true
}
