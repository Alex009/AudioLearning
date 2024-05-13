plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsCompose) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinCocoapods).apply(false)
}
buildscript{
    dependencies {
        classpath("dev.icerock.moko:resources-generator:0.23.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }

}
