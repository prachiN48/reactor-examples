package com.thoughtworks.reactorexamples.handle

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.publisher.SynchronousSink


class HandleExample {

    private val alphabet = Alphabet()

    fun handle(input: Flux<Int>): Flux<String> {
        return input.handle { inputValue, sink: SynchronousSink<String> ->
            val alphabet = alphabet.alphabetFor(inputValue)
            if(alphabet == null) {
                println("invalid value : $inputValue")
            } else {
                sink.next(alphabet)
            }
        }
    }

    fun handle(input: Mono<Int>): Mono<String> {
        return input.handle { inputValue, sink: SynchronousSink<String> ->
            val alphabet = alphabet.alphabetFor(inputValue)
            if(alphabet == null) {
                println("invalid value : $inputValue")
            } else {
                sink.next(alphabet)
            }
        }
    }
}