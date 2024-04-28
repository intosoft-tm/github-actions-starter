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
            username = getEnvOrFindProperty( "AXON_BRAVE_OBSERVABILITY_GITHUB_ACTOR")
            password = getEnvOrFindProperty("AXON_BRAVE_OBSERVABILITY_GITHUB_TOKEN")
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_20
}

