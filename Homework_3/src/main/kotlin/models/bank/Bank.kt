package models.bank

import models.address.Address
import models.cards.CreditCard
import models.customer.Customer
import models.loan.Loan
import kotlin.random.Random

private var bankID: Int = 1

class Bank(private val name: String, private val address: Address) {
    var id: Int = bankID

    init {
        bankID += 1
        Bank.branches[id] = this
    }

    companion object Bank {
        var branches = HashMap<Int, models.bank.Bank>()
        var customers = mutableMapOf<Int, Customer>()
        var loans = HashMap<Int, List<Loan>>()
        var cards = HashMap<Int, List<CreditCard>>()
    }

    fun addNewBranch(address: Address): models.bank.Bank {
        return Bank(name, address)
    }

    override fun toString(): String {
        return "$id. $name Bank - $address"
    }

    fun generateAccount(): String {
        var account = "205"
        account += Random.nextLong(1000000000000, 9999999999999).toString()
        return account
    }
}