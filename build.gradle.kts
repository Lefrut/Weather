buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(Plugins.ClassPath.gradlePlugin)
        classpath(Plugins.ClassPath.kotlinGradlePlugin)
    }
}


tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}