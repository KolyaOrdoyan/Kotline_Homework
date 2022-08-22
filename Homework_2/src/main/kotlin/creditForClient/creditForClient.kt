package creditForClient

import java.util.*

class Client {
    fun creditForClient() {
        val scanner = Scanner(System.`in`)

        println("Since you are not a client of our bank")
        println("other interest on the loan applies to you")
        println("1. 20% up to 5 million 2. 22% up to 10 million")
        print("Which option will you choose?: ")

        when(scanner.next()){
            "1"->{
                val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

                print("pleas enter a loan amount ut to 5 million: ")
                val x: Int = scanner.nextInt()

                if (x <5000000) {
                    print("pleas enter a term for the loan: ")
                    val d: Int = scanner.nextInt()
                    println()
                    val y: Int = 20

                    val R = x / d + x * y / 365 * 30

                    var message = "total amount to be returned։ $R\n"
                    for (i in 0 until d) {
                        message += """Year: ${calendar[Calendar.YEAR]} months: ${calendar[Calendar.MONTH]} day: ${calendar[Calendar.DAY_OF_MONTH]}
"""
                        calendar.add(Calendar.MONTH, +1)
                    }
                    println(message)
                }else{
                    println("you entered an amount greater then 5 million")
                    print("pleas enter amount up to 5 million")
                    creditForClient()
                }
            }
            "2"->{
                val calendar = GregorianCalendar(2022, Calendar.JULY, Calendar.DAY_OF_MONTH)

                print("pleas enter a loan amount ut to 10 million: ")
                val x: Int = scanner.nextInt()
                if (x <10000000) {
                    print("pleas enter a term for the loan: ")
                    val d: Int = scanner.nextInt()
                    println()
                    val y: Int = 20

                    val R = x / d + x * y / 365 * 30

                    var message = "total amount to be returned։ $R\n"
                    for (i in 0 until d) {
                        message += """Year: ${calendar[Calendar.YEAR]} months: ${calendar[Calendar.MONTH]} day: ${calendar[Calendar.DAY_OF_MONTH]}
"""
                        calendar.add(Calendar.MONTH, +1)
                    }
                    println(message)
                }else{
                    println("you entered an amount greater then 10 million")
                    print("pleas enter amount up to 10 million")
                    creditForClient()
                }
            }
            else->{
                println("pleas enter <<1>> or <<2>>")
                creditForClient()
            }
        }
    }
}