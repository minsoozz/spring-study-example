package com.github.minsoozz.micrometer.controller

import io.micrometer.core.annotation.Counted
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class AopController {

    @Counted("create")
    @GetMapping("/create")
    fun create(): String {
        return "create"
    }

    @Counted("read")
    @GetMapping("/read")
    fun read(): String {
        return "read"
    }

    @Counted("update")
    @GetMapping("/update")
    fun update(): String {
        return "update"
    }

    @Counted("delete")
    @GetMapping("/delete")
    fun delete(): String {
        return "delete"
    }
}