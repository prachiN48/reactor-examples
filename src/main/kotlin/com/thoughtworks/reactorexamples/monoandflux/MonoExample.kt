package com.thoughtworks.reactorexamples.monoandflux

import reactor.core.publisher.Mono

class MonoExample {

    fun fruitMono(): Mono<String> {
        return Mono.just("apple")
    }

}