import java.io.FileInputStream
import java.util.Properties

plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.mavenPublish)
}

val lunar = libs.squaredcandy.lunar.get()

private val Dependency.namespace: String
    get() = "$group.$name"

android {
    namespace = lunar.namespace
    compileSdk = libs.versions.gradle.compile.target.get().toInt()

    defaultConfig {
        minSdk = libs.versions.gradle.compile.min.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = libs.versions.gradle.jvm.target.get()
    }
    buildFeatures {
        compose = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.material)
}

val githubProperties = Properties()
// Set env variable GPR_USER & GPR_API_KEY if not adding a properties file
githubProperties.load(FileInputStream(rootProject.file("github.properties")))

tasks.register<Jar>("sourcesJar") {
    archiveClassifier.set("sources")
    from(kotlin.sourceSets["main"].kotlin.srcDirs)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = lunar.group
            artifactId = lunar.name
            version = lunar.version
            artifact("$buildDir/outputs/aar/${lunar.name}-release.aar")
            artifact(tasks.getByName<Jar>("sourcesJar"))
        }

        repositories {
            maven {
                name = "GithubPackages"
                url = uri("https://maven.pkg.github.com/squaredcandy/Lunar")
                credentials {
                    username = githubProperties["gpr.usr"] as String? ?: System.getenv("GPR_USER")
                    password =
                        githubProperties["gpr.key"] as String? ?: System.getenv("GPR_API_KEY")
                }
            }
        }
    }
}
