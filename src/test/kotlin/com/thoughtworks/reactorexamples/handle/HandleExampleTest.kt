package com.thoughtworks.reactorexamples.handle

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux

internal class HandleExampleTest {

    private val handleExample = HandleExample()

    @Test
    fun `should return the Alphabets for given numbers`() {
        handleExample.handle(Flux.just(-1, 30, 13, 9, 20)).subscribe { println(it) }
    }
}