package Lab_Three_Conditions

import kotlin.math.min

//Task #5
class AverageNumber {
}

fun main() {
    println("Enter three numbers separated by a space:")
    val mas: List<String> = readLine()!!.split(" ")
    var masDouble = IntArray(mas.size)

    for (i in mas.indices) {
        masDouble[i] = mas[i].toInt()
    }

    for (j in masDouble.indices) {
        for (k in j + 1 until masDouble.size) {
            if (masDouble[j] == masDouble[k]) {
                println("Error")
                break
            }
            else if (masDouble.min() != masDouble[j] && masDouble.max() != masDouble[j]) {
                println(masDouble[j])
                break
            }
        }
    }
}
