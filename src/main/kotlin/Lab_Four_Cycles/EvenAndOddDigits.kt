package Lab_Four_Cycles

// Task ¹4

class EvenAndOddDigits {
}

fun main() {
    println("Enter number: ")
    val number: Int = readLine()!!.toInt()
    var even: Int = 0
    var odd: Int = 0

    for (i in 1..number) {
        if (i % 2 == 0) {
            even++
        }
        else {
            odd++
        }
    }

    println("Input number: ${number}")
    println("number of even numbers: ${even}")
    println("number of odd numbers: ${odd}")
}