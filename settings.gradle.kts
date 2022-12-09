pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
    plugins {
        id("com.android.application") version "7.3.0-alpha05"
        id("com.android.library") version "7.3.0-alpha05"
        id("org.jetbrains.kotlin.android") version "1.6.10"
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Lunar"
include(":app")
include(":lunar")
include(":lunar3")
include(":lunar-common")
