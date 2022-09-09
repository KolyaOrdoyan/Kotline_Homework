package customer

enum class CustomerEnum(
    val id: Int,
    private val namee: String,
    private val surname: String,
    private val age: Int,
    private val balance: Long,
    private val account: Long,
    private val numberId: Long
    ) {

    Karen(1, "Karen", "Ashotyan", 21,500000,20525436543,123654),
    ASHOT(2, "Ashot", "Hambardzumyan", 23,200000,20254365632646,52658);

    companion object CustomersEnumMap {
        private var customerEnumMap = mutableMapOf<Int, CustomerEnum>()

        init {
            for (customer in CustomerEnum.values()) {
                customerEnumMap[customer.id] = customer
            }
        }

        fun getCustomerById(id: Int): CustomerEnum? {
            return customerEnumMap[id]
        }
    }

    override fun toString(): String {
        return "$name(id: $id, name: $namee, surname: $surname, age: $age, balance: $balance, " +
                "account: $account, numberId: $numberId)"
    }
}