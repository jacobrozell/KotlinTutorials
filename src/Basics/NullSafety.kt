package Basics

fun main() {
    //----------Null Safety----------\\
    //val str66: String = null 			// Cannot do this
    val str5: String? = null 		    // CAN do this

    val string: String? = null
    //println(string!!.length)		    // Double bang (unsafe) operator to force unwrap nullables
    println(string?.length)			    // Safely check if string is not null first using safe call operator

    val str: String? = "Peter"
    str?.length 				// -> '5'

    val newStr: String? = null
    val strLength = newStr?.length ?: -1// Elvis operator (?:) will assign a default value if the condition is null
    println(strLength)				        // -> '-1'
}
