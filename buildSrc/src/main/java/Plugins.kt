object Plugins {

    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"

    object ClassPath {

        object Version {
            const val gradle = "7.3.1"
            const val kotlin = "1.7.20"
        }

        //'com.android.library'
        const val gradlePlugin = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"

    }
}