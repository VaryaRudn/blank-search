plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Test> {
    systemProperty("file.encoding", "UTF-8")
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.codeborne:selenide:7.9.1")
    implementation("ch.qos.logback:logback-classic:1.4.14")
    testImplementation("io.rest-assured:rest-assured:5.4.0")
    // testImplementation("io.github.bonigarcia:webdrivermanager:6.1.0")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("selenide.browser", "chrome")
    systemProperty("selenide.headless", "true")
}
