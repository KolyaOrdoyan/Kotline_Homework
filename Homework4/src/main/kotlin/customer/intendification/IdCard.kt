package customer.intendification

import java.util.*

class IdCard {
    var surname: String = ""
    var name: String = ""
    var birthDate: String = ""
    var identityNumber: Int = 0

    val scanner = Scanner(System.`in`)

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

    override fun toString(): String {
        return "IdCard(surname='$surname', name='$name', birthDate='$birthDate', identityNumber=$identityNumber)"
    }
}