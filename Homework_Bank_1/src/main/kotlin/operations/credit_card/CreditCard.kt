package operations.credit_card

import java.time.LocalDate
import java.util.*
import kotlin.random.Random

private var cardId = 1
val scanner = Scanner(System.`in`)
private var cvv: Int = 0
var cardAccountNumber: String = ""

class CreditCard() {
    fun creditCardGeneration() {
        println("Pleas select which credit card do you want: ")
        println(
            """1. VISA_CLASSIC, 2. MASTERCARD_STANDARD, 3. VISA_GOLD 
        4. MASTERCARD_GOLD, 5. VISA_PLATINUM, 6. MASTERCARD_PLATINUM, 7. VISA_INFINITE
    """
        )

        when (scanner.next()) {
            "1" -> {
                println(CreditCardEnum.VISA_CLASSIC)
                println(toString())
            }

            "2" -> {
                println(CreditCardEnum.MASTERCARD_STANDARD)
                println(toString())
            }

            "3" -> {
                println(CreditCardEnum.VISA_GOLD)
                println(toString())
            }

            "4" -> {
                println(CreditCardEnum.MASTERCARD_GOLD)
                println(toString())
            }

            "5" -> {
                println(CreditCardEnum.VISA_PLATINUM)
                println(toString())
            }

            "6" -> {
                println(CreditCardEnum.MASTERCARD_PLATINUM)
                println(toString())
            }

            "7" -> {
                println(CreditCardEnum.VISA_INFINITE)
                println(toString())
            }

            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> <<5>> <<6>> <<7>>")
            }
        }
    }

    private fun generateValidDate(year: Int = 5): LocalDate {
        return LocalDate.now().plusMonths(((year * 12).toLong()))
    }

    private fun generateCVV(): Int {
        var multiplier = 1
        for (i in 1..3) {
            cvv += multiplier * Random.nextInt(from = 0, until = 9)
            multiplier *= 10
        }
        return cvv
    }

    private fun generateCardAccountNumber(): String {
        for (i in 0 until 16) {
            if (i % 4 == 0 && i != 0) cardAccountNumber += " "
            cardAccountNumber += (Random.nextInt(from = 0, until = 9)).toString()
        }
        return cardAccountNumber
    }

    override fun toString(): String {
        return "CreditCard(cardId= $cardId,validDate= ${generateValidDate()}, " +
                "cardAccountNumber= ${generateCardAccountNumber()}, cvv= ${generateCVV()})"
    }
}