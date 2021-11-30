object Library {
    object Android {
        const val ApplicationId = "com.squaredcandy.lunar"
        const val MinCompileVersion = 23
        const val CompileVersion = 31
        const val TargetVersion = 30
        const val VersionCode = 1
        const val VersionName = "1.0"
        const val GradleVersion = "7.1.0-beta03"
        const val JavaVersion = "11"
        const val UseCompose = true

        const val ApplicationPlugin = "com.android.application"
        const val LibraryPlugin = "com.android.library"
    }

    object Kotlin {
        const val LibraryVersion = "1.5.31"
        const val AndroidPlugin = "kotlin-android"

        object Coroutines {
            const val Version = "1.5.2"

            const val CoreArtifact = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$Version"
            const val AndroidArtifact =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:$Version"
        }
    }

    object AndroidX {
        object Activity {
            const val Version = "1.3.1"

            const val KtxArtifact = "androidx.activity:activity-ktx:$Version"
            const val ComposeArtifact = "androidx.activity:activity-compose:$Version"
        }

        object AppCompat {
            const val Version = "1.4.0-rc01"

            const val Artifact = "androidx.appcompat:appcompat:$Version"
        }

        object Compose {
            const val Version = "1.1.0-beta01"
            const val Material3Version = "1.0.0-alpha01"

            const val AnimationArtifact = "androidx.compose.animation:animation:$Version"
            const val CompilerArtifact = "androidx.compose.compiler:compiler:$Version"
            const val FoundationArtifact = "androidx.compose.foundation:foundation:$Version"
            const val MaterialArtifact = "androidx.compose.material:material:$Version"
            const val Material3Artifact = "androidx.compose.material3:material3:$Material3Version"
            const val MaterialIconsArtifact =
                "androidx.compose.material:material-icons-extended:$Version"
            const val RuntimeArtifact = "androidx.compose.runtime:runtime:$Version"
            const val UiArtifact = "androidx.compose.ui:ui:$Version"
            const val UiToolingArtifact = "androidx.compose.ui:ui-tooling:$Version"
            const val UiToolingPreviewArtifact =
                "androidx.compose.ui:ui-tooling-preview:$Version"
        }

        object Core {
            const val Version = "1.7.0"

            const val KtxArtifact = "androidx.core:core-ktx:$Version"
        }

        object Splashscreen {
            const val Version = "1.0.0-alpha01"

            const val Artifact = "androidx.core:core-splashscreen:$Version"
        }
    }

    object Material {
        const val Version = "1.5.0-alpha05"

        const val Artifact = "com.google.android.material:material:$Version"
    }

    object ComposeDialog {
        const val Version = "0.6.1"

        const val DateTimeArtifact =
            "io.github.vanpra.compose-material-dialogs:datetime:$Version"
    }

    object Maven {
        const val Publish = "maven-publish"
    }
}