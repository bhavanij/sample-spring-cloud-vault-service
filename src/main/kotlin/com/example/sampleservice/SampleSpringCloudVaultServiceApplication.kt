package com.example.sampleservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SampleSpringCloudVaultServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SampleSpringCloudVaultServiceApplication::class.java, *args)
}
