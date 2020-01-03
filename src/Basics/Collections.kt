package Basics

fun main() {
    //----------Collections----------\\
    //--Array--\\
    val array1 = arrayOf(1,2,3,4)
    array1.joinToString()			// -> "1, 2, 3, 4"

    val array2 = intArrayOf(2,3,4)  	// doubleArrayOf(), booleanArrayOf()

    //--Lists--\\
    var list = listOf(1,2,3,4,5,6)
    val mutableList = mutableListOf(1,2,3,4,5,6)

    // list[0] = 2				        // error
    mutableList[0] = 2			        // list = 2,2,3,4,5,6

    //--Sets--\\
    var set = setOf(1,2,3,4)
    val mutableSet = mutableSetOf(1,2,2,3,4)// mutableSet = 1,2,3,4 (no duplicates in sets)

    mutableSet.add(7)			            // mutableSet = 1,2,3,4,7
    mutableSet.remove(2)			// mutableSet = 1,3,4,7

    //--Map--\\
    val map = mapOf(Pair(1, "Kotlin"), Pair(2, "Android"))
    map					// {1: "Kotlin", 2: "Android"}

    val mutableMap = mutableMapOf(1 to "Kotlin", 2 to "Android") // 'to' is a In-fix function ('to(1, "Kotlin")')
    mutableMap				        // {1: "Kotlin", 2: "Android"}
    mutableMap[0] = "Swift"			// {0: "Swift", 1: "Kotlin", 2: "Android"}
}