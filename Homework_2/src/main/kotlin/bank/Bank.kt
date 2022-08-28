package bank

import calculate.Calculate
import java.util.*

class Bank {
    fun creditForOurClient() {
        val scanner = Scanner(System.`in`)

        println("We offer loans to our clients. Here are the percentages for the year: ")
        println("1. 15% up to 5 million 2. 20% up to 10 million")
        print("Which option will you choose?: ")

        when (scanner.next()) {
            "1" -> {
                val calculate = Calculate()
                calculate.loanForCustomer5mill()
            }
            "2" -> {
                val calculate = Calculate()
                calculate.loanForCustomer10mill()
            }
            else -> {
                println("pleas enter <<1>> or <<2>>")
                creditForOurClient()
            }
        }
    }
}