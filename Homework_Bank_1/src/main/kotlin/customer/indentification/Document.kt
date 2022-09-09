package customer.indentification

import java.util.Date

open class Document(
    val name: String,
    val surname: String,
    val birthDate: String,
) {
    override fun toString(): String {
        return "Document(name='$name', surname='$surname', birthDate=$birthDate)"
    }
}