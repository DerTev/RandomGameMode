plugins {
    java
    kotlin("jvm") version "1.5.10"
}

group = "de.dertev"
version = "1.0"
// set the Java version you are using, Java 16 is the minimum required version for Minecraft

tasks.compileJava {
    options.release.set(16)
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "16"
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    compileOnly("org.spigotmc:spigot-api:1.17-R0.1-SNAPSHOT")
    implementation("net.axay:kspigot:1.17.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}