package Lab_Three_Conditions

class MiniCalculator {
}

fun main() {
    while (true) {
        println("Enter numbers and operation: ")
        val numberOne: Int = readLine()!!.toInt()
        val numberTwo: Int = readLine()!!.toInt()

        println("You have numbers ${numberOne} and ${numberTwo}\n1. Add\n2. Subtract\n3. None")

        val choice: String = readLine()!!

        when(choice) {
            "2" -> println("Result: ${numberOne - numberTwo}")
            "0" -> break
        }
    }
}