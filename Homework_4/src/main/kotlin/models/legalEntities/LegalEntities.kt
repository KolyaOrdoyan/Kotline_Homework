package models.legalEntities

import actions.ActionEnum
import banks.centralBank.CentralBank
import java.util.*

class LegalEntities {
    val scanner = Scanner(System.`in`)

    fun legalEntities() {
        print("Pleas enter the name of your corporation: ")
        val corporationName = scanner.next()

        choice()
    }


    private fun choice() {
        println(ActionEnum.TEXT_SERVICE_FROM_CORPORATION)

        when (scanner.next()) {
            "1" -> {
                val centralBank = CentralBank()
                centralBank.cashIn()
            }
            "2" -> {
                val centralBank = CentralBank()
                centralBank.cashOut()
            }
            "3" -> {
                val centralBank = CentralBank()
                centralBank.transfers()
            }
            "4" -> {
                val centralBank = CentralBank()
                centralBank.loan()
            }
            "5" -> {
                val centralBank = CentralBank()
                centralBank.accountCard()
            }
            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> ")
                choice()
            }
        }
    }
}