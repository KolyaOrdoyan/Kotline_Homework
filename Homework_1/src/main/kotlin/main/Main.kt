package main

import Array.ArrayGenerator
import backstory.Backstory

fun main() {
    val backstory = Backstory()
    backstory.start()

    backstory.step(ArrayGenerator.arrayGenerator)
}