package operations.legal_entities

import operations.app.App
import operations.credit_card.CreditCard
import operations.loan.Loan
import java.util.*

class LegalEntities {
    private val scanner = Scanner(System.`in`)

    fun legalEntities() {
        print("Pleas enter the name of your corporation: ")
        val corporationName = scanner.next()
        choice()
    }


    private fun choice() {
        println(
            "1. cash in 2. cash out +\n" +
                    " 3. transfers 4. loan +\n" +
                    " 5.account card 6.end program"
        )

        when (App.scanner.next()) {
            "1" -> {
                println("How much money do you want to deposit into your account?")
                print("The amount of money: ")
                val money = App.scanner.nextLong()
                App.customer.balance += money
                print(App.customer)
                println("Your balance is: ${App.customer.balance}")
                choice()
            }

            "2" -> {
                println("How much money do you want to withdraw from your account?")
                print("The amount of money: ")
                val money = App.scanner.nextLong()
                App.customer.balance -= money
                println("Your account balance ${App.customer.balance}")
                choice()
            }

            "3" -> {
                println("pleas enter the account number to which you want to transfer money: ")
                val accountNumber = App.scanner.nextLong()
                print("The amount of money you wnt to transfer: ")
                val money = App.scanner.nextLong()
                App.customer.balance -= money
                println("your balance is: ${App.customer.balance}")
                choice()
            }

            "4" -> {
                val loan = Loan()
                loan.loanForCustomer()
                choice()
            }

            "5" -> {
                val creditCard = CreditCard()
                creditCard.creditCardGeneration()
                choice()
            }

            "6" -> {
                println("Thank you for using this program :)")
            }

            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> <<6>> ")
                choice()
            }
        }
    }
}