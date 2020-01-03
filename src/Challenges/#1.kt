package Challenges

var nameSet = false

fun main() {
    while (nameSet == false) {
        println("What is your name?")
        val value = readLine()

        if (value != null) {
            println("Your name is $value!")
            nameSet = true
        }
    }

}