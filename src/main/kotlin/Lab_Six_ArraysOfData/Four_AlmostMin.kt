package Lab_Six_ArraysOfData

class Four_AlmostMin {
}

fun main() {
    println("Enter three numbers separated by a space:")
    val mas: List<String> = readLine()!!.split(" ")
    var masDouble = IntArray(mas.size)

    for (i in mas.indices) {
        masDouble[i] = mas[i].toInt()
    }

    var min: Int = masDouble.min()

    var almostMin: Int = masDouble.filter { i -> i != min }.min()

    println("Second smallest element in the array is: ${almostMin}")
}