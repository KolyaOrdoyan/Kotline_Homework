package banks.ameriaBank

import banks.centralBank.CentralBank
import java.util.*

class AmeriaBank : CentralBank() {

    val scanner = Scanner(System.`in`)

    fun next() {
            chooseMenu()
        when (scanner.next()) {
            "1" -> {
                cashIn()
            }
            "2" -> {
                cashOut()
            }
            "3" -> {
                transfers()
            }
            "4" -> {
                loan()
            }
            "5" -> {
                accountCard()
            }
            "6" -> {
                legalEntities()
            }
            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> <<6>> ")
                next()
            }
        }
    }
}