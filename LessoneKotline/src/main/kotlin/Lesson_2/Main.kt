package Lesson_2

import java.util.*
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val map = hashMapOf<Any,ColorsEnum>()

    for (ColorsEnum in ColorsEnum.values()){
        map[ColorsEnum.code] = ColorsEnum
    }

    val result = map[scanner.nextInt()] ?: "There is no color with that id"
    println(result)

}

enum class ColorsEnum(val code: Any, val colorCode: String) {
    RED(1, "#867585"),
    GREEN(2, "#676767"),
    YELLOW(3,"#010001"),
    PINK(4,"020202")
}
