package Lab_Six_ArraysOfData

class Five_ArraysSort {
    fun shellSort(s: IntArray): IntArray {
        var n = s.size / 2
        while (n >= 1) {
            for (j in n..(s.size - 1)) {
                val temp = s[j]
                var k = j - n
                while (k > 0 && s[k] > temp) {
                    s[k + n] = s[k]
                    k -= n
                }
                s[k + n] = temp
            }
            n /= 2
        }
        return s
    }
}

fun main() {
    println("Enter three numbers separated by a space:")
    val mas: List<String> = readLine()!!.split(" ")
    var masDouble = IntArray(mas.size)

    for (i in mas.indices) {
        masDouble[i] = mas[i].toInt()
    }

    var obj: Five_ArraysSort = Five_ArraysSort()

    obj.shellSort(masDouble)

    println(masDouble.contentToString())
}