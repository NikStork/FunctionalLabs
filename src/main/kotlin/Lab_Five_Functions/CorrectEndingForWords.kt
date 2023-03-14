package Lab_Five_Functions

// Task #2

class CorrectEndingForWords {
    public fun correctWords(number: Int) {
        if (number == 1 || number % 10 == 1) {
            println("${number} год")
        }
        else if (number % 10 == 0 || number % 10 == 5 || number % 10 == 6 || number % 10 == 7 || number % 10 == 8 || number % 10 == 9) {
            println("${number} лет")
        }
        else {
            println("${number} года")
        }
    }
}

fun main() {
    var obj: CorrectEndingForWords = CorrectEndingForWords()
    println("Enter number: ")
    var number: Int = readLine()!!.toInt()
    obj.correctWords(number)
}