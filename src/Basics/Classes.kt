package Basics

import kotlin.math.*

class Side(val length: Double)

class Shape(val sides: List<Side>, val name: String) {

    var perimeter: Double = 0.0
    var area: Double = 0.0

    init {
        findPerimeter()
        findArea()
    }

    fun findArea() {
        when {
            this.sides.count() == 4 -> this.area = sides[0].length.pow(2)
            this.sides.count() == 3 -> {
                // Apply Hero's Formula
                val p = perimeter / 2
                this.area =
                    sqrt((p) * ((p - sides[0].length) * (p - sides[1].length) * (p - sides[2].length)))
            }
        }
    }

    fun findPerimeter() {
        for (side in sides) {
            perimeter += side.length
        }
    }
}

fun main() {
    val square = Shape(listOf(Side(10.0),Side(10.0), Side(10.0), Side(10.0)), "Square")
    println(square.area)

    val triangle = Shape(listOf(Side(10.0), Side(10.0), Side(10.0)),"Triangle")
    println(triangle.area)
}