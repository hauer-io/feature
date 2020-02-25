package io.hauer.demo.feature

import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class HelloService(private val properties: FeatureProperties) {
    fun hello(name: String = "World") = Mono.just("${properties.salutation} $name!")
}