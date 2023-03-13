package Lab_One_Basic

// Task №3

class DecisionNumberForSymbols {
}

fun main() {
    println("Enter number: ")
    var number: Int = readLine()!!.toInt()
    var numberForElements: Int = 0;

    for (i in number.toString()) {
        print(i + " ")
    }
}