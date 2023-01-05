plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    // Kotlin DSL support
    implementation(platform(kotlin("bom")))
    implementation(kotlin("gradle-plugin"))
    implementation(kotlin("script-runtime"))
}
