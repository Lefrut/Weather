plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)
}

android {
    namespace = Config.nameSpace
    compileSdk = Config.sdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.sdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentation
    }

    buildTypes {
        release {
            isMinifyEnabled = Config.minifyEnabled
            proguardFiles(
                getDefaultProguardFile(Config.getDefaultProguardFiles),
                Config.proguardFiles
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }
}

dependencies {

    implementation(Libraries.Android.coreKtx)
    implementation(Libraries.Android.appCompat)
    implementation(Libraries.Android.material)
    implementation(Libraries.Android.constraintLayout)

    testImplementation(Libraries.Tests.junit)
    androidTestImplementation(Libraries.Tests.junit)
    androidTestImplementation(Libraries.Tests.junit)
}