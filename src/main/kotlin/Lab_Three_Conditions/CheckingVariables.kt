package Lab_Three_Conditions

// Task #7

class CheckingVariables {
}

fun main() {
    println("Enter numbers: ")

    val mas: List<String> = readLine()!!.split(" ")

    for(i in mas) {
        if (i.toInt() % 2 == 0) {
            println(i)
        }
    }
}