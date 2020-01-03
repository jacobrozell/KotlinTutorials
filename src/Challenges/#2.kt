package Challenges
import kotlin.random.Random

val list = mutableListOf<Int>()

fun main() {

    for (i in 0..100) {
        list.add(Random.nextInt(100) + 1)
    }

    for (i in list) {
        val value = i.takeIf { i <= 10 }
        if (value != null) {
            println("Value Taken! Value is $value")
        }
    }
}