package Lab_Three_Conditions

// Task #6
class CalculatinProfiles {
}

fun main() {
    println("Enter the number of goods for export and import separated by a space: ")

    val mas: List<String> = readLine()!!.split(" ")

    val saldo: Int = mas[0].toInt() - mas[2].toInt()

    println(saldo)
}