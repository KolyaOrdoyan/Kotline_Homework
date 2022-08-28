package actions

import models.bank.Bank

enum class ActionEnum(private val text: String) {
    WELCOME("Hello, Ineco bank welcomes you."),
    CHOOSE_BRANCH("Please choose which branch you want to be served at"),
    CHOOSE_SERVICES("pleas enter one is ");

    override fun toString(): String {
        return "$text"
    }
}