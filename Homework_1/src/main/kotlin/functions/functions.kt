package functions

import kotlin.math.absoluteValue

class Operations() {

    fun max(list: List<Int>) {
        val max: Int = list.max()
        println(max)
    }

    fun min(list: List<Int>) {
        val min: Int = list.min()
        println(min)
    }

    fun showList(list: List<Int>) {
        println(list)
    }

    fun minimize(list: List<Int>) {
        println(list.sortedDescending())
    }

    fun maximize(list: List<Int>) {
        println(list.sorted())
    }

    fun showAddNumber(list: List<Int>, number: Int) {
        for (n in list) {
            if (n == number) {
                println(n)
                break
            }
        }
    }

    fun duplicate(list: List<Int>, number: Int) {
        var count = 0

        for (n in list) {
            if (n == number) count += 1
        }
        println(count)
    }

}

