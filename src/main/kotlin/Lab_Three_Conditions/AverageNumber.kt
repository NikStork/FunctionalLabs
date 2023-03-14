package Lab_Three_Conditions

import kotlin.math.min

//Task #5
class AverageNumber {
}

fun main() {
    println("Enter three numbers separated by a space:")

    val mas: List<String> = readLine()!!.split(" ")

    for(i in mas) {
        if (mas.min() != i && mas.max() != i) {
            println(i)
        }
        else if (mas.min() == i && mas.max() == i) {
            println("Error")
        }
        else {
            println("Try again.")
        }
    }
}