package bank

import java.util.*

class Bank {
    fun creditForOurClient() {
        val scanner = Scanner(System.`in`)

        println("We offer loans to our clients. Here are the percentages for the year: ")
        println("1. 15% up to 5 million 2. 20% up to 10 million")
        print("Which option will you choose?: ")

        when (scanner.next()) {
            "1" -> {
                val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

                print("pleas enter a loan amount ut to 5 million: ")
                val amount: Int = scanner.nextInt()

                if (amount < 5000000) {
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


                    var message = "total amount to be returned։ $finalCount\n"
                    for (i in 0 until percent) {
                        message += """Year: ${calendar[Calendar.YEAR]} months: ${calendar[Calendar.MONTH]} day: ${calendar[Calendar.DAY_OF_MONTH]}
"""
                        calendar.add(Calendar.MONTH, +1)
                    }
                    println(message)
                } else {
                    println("you entered an amount greater then 5 million")
                    print("pleas enter amount up to 5 million")
                    creditForOurClient()
                }
            }

            "2" -> {
                val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

                print("pleas enter a loan amount ut to 10 million: ")
                val amount: Int = scanner.nextInt()

                if (amount < 10000000) {
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

                    var message = "total amount to be returned։ $finalCount\n"
                    for (i in 0 until percent) {
                        message += """Year: ${calendar[Calendar.YEAR]} months: ${calendar[Calendar.MONTH]} day: ${calendar[Calendar.DAY_OF_MONTH]}
"""
                        calendar.add(Calendar.MONTH, +1)
                    }
                    println(message)
                } else {
                    println("you entered an amount greater then 5 million")
                    print("pleas enter amount up to 5 million")
                    creditForOurClient()
                }
            }
            else -> {
                println("pleas enter <<1>> or <<2>>")
                creditForOurClient()
            }
        }
    }
}