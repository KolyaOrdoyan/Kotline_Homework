package Main

import Array.ArrayGenerator
import backstory.Backstory
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val backstory = Backstory()
    backstory.start()

    backstory.step(ArrayGenerator.arrayGenerator)
}