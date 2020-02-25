package io.hauer.demo.feature

import reactor.test.StepVerifier
import spock.lang.Specification
import spock.lang.Unroll

class HelloServiceSpec extends Specification {

    @Unroll
    def "hello #EXPECTED"() {
        given:
        def properties = new FeatureProperties(false, SALUTATION)
        def service = new HelloService(properties)

        expect:
        StepVerifier.create(service.hello(NAME)).expectNext(EXPECTED).expectComplete().verify()

        where:
        SALUTATION | NAME      | EXPECTED
        "Hello"    | "Tim"     | "Hello Tim!"
        "Hi"       | "Tim"     | "Hi Tim!"
        "Howdy"    | "Tim"     | "Howdy Tim!"
        "Hello"    | "Struppi" | "Hello Struppi!"
        "Hi"       | "Struppi" | "Hi Struppi!"
        "Howdy"    | "Struppi" | "Howdy Struppi!"
    }
}
