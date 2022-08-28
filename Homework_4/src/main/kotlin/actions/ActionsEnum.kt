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

    TEXT_BANK_SERVICES("1. cash in 2. cash out" +
            "    3. transfers 4. deposit 5. loan " +
            "6.account card 7.legal entities");

    override fun toString(): String {
        return "$text"
    }
}
