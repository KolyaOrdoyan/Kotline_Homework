package Array

import kotlin.random.Random

object ArrayGenerator{
    private val size = Random.nextInt(0,50)
    val arrayGenerator = List(size) { Random.nextInt(0, 100) }
}