package com.thoughtworks.reactorexamples.monoandflux

import org.junit.jupiter.api.Test
import reactor.test.StepVerifier

class FluxExampleTest {
    private val fluxExample = FluxExample()

    @Test
    fun `fruitsFlux - subscribe and print list of fruits`() {
        fluxExample.fruitsFlux().subscribe { println(it) }
    }

    @Test
    fun `fruitsFlux - should return list of fruits`() {
        val fruits = fluxExample.fruitsFlux()

        StepVerifier.create(fruits)
            .expectNext("apple", "mango", "orange", "grapes")
            .verifyComplete()
    }
}