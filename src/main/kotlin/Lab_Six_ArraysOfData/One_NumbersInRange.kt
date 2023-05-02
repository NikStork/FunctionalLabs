package Lab_Six_ArraysOfData

class One_NumbersInRange {
}

fun main() {
    println("Enter numbers: ")
    var num_one: Int = readLine()!!.toInt()
    var num_two: Int = readLine()!!.toInt()

    if (num_one > num_two) {
        val rangeArray = IntRange(num_two, num_one).toList().toIntArray()
        println(rangeArray.contentToString())
    }
    else if (num_one < num_two) {
        val rangeArray = IntRange(num_one, num_two).toList().toIntArray()
        println(rangeArray.contentToString())
    }
    else {
        val array: List<Int> = arrayListOf(num_one)
        println(array)
    }
}