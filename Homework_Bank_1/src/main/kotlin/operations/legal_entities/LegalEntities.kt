package operations.legal_entities

import java.util.*

class LegalEntities {
    val scanner = Scanner(System.`in`)

    fun legalEntities() {
        print("Pleas enter the name of your corporation: ")
        val corporationName = scanner.next()

        choice()
    }


    private fun choice() {
        println(
            "1. cash in 2. cash out +\n" +
                    " 3. transfers 4. loan +\n" +
                    " 5.account card"
        )

        when (scanner.next()) {
            "1" -> {

            }

            "2" -> {

            }

            "3" -> {

            }

            "4" -> {

            }

            "5" -> {

            }

            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> ")
                choice()
            }
        }
    }
}