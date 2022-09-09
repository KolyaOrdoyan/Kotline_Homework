package operations.app

import customer.Customer
import customer.CustomerEnum
import customer.indentification.Document
import customer.indentification.IdCard
import customer.indentification.Passport
import operations.Operations
import java.util.*

class App {

    companion object App {
        val scanner = Scanner(System.`in`)
        var customer: Customer = identifyCustomer()

        private fun identifyCustomer(): Customer {
            println("Are you a bank customer ???")
            println("1. Yes")
            println("2. No")
            when (scanner.next()) {
                "1" -> {
                    println("Please enter your Id given to you by the bank")
                    val bankId = scanner.nextInt()
                    val registeredCustomer = CustomerEnum.getCustomerById(bankId)
                    println(registeredCustomer.toString())
                    val operations = Operations()
                    operations.operationsForBankCustomers()
                }

                "2" -> {
                    customerRegister()
                }
            }
            return customer
        }

        private fun customerRegister() {
            println("Please provide your document for registration")
            println("1. IdCard")
            println("2. Passport")
            when (scanner.next()) {
                "1" -> {
                    val customer = Customer(dataEntry("IdCard"))
                    App.customer = customer
                    println(customer)
                    val operations = Operations()
                    operations.operations()
                }

                "2" -> {
                    val customer = Customer(dataEntry("Passport"))
                    App.customer = customer
                    println(customer)
                    val operations = Operations()
                    operations.operations()
                }

                else -> {
                    print("Pleas insert <<1>> or <<2>>")
                    customerRegister()
                }
            }
        }

        private fun dataEntry(documentType: String): Document {
            print("Name: ")
            val name = scanner.next()
            print("Surname: ")
            val surname = scanner.next()
            print("Birthday Data: ")
            val year = scanner.next()
            if (documentType == "IdCard") {
                print("Id number: ")
                val numberID = scanner.next()

                return IdCard(name, surname, year, numberID)
            } else {
                print("Passport serial number: ")
                val serialNumber = scanner.next()

                return Passport(name, surname, year, serialNumber)
            }
        }

    }
}