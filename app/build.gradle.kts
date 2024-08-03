plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.suvashapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.suvashapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.camera.core)
    implementation(libs.camera.lifecycle)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(libs.appcompat.v151)

    implementation(libs.core)

    implementation(libs.zxing.android.embedded)
    implementation(libs.barcode.scanning)

    // CameraX core library
    implementation (libs.androidx.camera.core.v120)

    // CameraX lifecycle library
    implementation(libs.androidx.camera.lifecycle.v120)

    // CameraX view library (if you need camera preview)
    implementation(libs.androidx.camera.view)

    // CameraX extensions (optional, for additional features like HDR)
    implementation(libs.androidx.camera.extensions)

    implementation(libs.barcode.scanning.v1703)

}


