package models.customer.intendification

import java.util.*
import kotlin.random.Random

class IdCard {
    private var bankId: Int = 1

    private var surname: String = ""
    private var name: String = "document.name"
    private var birthDate: String = "document.birthDate"
    private var identityNumber: Int = 0
    var balance: Long = 0

    val scanner = Scanner(System.`in`)
    private val id: Int = bankId

    private var account: String = generateAccountNumber()

    fun reg() {
        print("Pleas insert your name: ")
        name = scanner.next()
        print("pleas insert your surname: ")
        surname = scanner.next()
        print("Pleas insert your birth date (YY/MM/DD): ")
        birthDate = scanner.next()
        print("pleas insert your identity card number: ")
        identityNumber = scanner.nextInt()
    }

    private fun generateAccountNumber(): String {
        var accountNumber = "205"
        accountNumber += Random.nextLong(100000000000, 9999999999999)
        return accountNumber
    }

    override fun toString(): String {
        return "IdCard(surname='$surname', name='$name', birthDate='$birthDate'," +
                " identityNumber=$identityNumber your id is: $id balance= $balance), account number: $account "
    }
}
