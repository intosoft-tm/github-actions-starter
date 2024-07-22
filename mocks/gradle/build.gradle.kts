group = "me.tmarciniak"

plugins {

}

repositories {
    maven(url = "https://repo1.maven.org/maven2/")
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/Tomasz-Marciniak/axon-brave-observability")
        credentials {
            username = getEnvOrFindProperty("READ_WRITE_PACKAGES_GITHUB_ACTOR")
            password = getEnvOrFindProperty("READ_WRITE_PACKAGES_GITHUB_TOKEN")
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_20
}

