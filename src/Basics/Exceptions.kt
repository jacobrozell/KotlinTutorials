package Basics

import java.io.IOException

fun main() {
    // Java Way
    var input: String? = null
    try {
        input = getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        println("Finally...")
    }
    println(input)

    // Kotlin Way
    val input2 = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        "" // or NULL if you want it nullable
    } finally {
        println("finally...")
    }

    // Kotlin doesn't have checked exceptions
}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}