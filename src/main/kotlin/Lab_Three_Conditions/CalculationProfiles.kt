package Lab_Three_Conditions

// Task #6
class CalculationProfiles {
}

fun main() {
    println("Enter the number of goods for export and import: ")
    println("Profit: ")
    var profit: Int = readLine()!!.toInt()
    println("Losses: ")
    var l: Int = readLine()!!.toInt()

    var saldo: Int = profit - l

    if (saldo > 0) {
        println("Your profit is: ${saldo}")
    }
    else {
        println("Your losses is: ${saldo * (-1)}")
    }
}