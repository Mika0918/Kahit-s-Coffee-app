val implementation: Unit = Unit

val testImplementation: Unit = Unit

val androidTestImplementation: Unit = Unit

val annotationProcessor: Unit = Unit

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.kahit"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kahit"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
dependencies {
    implementation; "androidx.appcompat:appcompat:1.3.1"
    implementation; "com.google.android.material:material:1.4.0"
    implementation; "androidx.constraintlayout:constraintlayout:2.0.4"
    implementation; "com.github.bumptech.glide:glide:4.12.0"
    annotationProcessor; "com.github.bumptech.glide:compiler:4.12.0"
    testImplementation; "junit:junit:4.13.2"
    androidTestImplementation; "androidx.test.ext:junit:1.1.3"
    androidTestImplementation; "androidx.test.espresso:espresso-core:3.4.0"
}

