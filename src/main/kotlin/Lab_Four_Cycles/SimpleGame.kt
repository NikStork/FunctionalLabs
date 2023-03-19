package Lab_Four_Cycles

import kotlin.random.Random

// Task ¹2

class SimpleGame {
}

fun main() {
    val randNumber: Int = Random.nextInt(1, 9)

    while (true) {
        println("Enter number: ")
        var number: Int = readLine()!!.toInt()

        if (number == randNumber) {
            println("\nNice! You win, your number matched!")
            break
        }
        else {
            println("Try again.")
        }
    }
}