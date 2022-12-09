plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    // Unfortunately we can't use Library here
    implementation("com.android.tools.build:gradle:7.3.0-alpha05")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
}