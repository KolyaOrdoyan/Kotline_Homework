package models.loan

import java.util.*

class Loan{
    val scanner = Scanner(System.`in`)

    fun loanForCustomer() {
        val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

        print("pleas enter a loan amount: ")
        val amount: Int = scanner.nextInt()
        print("pleas enter a term for the loan: ")
        val mount: Int = scanner.nextInt()
        print("pleas enter an annual percentage: ")
        val percent: Int = scanner.nextInt()
        println()

        val finalCount = amount / mount + amount * percent / 365 * 30

        val monthlyFee = finalCount / mount
        val count = amount / mount
        val interestCharge = monthlyFee - count
        val principalAmount = count - interestCharge

        println("monthly loan payment: $monthlyFee of which the principal is: $principalAmount percent: $interestCharge")

        println("your loan amount: $amount")
        println("the duration of the loan is: $mount mount")
        var message = "total amount to be returned։ $finalCount\n"
        for (i in 0 until mount) {
            message += """Year: ${calendar[Calendar.YEAR]} months: ${calendar[Calendar.MONTH]} day: ${calendar[Calendar.DAY_OF_MONTH]}
"""
            calendar.add(Calendar.MONTH, +1)
        }
        println(message)
    }
}