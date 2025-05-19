plugins {
    id("java")
    id("io.qameta.allure") version "2.9.6" // Исправлено
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

    // https://mvnrepository.com/artifact/io.qameta.allure/allure-junit5
    testImplementation("io.qameta.allure:allure-junit5:2.29.1")

    // testImplementation("io.github.bonigarcia:webdrivermanager:6.1.0")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("selenide.browser", "chrome")
    systemProperty("selenide.headless", "true")
}
