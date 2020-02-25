package io.hauer.demo.feature

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController (private val helloService: HelloService) {
    @GetMapping("/api/hello")
    fun helloWorld() = helloService.hello().map { mapOf("message" to it) }
}
