package customer.indentification

class Passport(
    name: String,
    surname: String,
    birthDate: String,
    val serialNumber: String
) : Document(name, surname, birthDate) {

    override fun toString(): String {
        return "IdCard(name= '$name', surname= '$surname', " +
                "birthdate= '$birthDate', serialNumber= '$serialNumber')"
    }
}