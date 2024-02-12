package com.github.minsoozz.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @EnableBatchProcessing 어노테이션은 5.0 이후 사용하지 않는다
 */
@SpringBootApplication
class SpringBatchApplication

fun main(args: Array<String>) {
    runApplication<SpringBatchApplication>(*args)
}