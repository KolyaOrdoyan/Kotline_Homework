package models.customer.intendification

import models.customer.Customer
import java.util.*
import kotlin.random.Random

class IdCard(
    name: String,
    surname: String,
    birthDate: Date,
    val numberID: String,
    val socialCardNumbers: String
) : Document(name, surname, birthDate), MutableMap<String, Customer> {
    override val entries: MutableSet<MutableMap.MutableEntry<String, Customer>>
        get() = TODO("Not yet implemented")
    override val keys: MutableSet<String>
        get() = TODO("Not yet implemented")
    override val size: Int
        get() = TODO("Not yet implemented")
    override val values: MutableCollection<Customer>
        get() = TODO("Not yet implemented")

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

    override fun get(key: String): Customer? {
        TODO("Not yet implemented")
    }

    override fun containsValue(value: Customer): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsKey(key: String): Boolean {
        TODO("Not yet implemented")
    }


    override fun toString(): String {
        return "IdCard(name='$name', surname='$surname', " +
                "birthdate='$birthDate', " +
                "numberID='$numberID', socialCard='$socialCardNumbers')"
    }
}
//    private var bankId: Int = 1
//
//    private var surname: String = ""
//    private var name: String = "document.name"
//    private var birthDate: String = "document.birthDate"
//    private var identityNumber: Int = 0
//    var balance: Long = 0
//
//    val scanner = Scanner(System.`in`)
//    private val id: Int = bankId
//
//    private var account: String = generateAccountNumber()
//
//    fun reg() {
//        print("Pleas insert your name: ")
//        name = scanner.next()
//        print("pleas insert your surname: ")
//        surname = scanner.next()
//        print("Pleas insert your birth date (YY/MM/DD): ")
//        birthDate = scanner.next()
//        print("pleas insert your identity card number: ")
//        identityNumber = scanner.nextInt()
//    }
//

//
//    override fun toString(): String {
//        return "IdCard   your id is: $id (surname='$surname', name='$name', birthDate='$birthDate'," +
//                " identityNumber=$identityNumber  balance= $balance, account number: $account) "
//    }

