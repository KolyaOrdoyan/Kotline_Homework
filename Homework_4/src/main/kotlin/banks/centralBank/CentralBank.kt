package banks.centralBank

import actions.ActionEnum
import actions.App
import actions.scanner
import models.customer.Customer
import models.customer.intendification.IdCard
import models.creditCard.CreditCard
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
        println("your account balance ${idCard.balance}")
        val start = App()
        backToMenu()
    }

    fun cashOut() {
        insertId()
        println(ActionEnum.TEXT_BANK_CASH_OUT)
        print(ActionEnum.TEXT_BANK_AMOUNT)
        val money = scanner.nextLong()
        var idCard = IdCard()
        idCard.balance -= money
        println("your account balance ${idCard.balance}")
        backToMenu()
    }

    fun transfers() {
        insertId()
        print(ActionEnum.TEXT_BANK_TRANSFERS)
        val accountNumber = scanner.nextInt()
        print("The amount of money you wnt to transfer: ")
        val money = scanner.nextLong()
        var idCard = IdCard()
        idCard.balance -= money
        println("your balance is: ${idCard.balance}")
        backToMenu()
    }

    fun loan() {
        insertId()
        val loan = Loan()
        loan.loanForCustomer()
        backToMenu()
    }

    fun accountCard() {
        val creditCard = CreditCard()
        creditCard.creditCardGeneration()
        backToMenu()
    }

    fun legalEntities() {
        val legalEntities = LegalEntities()
        legalEntities.legalEntities()
        backToMenu()
    }

    fun insertId() {
        print("pleas select one is true 1. <<insert id>> 2. <<register in Bank>>   ")
        when (scanner.next()) {
            "1" -> {
                val map = IdCard()
//                println(map.customerMap)
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

    fun chooseMenu() {
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
                chooseMenu()
            }
        }
    }

    private fun backToMenu() {
        println("1. back to menu, 2. end program ")
        when (scanner.next()) {
            "1" -> {
                chooseMenu()
            }
            "2" -> {
                println("thank you for using this program: ")
            }
        }
    }
}