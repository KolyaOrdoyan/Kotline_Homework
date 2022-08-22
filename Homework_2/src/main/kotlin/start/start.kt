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
                val client =Client()
                client.creditForClient()
            }
            "calculate" -> {
                val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

                print("pleas enter a loan amount ut to 10 million: ")
                val x: Int = scanner.nextInt()
                print("pleas enter a term for the loan: ")
                val d: Int = scanner.nextInt()
                print("pleas enter an annual percentage: ")
                val y: Int = scanner.nextInt()
                println()

                val R = x / d + x * y / 365 * 30

                var message = "total amount to be returned։ $R\n"
                for (i in 0 until d) {
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