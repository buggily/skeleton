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

}

kapt {
    correctErrorTypes = true
}
