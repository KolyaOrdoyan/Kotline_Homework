package models.customer

enum class CustomerEnum(
    val id: Int, private val namee: String, private val surname: String,
    private val birthDate: String, private val identityNumber: Long
) {

    KAREN(1, "Karen", "Ashotyan", "2001.01.02", 205212245645466),
    ASHOT(2, "Ashot", "Hambardzumyan", "1995.10.30", 2052565565485);

    companion object ClientsEnumMap {
        private var clientsEnumMap = mutableMapOf<Int, CustomerEnum>()

        init {
            for (client in values()) {
                clientsEnumMap[client.id] = client
            }
        }

        fun getCustomerById(id: Int): CustomerEnum? {
            return clientsEnumMap[id]
        }
    }

    override fun toString(): String {
        return "$name(id: $id, name: $namee, surname: $surname, birthDate: $birthDate, identityNumber: $identityNumber)"
    }
}