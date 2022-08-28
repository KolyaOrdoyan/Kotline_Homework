package credit_for_customer

import calculate.Calculate
import java.util.*

class Customer {
    fun creditForCustomer() {
        val scanner = Scanner(System.`in`)

        println("Since you are not a client of our bank")
        println("other interest on the loan applies to you")
        println("1. 20% up to 5 million 2. 22% up to 10 million")
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
                creditForCustomer()
            }
        }
    }
}