package com.thoughtworks.reactorexamples.monoandflux

import org.junit.jupiter.api.Test
import reactor.test.StepVerifier

class MonoExampleTest {
    private val monoExample = MonoExample()

    @Test
    fun `fruitMono - subscribe and print fruit`() {
        monoExample.fruitMono().log().subscribe { println(it) }
    }

    @Test
    fun `fruitMono - should return fruit`() {
        val fruit = monoExample.fruitMono()

        StepVerifier.create(fruit)
            .expectNext("apple")
            .verifyComplete()
    }
}