package operations

import app.menu.MainMenu
import operations.credit_card.CreditCard
import operations.legal_entities.LegalEntities
import operations.loan.Loan

class Operations {

    fun operations() {
        println("Choose one of the services provided by the bank:  ")
        println(
            "1. cash in 2. cash out" +
                    " 3. transfers 4. loan " +
                    "5.account card 6.legal entities"
        )

        when (MainMenu.scanner.next()) {
            "1" -> {
                println("How much money do you want to deposit into your account?")
                print("The amount of money: ")
                val money = MainMenu.scanner.nextLong()
                MainMenu.customer.balance += money
                print(MainMenu.customer)
                println("Your balance is: ${MainMenu.customer.balance}")
                operations()
            }

            "2" -> {
                println("How much money do you want to withdraw from your account?")
                print("The amount of money: ")
                val money = MainMenu.scanner.nextLong()
                MainMenu.customer.balance -= money
                println("Your account balance ${MainMenu.customer.balance}")
                operations()
            }

            "3" -> {
                println("pleas enter the account number to which you want to transfer money: ")
                val accountNumber = MainMenu.scanner.nextLong()
                print("The amount of money you wnt to transfer: ")
                val money = MainMenu.scanner.nextLong()
                MainMenu.customer.balance -= money
                println("your balance is: ${MainMenu.customer.balance}")
                operations()
            }

            "4" -> {
                val loan = Loan()
                loan.loanForCustomer()
                operations()
            }

            "5" -> {
                val creditCard = CreditCard()
                creditCard.creditCardGeneration()
                operations()
            }

            "6" -> {
                val legalEntities = LegalEntities()
                legalEntities.legalEntities()
            }
            else->{
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> <<6>> ")
                operations()
            }
        }
    }

     fun operationsForBankCustomers(){
        println("Choose one of the services provided by the bank:  ")
        println(
            "1. loan 2.account card"
        )

        when (MainMenu.scanner.next()) {

            "1" -> {
                val loan = Loan()
                loan.loanForCustomer()
                operationsForBankCustomers()
            }

            "2" -> {
                val creditCard = CreditCard()
                creditCard.creditCardGeneration()
                operationsForBankCustomers()
            }

            else->{
                println("pleas enter only this numbers <<1>> <<2>> ")
                operationsForBankCustomers()
            }
        }
    }
}