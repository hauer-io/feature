package io.hauer.demo.feature

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@ConditionalOnProperty("feature.name")
@RestController
class ExperimentalHelloController (private val helloService: HelloService) {
    @GetMapping("/api/hello/{name}")
    fun helloWorld(@PathVariable name : String) = helloService.hello(name).map { mapOf("message" to it) }
}