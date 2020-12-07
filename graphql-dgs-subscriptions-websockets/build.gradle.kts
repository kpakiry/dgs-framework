/*
 * Copyright 2020 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    kotlin("jvm")
}


dependencies {
    implementation(project(":graphql-dgs"))

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.10.+")
    compileOnly("org.springframework.boot:spring-boot-autoconfigure:${Versions.SPRING_BOOT_VERSION}")
    compileOnly("org.springframework:spring-web:${Versions.SPRING_VERSION}")
    compileOnly("org.springframework:spring-websocket:${Versions.SPRING_VERSION}")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.1")
    testImplementation("io.mockk:mockk:1.10.3-jdk8")
    testImplementation("org.assertj:assertj-core:3.+")
    testImplementation("io.reactivex.rxjava3:rxjava:3.+")
}