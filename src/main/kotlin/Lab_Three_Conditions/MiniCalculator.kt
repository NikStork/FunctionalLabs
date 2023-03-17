package Lab_Three_Conditions

// Task #3

class MiniCalculator {
}

fun main() {
    println("Enter numbers: ")
    val mas: List<String> = readLine()!!.split(" ")

    print("You have numbers: ")
    for (i in mas) {
        print(i + " ")
    }
    println("\n1. Sum\n2. Subtract\n3. None\n")
    val choice: Int = readLine()!!.toInt()

    when(choice) {
        1 -> {
            for (i in mas) {
                println("Result: ${mas[0].toInt() + i.toInt()}")
                break
            }
        }
        2 -> {
            for (i in mas) {
                println("Result: ${mas[0].toInt() - i.toInt()}")
                break
            }
        }
    }
}