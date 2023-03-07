package Lab_Three_Conditions

import kotlin.math.min

class AverageNumber {
}

fun main() {
    println("Enter three numbers:")

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