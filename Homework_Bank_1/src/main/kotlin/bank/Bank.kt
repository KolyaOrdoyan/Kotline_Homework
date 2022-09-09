package bank

import customer.Customer
import kotlin.random.Random

private var bankID: Int = 1

class Bank(val name: String) {
    private var id: Int = bankID

    init {
        bankID += 1
        branches[id] = this
    }

    companion object Bank {
        var branches = HashMap<Int,bank.Bank>()
        var customers = mutableMapOf<String, Customer>()

        fun generateAccount(): String {
            var account = "205"
            account += Random.nextLong(from = 1000000000000, until = 9999999999999).toString()
            return account
        }
    }

    override fun toString(): String {
        return "$id. $name Bank - "
    }
}