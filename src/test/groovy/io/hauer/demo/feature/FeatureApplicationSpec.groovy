package io.hauer.demo.feature

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification

@SpringBootTest
class FeatureApplicationSpec extends Specification {
    @Autowired(required = false)
    ApplicationContext context

    def "smoke test"() {
        expect:
        context
    }
}
