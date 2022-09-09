package models.creditCard

import actions.ActionEnum
import banks.centralBank.CentralBank
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
        println(ActionEnum.TEXT_BANK_CREDIT_CARDS_TYPE)

        when (scanner.next()) {
            "1" -> {
                println(CreditCardEnum.VISA_CLASSIC)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "2" -> {
                println(CreditCardEnum.MASTERCARD_STANDARD)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "3" -> {
                println(CreditCardEnum.VISA_GOLD)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "4" -> {
                println(CreditCardEnum.MASTERCARD_GOLD)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "5" -> {
                println(CreditCardEnum.VISA_PLATINUM)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "6" -> {
                println(CreditCardEnum.MASTERCARD_PLATINUM)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
            }
            "7" -> {
                println(CreditCardEnum.VISA_INFINITE)
                val insertId = CentralBank()
                insertId.insertId()
                println(insertId.toString())
                val creditCard = CreditCard()
                println(creditCard.toString())
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
