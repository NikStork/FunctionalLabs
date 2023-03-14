package Lab_Four_Cycles

// Task ¹1

class DrawingNumbers {
}

fun main() {
    var num = 0
    var count = 0
    while (count < 15) {
        repeat(num) {
            if (count < 15) {
                count++
                print("$num ")
            }
        }
        println()
        num++
    }
}