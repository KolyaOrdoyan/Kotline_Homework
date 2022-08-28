package start

import bank.Bank
import calculate.Calculate
import credit_for_customer.Customer
import registerClient.RegisterClient
import userList.ClientEnum
import java.util.*

class Start {
    private val scanner = Scanner(System.`in`)

    fun start() {
        println("Welcome to Bank:")
        print("Pleas enter <<Id>>, <<register>>, <<client>> or <<calculate>> : ")

        when (scanner.next()) {
            "id" -> {
                print("Pleas select your Id: ")
                val result = ClientEnum.getClientById(scanner.nextInt())
                println(result)
                val bank = Bank()
                bank.creditForOurClient()
            }
            "register" -> {
                val registerClient = RegisterClient()
                registerClient.register()
            }
            "client" -> {
                val client = Customer()
                client.creditForCustomer()
            }
            "calculate" -> {
                val calculate = Calculate()
                calculate.calculateForCustomer()
            }
            else -> {
                println("Pleas enter <<Id>>, <<register>>, <<client>> or <<calculate>> : ")
                start()
            }
        }
    }

}