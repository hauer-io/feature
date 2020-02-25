package io.hauer.demo.feature

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue

@ConstructorBinding
@ConfigurationProperties("feature")
data class FeatureProperties (

        /**
         * Flag to indicate whether personalized salutations are enabled
         */
        @DefaultValue("false")
        val name : Boolean,

        /**
         * Feature flag with the possibility to configure the actual salutation
         */
        @DefaultValue("Hello")
        val salutation : String)