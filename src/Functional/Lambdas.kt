package Functional

fun main() {
    val timesTwo: (Int) -> Int = {x: Int -> x*2}

    val add: (Int, Int) -> Int = {x: Int, y: Int -> x + y}


    val list = (1..100).toList()

    print(list.filter({element -> element % 2 == 0 }))  // returns all even #
    println(list.filter { it % 2 == 0 })                // use 'it' to get current item
    println(list.filter { it.even() })                  // uses a function
    println(list.filter(::isEven))                      // uses a function / uses '::' to call a function on 'it'

}

fun isEven(i: Int) = i % 2 == 0

fun Int.even() = this % 2 == 0