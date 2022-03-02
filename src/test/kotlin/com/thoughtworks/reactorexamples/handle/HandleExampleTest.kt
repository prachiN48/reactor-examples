package com.thoughtworks.reactorexamples.handle

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

internal class HandleExampleTest {

    private val handleExample = HandleExample()

    @Test
    fun `should return the Alphabets for given numbers`() {
        handleExample.handle(Flux.just(-1, 30, 13, 9, 20)).subscribe { println(it) }
    }

    @Test
    fun `should return the Alphabet for given number`() {
        handleExample.handle(Mono.just(-1)).subscribe { println(it) }
    }
}