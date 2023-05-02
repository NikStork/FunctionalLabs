package Lab_Six_ArraysOfData

class Six_ArithmeticMean {
}

fun main() {
    println("Enter three numbers separated by a space:")
    val mas: List<String> = readLine()!!.split(" ")
    var masDouble = IntArray(mas.size)

    for (i in mas.indices) {
        masDouble[i] = mas[i].toInt()
    }

    var sum: Int = 0

    for (i in masDouble) {
        sum += i
    }

    var arithmeticMean: Int = sum / masDouble.size

    println("Arithmetic mean number: ${arithmeticMean}")
    for (i in masDouble) {
        if (i > arithmeticMean) {
            print(i)
            print(" ")
        }
    }
}