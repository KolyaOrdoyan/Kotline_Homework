package models.creditCard

enum class CreditCardEnum(val type: String, val description: String) {
    VISA_CLASSIC(
        "VISA_CLASSIC",
        "Service fee: AMD 5,000 annually; " +
                "AMD 2,500 if ordered by Internet/Mobile Banking systems"
    ),
    MASTERCARD_STANDARD(
        "Mastercard Standard",
        "Service fee:AMD 5,000 annually; " +
                "AMD 2,500 if ordered by Internet/Mobile Banking systems"
    ),
    VISA_GOLD(
        "Visa Gold",
        "Service fee:AMD 2,000 monthly/ AMD 20,000 annually; " +
                "AMD 10,000 annually if ordered by Internet/Mobile Banking systems"
    ),
    MASTERCARD_GOLD(
        "Mastercard Gold",
        "Service fee: AMD 2,000 monthly/ AMD 20,000 annually; " +
                "AMD 10,000 annually if ordered by Internet/Mobile Banking systems"
    ),
    VISA_PLATINUM(
        "Visa Platinum",
        "Service fee: AMD 3,000 monthly/ AMD 30,000 annually; " +
                "AMD 20,000 annually if ordered by Internet/Mobile Banking systems"
    ),
    MASTERCARD_PLATINUM(
        "Mastercard Platinum",
        "Service fee: AMD 3,000 monthly/ AMD 30,000 annually; " +
                "AMD 20,000 annually if ordered by Internet/Mobile Banking systems"
    ),
    VISA_INFINITE("Visa Infinite", "Service fee: AMD 10,000 monthly/ AMD 100,000 annually");

    override fun toString(): String {
        return type + description
    }
}