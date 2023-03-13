package Lab_One_Basic

// Task №4

class WorkingForNumbers {
}

fun main() {
    println("Enter amount of days: ")
    val num: Int = readLine()!!.toInt()
    var years: Int = num / 365
    var daysOfTheWeek: Int = num % 365
    var weeks: Int = daysOfTheWeek / 7
    var days: Int = daysOfTheWeek % 7

    println("Years: ${years}, weeks: ${weeks}, days: ${days}.")

}