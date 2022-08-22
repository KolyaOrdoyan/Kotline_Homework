package registerClient

import bank.Bank
import java.util.*

class RegisterClient {
    fun register() {
        val scanner = Scanner(System.`in`)

        print("pleas insert your name: ")
        val name = scanner.next()
        print("pleas insert your surname: ")
        val surname = scanner.next()
        print("pleas insert your age: ")
        val age = scanner.nextInt()

        println("you have successfully registered with our bank")
        println("Here is your data with our bank")
        println("id: 3, name: $name, surname: $surname, age: $age")
        println("now available to you loans for clients")

        val bank = Bank()
        bank.creditForOurClient()
    }

}