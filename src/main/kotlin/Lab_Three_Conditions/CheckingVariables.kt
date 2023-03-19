package Lab_Three_Conditions

// Task #7

class CheckingVariables {
}

fun main() {
    println("Enter numbers: ")
    var a: Int = readLine()!!.toInt()
    var b: Int = readLine()!!.toInt()

    if (a % 2 == 0 && b % 2 == 0) {
        println("true")
    }
    else {
        println("false")
    }
}