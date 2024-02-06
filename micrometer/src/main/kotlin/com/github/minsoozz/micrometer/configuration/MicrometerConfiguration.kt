package com.github.minsoozz.micrometer.configuration

import io.micrometer.core.aop.CountedAspect
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MicrometerConfiguration {

    @Bean
    fun countedAspect(meterRegistry: MeterRegistry): CountedAspect {
        return CountedAspect(meterRegistry)
    }
}