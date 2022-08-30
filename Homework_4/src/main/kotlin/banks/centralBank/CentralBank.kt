package banks.centralBank

import actions.ActionEnum
import actions.App
import actions.scanner
import customer.Customer
import customer.intendification.IdCard
import models.creditCard.CreditCard
import models.creditCard.CreditCardEnum
import models.legalEntities.LegalEntities
import models.loan.Loan

open class CentralBank {

    fun cashIn() {
        insertId()
        println(ActionEnum.TEXT_BANK_CASH_IN)
        print(ActionEnum.TEXT_BANK_AMOUNT)
        val money = scanner.nextLong()
        var idCard = IdCard()
        idCard.balance += money
        println("your account balance $idCard")
        val start = App()
        println("back to menu ")
        choseMenu()
    }

    fun cashOut() {
        insertId()
        println(ActionEnum.TEXT_BANK_CASH_OUT)
        print(ActionEnum.TEXT_BANK_AMOUNT)
        val money = scanner.nextLong()
        var idCard = IdCard()
        idCard.balance -= money
        println("your account balance $idCard")
        println("back to menu ")
        choseMenu()
    }

    fun transfers() {
        insertId()
        print(ActionEnum.TEXT_BANK_TRANSFERS)
        val accountNumber = scanner.nextInt()
        print("The amount of money you wnt to transfer: ")
        val money = scanner.nextLong()
        var idCard = IdCard()
        idCard.balance -= money
        println("your balance is: $idCard")
        println("back to menu ")
        choseMenu()
    }

    fun loan() {
        insertId()
        val loan = Loan()
        loan.loanForCustomer()
    }

    fun accountCard() {
        val creditCard = CreditCard()
        creditCard.creditCardGeneration()
    }

    fun legalEntities() {
        val legalEntities = LegalEntities()
        legalEntities.legalEntities()
    }

    fun insertId() {
        print("pleas select one is true 1. <<insert id>> 2. <<register in Bank>>   ")
        when (scanner.next()) {
            "1" -> {
                val map = IdCard()
                println(map.customerMap)
            }
            "2" -> {
                val customer = Customer()
                customer.choice()
            }
            else -> {
                println("pleas insert only <<1>> or <<2>>")
                insertId()
            }
        }
    }

    fun choseMenu() {
        println(ActionEnum.TEXT_BANK_SERVICES)

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
                choseMenu()
            }
        }
    }
}