package com.thoughtworks.reactorexamples.handle

import reactor.core.publisher.Flux


class HandleExample {

    private val alphabet = Alphabet()

    fun handle(input: Flux<Int>): Flux<String> {
        return input.mapNotNull {
            alphabet.alphabetFor(it)
        }
    }
}