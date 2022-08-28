package customer.intendification

import java.util.*

class Passport {
    private var lastID: Int = 0

    var surname: String = ""
    var name: String = ""
    var birthDate: String = ""
    var identityNumber: Int = 0
    var address: String = ""

    val scanner = Scanner(System.`in`)
    private val id: Int = lastID + 1

    fun reg() {
        print("Pleas insert your name: ")
        name = scanner.next()
        print("pleas insert your surname: ")
        surname = scanner.next()
        print("Pleas insert your birth date (YY/MM/DD): ")
        birthDate = scanner.next()
        print("pleas insert your identity card number: ")
        identityNumber = scanner.nextInt()
        print("Pleas inset your address: ")
        address = scanner.next()
    }

    override fun toString(): String {
        return "Passport(surname='$surname', name='$name', birthDate='$birthDate'," +
                " identityNumber=$identityNumber, address= $address)  your id is: $id"
    }

}