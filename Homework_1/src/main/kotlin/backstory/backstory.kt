package backstory

import functions.Aron
import java.util.*
import kotlin.random.Random

class Backstory {

    val scanner = Scanner(System.`in`)


    fun start() {
        println("Hello my friend I am program '_' ")
        scanner.findInLine(" ")
        println(
            "My creator didn't me a name, but you can say me Jarvis " +
                    "I was created during World War 2" +
                    "\n" + scanner.findInLine(" ") +
                    "I don't know way i was created at this time '_'" +
                    "But i do absolutely other"
        )

        println()

        println("here's what i can")
        print("But, first set the number to generate the array:   ")
        var size = scanner.nextInt()
        val arrayGenerator = List(size) { Random.nextInt(0, 100) }
        println()


        val fuck = Aron()
        fuck.max(arrayGenerator)
        fuck.min(arrayGenerator)
        fuck.showList(arrayGenerator)
        fuck.minimize(arrayGenerator)
        fuck.maximize(arrayGenerator)

        print("input number for serch:  ")
        var number = scanner.nextInt()
        fuck.showAddNumber(arrayGenerator,number)
        fuck.krknvoxtver(arrayGenerator,number)

    }

}

