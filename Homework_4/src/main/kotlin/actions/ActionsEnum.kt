package actions

enum class ActionEnum(private val text: String) {
    TEXT_BACKSTORY_P1("Welcome Human pleas enter your place of residence "),
    TEXT_BACKSTORY_P2("1.Ararat 2. Kotayq 3. Syuniq 4. Erevan"),

    TEXT_BANK_ARARAT("1. Ararat Bank 2. Ineco Bank"),
    TEXT_BANK_KOTAYQ("1. Ameria Bank 2. Convers Bank"),
    TEXT_BANK_SYUNIQ("1. Ardshin Bank 2. IdBank"),
    TEXT_BANK_EREVAN(
        """     1. Ararat Bank 2. Ineco Bank 3. Ameria Bank 
     4. Convers Bank 5. Ardshin Bank 6. IdBank""".trimMargin()
    ),

    TEXT_BANK_SERVICES(
        "1. cash in 2. cash out" +
                " 3. transfers 4. loan " +
                "5.account card 6.legal entities"
    ),

    TEXT_BANK_CASH_IN("How much money do you want to deposit into your account? "),
    TEXT_BANK_CASH_OUT("How much money do you want to withdraw into your account? "),
    TEXT_BANK_TRANSFERS("pleas enter the account number to which you want to transfer money: "),
    TEXT_BANK_AMOUNT("The amount of money: "),


    TEXT_BANK_CREDIT_CARDS_TYPE(
        """1. VISA_CLASSIC, 2. MASTERCARD_STANDARD, 3. VISA_GOLD 
        4. MASTERCARD_GOLD, 5. VISA_PLATINUM, 6. MASTERCARD_PLATINUM, 7. VISA_INFINITE
    """.trimMargin()
    ),

    TEXT_SERVICE_FROM_CORPORATION(
        "1. cash in 2. cash out +\n" +
                " 3. transfers 4. loan +\n" +
                " \"5.account card"
    );

    override fun toString(): String {
        return "$text"
    }
}