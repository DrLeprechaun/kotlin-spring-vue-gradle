plugins {
    id("org.siouan.frontend") version "1.2.1"
}

group = "com.kotlin-spring-vue"
version = "0.0.1-SNAPSHOT"

buildscript {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("org.siouan:frontend-gradle-plugin:1.2.1")
    }
}

apply(plugin = "org.siouan.frontend")

frontend {
    nodeVersion.set("11.8.0")
    cleanScript.set("run clean")
    assembleScript.set("run build")
}