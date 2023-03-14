package Lab_Four_Cycles

// Task ¹5

class SumOfNumbers {
}

fun main() {
    var sum: Int = 0

    for (i in 1..100) {
        if (i % 4 == 0) {
            sum += i
        }
    }

    println("\nSum of multiples of four: ${sum}")
}

