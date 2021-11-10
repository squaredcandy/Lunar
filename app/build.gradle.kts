plugins {
    id(Library.Android.ApplicationPlugin)
    id(Library.Kotlin.AndroidPlugin)
}

android {
    commonAndroid()
    composeFeatures()
    packagingOptions()
    kotlinOptions {
        jvmTarget = Library.Android.JavaVersion
    }
}

dependencies {
    implementation(project(":lunar"))
    implementation(project(":lunar3"))

    implementation(Library.Kotlin.Coroutines.CoreArtifact)
    implementation(Library.Kotlin.Coroutines.AndroidArtifact)

    implementation(Library.AndroidX.Activity.KtxArtifact)
    implementation(Library.AndroidX.Activity.ComposeArtifact)
    implementation(Library.AndroidX.AppCompat.Artifact)
    implementation(Library.AndroidX.Core.KtxArtifact)
    implementation(Library.AndroidX.Splashscreen.Artifact)

    implementation(Library.AndroidX.Compose.AnimationArtifact)
    implementation(Library.AndroidX.Compose.CompilerArtifact)
    implementation(Library.AndroidX.Compose.FoundationArtifact)
    implementation(Library.AndroidX.Compose.MaterialArtifact)
    implementation(Library.AndroidX.Compose.Material3Artifact)
    implementation(Library.AndroidX.Compose.MaterialIconsArtifact)
    implementation(Library.AndroidX.Compose.RuntimeArtifact)
    implementation(Library.AndroidX.Compose.UiArtifact)
    implementation(Library.AndroidX.Compose.UiToolingArtifact)
    implementation(Library.AndroidX.Compose.UiToolingPreviewArtifact)
}