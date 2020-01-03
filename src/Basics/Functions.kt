package Basics

fun main() {
    val together = concat(listOf("Kotlin", "Java", "Scala"), separator = " : ")
    println("$together")
}

fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)

fun printName(name: String) {
    print("$name")
}

fun returnAge(age: Int): Int {
    return age
}

fun printAllAges(vararg ages: Int) {
    for (age in ages) {
        println("$age ")
    }
}					// vararg will take an undefined number of arguments; stores them in an array

fun permitEntrance(vararg ages: Int): Boolean {
    return ages.any { age -> age >= 18 }
}					// Looks for any of the ages that meet the condition


val x = permitEntrance(19)		// x = true