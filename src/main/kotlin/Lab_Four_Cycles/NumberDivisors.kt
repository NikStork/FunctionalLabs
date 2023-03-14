package Lab_Four_Cycles

// Task ¹3

class NumberDivisors {
}

fun main() {
    println("Enter number: ")
    var number: Int = readLine()!!.toInt()

    for (i in 1..number) {
        if (number % i == 0) {
            print(i)
            print(' ')
        }
    }
}