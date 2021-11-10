
import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion

fun LibraryExtension.commonAndroid() {
    defaultConfig()
    buildTypes()
    compileOptions()
}

fun LibraryExtension.defaultConfig() {
    compileSdk = Library.Android.CompileVersion

    defaultConfig {
        minSdk = Library.Android.MinCompileVersion
        targetSdk = Library.Android.TargetVersion
    }
}

fun LibraryExtension.composeFeatures() {
    buildFeatures {
        compose = Library.Android.UseCompose
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Library.AndroidX.Compose.Version
//        kotlinCompilerVersion = Library.Kotlin.LibraryVersion
    }
}

fun LibraryExtension.buildTypes() {
    buildTypes {
        release {
            isMinifyEnabled = true
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }
}

fun LibraryExtension.compileOptions() {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
