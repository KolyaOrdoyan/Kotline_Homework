package bank.all_banks

import operations.Operations
import java.util.Scanner

class AllBanks {
    private val scanner = Scanner(System.`in`)

    fun start() {
        println("Pleas choose Which bank do you want: ")
        println(
            """     1. Ararat Bank 2. Ineco Bank 3. Ameria Bank 
     4. Convers Bank 5. Ardshin Bank 6. IdBank"""
        )

        when(scanner.next()){
            "1","2","3","4","5","6"->{
                val operations = Operations()
                operations.operations()
            }
            else->{
                println("Pleas select one of these banks: ")
                start()
            }
        }
    }
}