plugins {
    kotlin("js") version "1.7.0"
}

group = "me.ghulo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.5")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:17.0.2-pre.229-kotlin-1.5.21")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:17.0.2-pre.229-kotlin-1.5.21")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled:5.3.0-pre.229-kotlin-1.5.21")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:5.2.0-pre.229-kotlin-1.5.21")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.0-pre.229-kotlin-1.5.21")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.4-pre.229-kotlin-1.5.21")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}