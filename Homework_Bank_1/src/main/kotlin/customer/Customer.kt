package customer


import bank.Bank
import customer.indentification.Document
import customer.indentification.IdCard
import customer.indentification.Passport

private var customerID: Int = 0

class Customer(val document: Document) {
    private val id: Int = customerID + 1
    var balance: Long = 0
    private val name: String = document.name
    private val surname: String = document.surname
    val birthDate = document.birthDate
    private var account: String

    init {
        customerID += 1
        account = Bank.generateAccount()
        if (document is IdCard) {
            Bank.customers[document.numberID] = this
        } else if (document is Passport) {
          Bank.customers[document.serialNumber] = this
        }
    }

    fun getFullName(): String {
        return "$name $surname".toUpperCase()
    }

    override fun toString(): String {
        return "Customer(id=$id, balance=$balance, account='$account', document=$document)"
    }
}
