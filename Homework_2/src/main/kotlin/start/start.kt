package start

import bank.Bank
import creditForClient.Client
import main.main
import registerClient.RegisterClient
import userList.ClientEnum
import java.util.*

class Start {
    private val scanner = Scanner(System.`in`)

    fun start() {
        println("Welcome to Bank:")
        print("Pleas enter <<Id>>, <<register>>, <<client>> or <<calculate>> : ")
        var step = scanner.next()

        when (step) {
            "id" -> {
                print("Pleas select your Id: ")
                val result = ClientEnum.getColorById(scanner.nextInt())
                println(result)
                val bank = Bank()
                bank.creditForOurClient()
            }
            "register" -> {
                val registerClient = RegisterClient()
                registerClient.register()
            }
            "creditForClient" -> {
                val client = Client()
                client.creditForClient()
            }
            "calculate" -> {
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
            else -> {
                println("Pleas enter <<Id>> or <<register>>")
                main()
            }
        }
    }

}