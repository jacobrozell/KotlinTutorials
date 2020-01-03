package Functional

fun main() {

    // map
    val list = (1..100).toList()
    val doubled = list.map { it * 2 }

    println("$doubled")

    val average = list.average()
    val shifted = list.map { it - average }

    println(shifted)

    // flat map
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    val notFlat = nestedList.map { it.sortedDescending() }//.flatten() -> Does same thing as flatMap
    val flat = nestedList.flatMap { it.sortedDescending() }
    println(notFlat)
    println(flat)
}