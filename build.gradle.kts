plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    compileOnly("jakarta.platform:jakarta.jakartaee-web-api:10.0.0")
    implementation("jakarta.xml.ws:jakarta.xml.ws-api:4.0.0")
    implementation("com.sun.xml.ws:jaxws-rt:4.0.1")
    compileOnly("org.apache.nifi:nifi-ssl-context-service-api:1.23.0")


}

tasks.test {
    useJUnitPlatform()
}