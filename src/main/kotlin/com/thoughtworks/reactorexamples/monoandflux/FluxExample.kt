package com.thoughtworks.reactorexamples.monoandflux

import reactor.core.publisher.Flux

class FluxExample {

    fun fruitsFlux(): Flux<String> {
        return Flux.fromIterable(listOf("apple", "mango", "orange", "grapes")).log()
    }

}