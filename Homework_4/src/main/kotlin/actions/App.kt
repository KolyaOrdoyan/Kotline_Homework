package actions

import banks.ameriaBank.AmeriaBank
import banks.araratBank.AraratBank
import banks.ardshinBank.ArdshinBank
import banks.conversBank.ConversBank
import banks.idBank.IdBank
import banks.inecoBank.InecoBank
import java.util.*

val scanner = Scanner(System.`in`)

class App {
    fun start() {
        println(ActionEnum.TEXT_BACKSTORY_P1)
        println(ActionEnum.TEXT_BACKSTORY_P2)

        when (scanner.next()) {
            "1" -> {
                println(ActionEnum.TEXT_BANK_ARARAT)
                when(scanner.next()){
                    "1"->{
                        val bank = AraratBank()
                        bank.next()
                    }
                    "2"->{
                        val bank = InecoBank()
                        bank.next()
                    }
                }
            }
            "2" -> {
                println(ActionEnum.TEXT_BANK_KOTAYQ)
                when(scanner.next()){
                    "1"->{
                        val bank = AmeriaBank()
                        bank.next()
                    }
                    "2"->{
                        val bank = ConversBank()
                        bank.next()
                    }
                }
            }
            "3" -> {
                println(ActionEnum.TEXT_BANK_SYUNIQ)
                when(scanner.next()){
                    "1"->{
                        val bank = ArdshinBank()
                        bank.next()
                    }
                    "2"->{
                        val bank = IdBank()
                        bank.next()
                    }
                }
            }
            "4" -> {
                println(ActionEnum.TEXT_BANK_EREVAN)
                when(scanner.next()){
                    "1"->{
                        val bank = AraratBank()
                        bank.next()
                    }
                    "2"->{
                        val bank = InecoBank()
                        bank.next()
                    }
                    "3"->{
                        val bank = AmeriaBank()
                        bank.next()
                    }
                    "4"->{
                        val bank = ConversBank()
                        bank.next()
                    }
                    "5"->{
                        val bank = ArdshinBank()
                        bank.next()
                    }
                    "6"->{
                        val bank = IdBank()
                        bank.next()
                    }
                }
            }
            else -> {
                println("pleas enter only this numbers <<1>> <<2>> <<3>> <<4>> ")
            }
        }
    }
}