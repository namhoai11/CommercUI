plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.commerc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.commerc"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.database)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    //    implementation("io.coil-kt:coil-compose:2.4.0")
//    implementation("com.google.accompanist:accompanist-pager:0.30.1")
//    implementation("com.google.accompanist:accompanist-pager-indicators:0.30.1")
////    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
//    implementation("androidx.compose.runtime:runtime-livedata:1.7.4")
//    implementation("com.github.bumptech.glide:glide:4.12.0")
//    implementation("com.google.code.gson:gson:2.9.1")
//    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
//    implementation("androidx.compose.foundation:foundation:1.7.4")



    implementation(libs.accompanist.permissions)

    implementation("com.google.accompanist:accompanist-pager:0.30.1")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.30.1")

    implementation(libs.coil.compose)
//    implementation(libs.accompanist.paper.indicators)
//    implementation(libs.accompanist.paper)
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
    implementation(libs.androidx.runtime.livedata)
    implementation(libs.glide)
    implementation(libs.gson)
    implementation(libs.androidx.constraintlayout.compose)
    implementation(libs.androidx.foundation)
}