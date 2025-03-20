plugins { alias(libs.plugins.android.application) }

android {
    namespace = "com.den.smlr_java"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.den.smlr_java"
        minSdk = 1
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isShrinkResources = true
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}