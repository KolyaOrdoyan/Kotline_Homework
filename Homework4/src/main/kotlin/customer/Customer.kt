package customer

import customer.intendification.IdCard
import customer.intendification.Passport
import java.util.*

class Customer {
    val scanner = Scanner(System.`in`)

    fun vibor() {
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
                passport.toString()
            }
            else -> {
                println("Pleas insert only <<1>> or <<2>>")
                vibor()
            }
        }
    }
}