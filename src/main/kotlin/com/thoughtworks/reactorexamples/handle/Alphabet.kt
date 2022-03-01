package com.thoughtworks.reactorexamples.handle

class Alphabet {

    fun alphabetFor(letterNumber: Int): String? {
        if (letterNumber < 1 || letterNumber > 26) {
            return null
        }
        val letterIndexAscii = 'A'.code + letterNumber - 1
        return "" + letterIndexAscii.toChar()
    }
}