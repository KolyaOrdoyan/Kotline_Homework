fun main() {
    println("hello")
    println()

    val a = 32
    println(a)
    val b = 10
    println(b)
    println()

    println("sum of a - b is ${sum(a, b)}")
    println()

    val per = Shape(5.0, 2.0)
    println("the perimeter is ${per.perimeter}")
    println()

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
    println()

    println(describe(1))
    println(describe("hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
    println()

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }
    println()

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    println()

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
    println()

    val text = """
        afdsfsf
        dsfsdfs
        cvxcvxc
        sgfsgd
        dfgdsfgsfg
    """.trimIndent()
    println(text)
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "one"
        "hello" -> "Greeting"
        is Long -> "long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun sum(a: Int, b: Int) = a - b

class Shape(height: Double, var length: Double) : bobo() {
    var perimeter = (height + length) * 2
}

open class bobo {

}