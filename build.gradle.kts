buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(Plugins.ClassPath.gradlePlugin)
        classpath(Plugins.ClassPath.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}


tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}