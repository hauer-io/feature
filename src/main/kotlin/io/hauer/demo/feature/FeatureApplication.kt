package io.hauer.demo.feature

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class FeatureApplication

fun main(args: Array<String>) {
    runApplication<FeatureApplication>(*args)
}
