package Lab_Six_ArraysOfData

class Two_CreatingAndOutputtingArray {
}

fun main() {
    var array: Array<Int> = arrayOf()

    array = arrayOf(8, 21, 5, 90, 11, 0)

    array[0] = 90

    println(array[4])

    var newArray: Array<Int> = arrayOf()

    for (i in array) {
        if (i != array[4]) {
            newArray += i
        }
    }

    newArray += -35

    println(newArray.contentToString())
}