package actions

import models.address.Address
import models.bank.Bank
import services.ServicesEnum
import java.util.Scanner

class App {
    companion object App {
        private val scan = Scanner(System.`in`)
        private val bank = Bank("Ineco", Address("Yerevan", "Moskovyan", "33"))
        private val branch1 = bank.addNewBranch(Address("Yerevan", "Halabyan", "6/1"))

        private fun chooseService() {
            for (service in ServicesEnum.values()) {
                println(service)

                when (scan.next()) {
                    "1" -> {
                        println("1. Cash in")
                        println("2. Cash out")
                        when (scan.next()) {
                            "1" -> {
                                println(branch1.generateAccount())
                            }
                            "2" -> {}
                            else -> {
                                println("ERROR")
                            }
                        }
                    }
                    "2" -> {}
                    "3" -> {}
                    "4" -> {}
                    "5" -> {}
                    "6" -> {}
                    else -> {
                        println("Pleas insert only 1,2,3,4,5 or 6")
                        chooseService()
                    }
                }
            }
        }

        fun start() {
            var run = true
            println(ActionEnum.WELCOME)
            println(ActionEnum.CHOOSE_BRANCH)
            for (branch in Bank.branches.values) {
                println(branch)
            }

            when (scan.next()) {
                "1" -> {
                    println(Bank.branches[1])
                    chooseService()
                }
                "2" -> {
                    println(Bank.branches[2])
                    chooseService()
                }
                else -> {
                    println("Pleas insert only 1,2,3,4,5 or 6")
                    chooseService()
                }
            }
        }

        fun cashIn() {

        }

        fun cashOut() {

        }

    }


}