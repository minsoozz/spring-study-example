package com.github.minsoozz.micrometer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicrometerApplication

fun main(args: Array<String>) {
    runApplication<MicrometerApplication>(*args)
}