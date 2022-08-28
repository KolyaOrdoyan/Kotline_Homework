package banks.centralBank

import actions.scanner
import customer.Customer

open class CentralBank {
    fun cashIn() {
        insertId()
    }

    fun cashOut() {
        val customer = Customer()
        customer.vibor()
    }

    fun transfers() {
        val customer = Customer()
        customer.vibor()
    }

    fun deposit() {
        val customer = Customer()
        customer.vibor()
    }

    fun loan() {
        val customer = Customer()
        customer.vibor()
    }

    fun accountCard() {
        val customer = Customer()
        customer.vibor()
    }

    fun legalEntities() {
        val customer = Customer()
        customer.vibor()
    }

    fun insertId() {
        print("pleas select one is true 1. <<insert id>> 2. <<register in Bank>>   ")
        when (scanner.next()) {
            "1" -> {
                println("hello world")
            }
            "2" -> {
                val customer = Customer()
                customer.vibor()
            }
            else -> {
                println("pleas insert only <<1>> or <<2>>")
                insertId()
            }
        }
    }

}