package Basics

fun main() {
    //----------For-Loop----------\\

    for (i in 1..10) {
        println("$i")	// $i is a reference to a value
    }

    for (c in "Kotlin") {
        println("$c ")
    }					// -> "K o t l i n"

    val l = listOf("A", "B", "C")
    for (c in l) {
        println("$c ")
    }					// -> "A B C"

    for (i in 10 downTo 1) {
        println("$i ")
    }					// -> "10 9 8 7 6 5 4 3 2 1"

    for (i in 10 downTo 1 step 2) {
        println("$i ")
    }					// -> "10 8 6 4 2"


    //----------While-Loop----------\\
    var i = 1

    while (i <= 10) {
        print("$i ")
        i++
    }

    do {
        print("$i ")
        i++
    } while (i <= 10)
}