package models.customer.intendification

import models.customer.Customer
import java.util.Date

class Passport(
    name: String,
    surname: String,
    birthDate: Date,
    val serialNumber: String
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
                "birthdate= '$birthDate', serialNumber='$serialNumber')"
    }
}
//    private var lastID: Int = 0
//
//    var surname: String = ""
//    var name: String = ""
//    var birthDate: String = ""
//    var identityNumber: Int = 0
//    var address: String = ""
//
//    val scanner = Scanner(System.`in`)
//    private val id: Int = lastID + 1
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
//        print("Pleas inset your address: ")
//        address = scanner.next()
//    }
//
//    override fun toString(): String {
//        return "Passport your id is: $id (surname='$surname', name='$name', birthDate='$birthDate'," +
//                " identityNumber=$identityNumber, address= $address)"
//    }
