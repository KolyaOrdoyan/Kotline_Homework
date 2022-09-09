package customer.indentification

import java.util.Date

class IdCard(
    name: String,
    surname: String,
    birthDate: String,
    val numberID: String
) : Document(name, surname, birthDate) {

    override fun toString(): String {
        return "IdCard(name='$name', surname='$surname', " +
                "birthdate= '$birthDate', numberID='$numberID',)"
    }
}