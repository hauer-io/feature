package io.hauer.demo.feature

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

import static org.springframework.http.MediaType.APPLICATION_JSON

@ActiveProfiles("experimental")
@SpringBootTest
@AutoConfigureWebTestClient
class ExperimentalSpec extends Specification {

    @Autowired
    WebTestClient testClient

    def "hello world"() {
        expect:
        testClient.get()
                .uri("/api/hello")
                .accept(APPLICATION_JSON)
                .exchange()
                .expectStatus()
                .isOk()
                .expectHeader()
                .contentType(APPLICATION_JSON)
                .expectBody()
                .json("{\"message\": \"Howdy World!\"}")
    }

    def "hello Tim"() {
        expect:
        testClient.get()
                .uri("/api/hello/Tim")
                .accept(APPLICATION_JSON)
                .exchange()
                .expectStatus()
                .isOk()
                .expectHeader()
                .contentType(APPLICATION_JSON)
                .expectBody()
                .json("{\"message\": \"Howdy Tim!\"}")
    }
}
