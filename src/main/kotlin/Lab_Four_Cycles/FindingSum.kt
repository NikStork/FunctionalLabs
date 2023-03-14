package Lab_Four_Cycles

// Task ¹6

class FindingSum {
}

fun main() {
    var n: Int = 5
    var sum: Int = 0

    while (n < 57) {
        if (n != 34 || n != 46 || n != 52) {
            sum += n
        }

        n++
    }

    println("\nSum numbers: ${sum}")
}