package backstory

import array.ArrayGenerator
import functions.Operations
import java.util.*

class Backstory {
    private val scanner: Scanner = Scanner(System.`in`)

    fun start() {
        println("Hello my friend I am program '_' ")
        println("press ENTER for continue")
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
    }

    fun step(list: List<Int>) {
        println("Here are the steps i can take")
        println("1. maximum and 2. minimum in List")
        println("3. show list, 4. minimize, 5. maximize")
        println("6. show your entered number and 7. show duplicate number")
        println("8. end program")

        val input: String? = scanner.next()
        val operations = Operations()

        when (input) {
            "1" -> {
                operations.max(list)
                step(ArrayGenerator.arrayGenerator)
            }
            "2" -> {
                operations.min(list)
                step(ArrayGenerator.arrayGenerator)

            }
            "3" -> {
                operations.showList(list)
                step(ArrayGenerator.arrayGenerator)

            }
            "4" -> {
                operations.minimize(list)
                step(ArrayGenerator.arrayGenerator)

            }
            "5" -> {
                operations.maximize(list)
                step(ArrayGenerator.arrayGenerator)

            }
            "6" -> {
                print("input number for search:  ")
                val number: Int = scanner.nextInt()
                operations.showAddNumber(list, number)
                step(ArrayGenerator.arrayGenerator)

            }
            "7" -> {
                print("input number for search:  ")
                val number: Int = scanner.nextInt()
                operations.duplicate(list, number)
                step(ArrayGenerator.arrayGenerator)
            }
            "8" -> {
                println("Thank you for using program byy '_'")
            }
            else -> {
                println("pleas input only number")
                step(ArrayGenerator.arrayGenerator)
            }
        }
    }
}

