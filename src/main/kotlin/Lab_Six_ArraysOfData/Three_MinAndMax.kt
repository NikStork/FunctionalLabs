package Lab_Six_ArraysOfData

class Three_MinAndMax {
}

fun main() {
    println("Enter three numbers separated by a space:")
    val mas: List<String> = readLine()!!.split(" ")
    var masDouble = IntArray(mas.size)

    for (i in mas.indices) {
        masDouble[i] = mas[i].toInt()
    }

    println("Min and Max elements:\nMin element: ${masDouble.min()}\n Max element: ${masDouble.max()}")
}