package Lab_Five_Functions

class RoundingNumbers {
    public fun round(number: Int) {
        if (number >= 1000 && number < 10000) {
            println("We get: ${number / 1000}K")
        }
        else {
            println("We get: ${number}")
        }
    }
}

fun main() {
    var obj: RoundingNumbers = RoundingNumbers()
    println("Enter number: ")
    var number: Int = readLine()!!.toInt()
    obj.round(number)
}