package backstory

import java.util.*

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

    }
}

