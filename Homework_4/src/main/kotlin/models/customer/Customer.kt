package models.customer

import models.customer.intendification.IdCard
import models.customer.intendification.Passport
import java.util.*

class Customer {
    val scanner = Scanner(System.`in`)

    fun choice() {
        println("Pleas select 1. IdCard 2. Passport")

        when (scanner.next()) {
            "1" -> {
                val idCard = IdCard()
                idCard.reg()
                println(idCard.toString())
            }
            "2" -> {
                val passport = Passport()
                passport.reg()
                println(passport.toString())
            }
            else -> {
                println("Pleas insert only <<1>> or <<2>>")
                choice()
            }
        }
    }
}
