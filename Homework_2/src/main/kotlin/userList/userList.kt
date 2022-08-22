package userList

enum class ClientEnum(val id: Int, private val namee: String, private val surname: String, private val age: Int) {

    Karen(1, "Karen", "Ashotyan", 21),
    ASHOT(2, "Ashot", "Hambardzumyan", 23);

    companion object ClientsEnumMap {
        private var clientsEnumMap = mutableMapOf<Int, ClientEnum>()

        init {
            for (client in ClientEnum.values()) {
                clientsEnumMap[client.id] = client
            }
        }

        fun getColorById(id: Int): ClientEnum? {
            return clientsEnumMap[id]
        }
    }

    override fun toString(): String {
        return "$name(id: $id, name: $namee, surname: $surname, age: $age)"
    }
}