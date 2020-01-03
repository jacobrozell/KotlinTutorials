package Basics

fun main() {
    //----------Conditionals----------\\
    val num = 17
    if (num < 17) {
        println("i is small")
    } else if (num >= 17 && num <= 25) {
        println("i is okay")
    } else {
        println("it's pretty large")
    }					// -> 'i is small'

    //---------------------------------------

    val j = 17
    val numString = if (j < 17) {
        "small"
    } else if (j >= 17 && j <= 25) {
        "medium"
    } else {
        "large"
    }					// numString = medium
    // the last line serves as a return type
    // if no return type it holds Unit which is the same as Void

    //---------------------------------------
    val strKotlin: String? = "Kotlin"
    if (strKotlin != null) {
        println(strKotlin.length)
    }					// AUTO unwraps str for the entirety of the if-block (no need for '?')


    //------------When Expressions----------\\ --Basically switch statements that are WAY more powerful
    val priceVar = 29
    when (priceVar) {
        0 -> println("For free today")
        in 1..19 -> println("On sale")	// in range x..y (can also do !in range x..y)
        in 20..29 -> println("Normal price")
        10 + 20 -> println("Price is 30")
        else -> println("Overpriced")
    }					// No need to use break statements; AUTO has break statements
    // Will AUTO break after first true expression

    //---------------------------------------
    val priceVar2 = 29
    var stringVar1 = when (priceVar2) {
        0 -> "For free today"
        in 1..19 -> "On sale"
        in 20..29 -> "Normal price"
        else -> "Overpriced"
    }					                // stringVar1 = "Normal price"


    val price = 9
    var stringVar2 = when {
        price == 0 -> "For free today"
        price in 1..19 -> "On sale"
        price in 20..29 -> "Normal price"
        else -> "Overpriced"
    }					                // stringVar2 = "On sale"
}