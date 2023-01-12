
plugins {
    scala
    application
}

group = "ru.vood"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.9")

    implementation("com.google.guava:guava:31.1-jre")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.scalatest:scalatest_2.13:3.2.13")
    testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.2.0")

    testRuntimeOnly("org.scala-lang.modules:scala-xml_2.13:1.2.0")
}

tasks.test {
    useJUnitPlatform()
}



application {
    mainClass.set("MainKt")
}