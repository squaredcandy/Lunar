plugins {
    id(Library.Android.LibraryPlugin)
    id(Library.Kotlin.AndroidPlugin)
}

android {
    commonAndroid()
    composeFeatures()
    kotlinOptions {
        jvmTarget = Library.Android.JavaVersion
    }
}

dependencies {
    api(project(":lunar-common"))

    implementation(Library.AndroidX.Compose.AnimationArtifact)
    implementation(Library.AndroidX.Compose.CompilerArtifact)
    implementation(Library.AndroidX.Compose.FoundationArtifact)
    implementation(Library.AndroidX.Compose.MaterialArtifact)
    implementation(Library.AndroidX.Compose.MaterialIconsArtifact)
    implementation(Library.AndroidX.Compose.RuntimeArtifact)
    implementation(Library.AndroidX.Compose.UiArtifact)
    implementation(Library.AndroidX.Compose.UiToolingArtifact)
    implementation(Library.AndroidX.Compose.UiToolingPreviewArtifact)
    implementation(Library.AndroidX.Splashscreen.Artifact)

    implementation(Library.Material.Artifact)

    api(Library.ComposeDialog.DateTimeArtifact)
}