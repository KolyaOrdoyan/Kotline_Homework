package models.customer

import actions.scanner
import models.customer.intendification.IdCard
import models.customer.intendification.Passport
import java.util.*
import kotlin.random.Random


private var customerID: Int = 0


class Customer(
    override val entries: MutableSet<MutableMap.MutableEntry<String, Customer>>,
    override val keys: MutableSet<String>
) : MutableMap<String, Customer> {
    private val id: Int = customerID + 1
    var balance: Long = 0
    private val name: String = document.name
    private val surname: String = document.surname
    val birthDate = document.birthDate
    private var account: String

    val scanner = Scanner(System.`in`)
    companion object {
        fun dataEntry(s: String): MutableMap<String, Customer> {
            print("Name: ")
            val name = scanner.next()
            print("Surname: ")
            val surname = scanner.next()
            print("Birthday year: ")
            val year = scanner.next().toInt()
            print("Birthday month: ")
            val month = scanner.next().toInt()
            print("Birthday day: ")
            val day = scanner.next().toInt()
            if (s == "IdCard") {
                print("Id number: ")
                val numberID = scanner.next()
                print("Social card numbers: ")
                val socialCardNumbers = scanner.next()

                return IdCard(name, surname, Date(year, month, day), numberID, socialCardNumbers)

            } else {
                print("Passport serial number: ")
                val serialNumber = scanner.next()

                return Passport(name, surname, Date(year, month, day), serialNumber)
            }
        }

        var customers = mutableMapOf<String, Customer>()
    }

    init {
        customerID += 1
        account = generateAccountNumber()
        if (document is IdCard) {
            customers[document.numberID] = this
        } else if (document is Passport) {
            customers[document.serialNumber] = this
        }
    }

    fun getFullName(): String {
        return "$name $surname".toUpperCase()
    }

    override fun containsKey(key: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsValue(value: Customer): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(key: String): Customer? {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(key: String): Customer? {
        TODO("Not yet implemented")
    }

    override fun putAll(from: Map<out String, Customer>) {
        TODO("Not yet implemented")
    }

    override fun put(key: String, value: Customer): Customer? {
        TODO("Not yet implemented")
    }


    override fun toString(): String {
        return "Customer(id=$id, balance=$balance, account='$account', document=$document)"
    }


    private fun generateAccountNumber(): String {
        var accountNumber = "205"
        accountNumber += Random.nextLong(100000000000, 9999999999999)
        return accountNumber
    }

    fun choice() {
        println("Pleas select 1. IdCard 2. Passport")

        when (scanner.next().trim()) {
            "1" -> {
                val customer = Customer.dataEntry("IdCard")
                customers = customer
            }

            "2" -> {
                val customer = Customer.dataEntry("Passport")
                customers = customer
            }

            else -> {
                println("Pleas insert only <<1>> or <<2>>")
                choice()
            }
        }
    }

}
