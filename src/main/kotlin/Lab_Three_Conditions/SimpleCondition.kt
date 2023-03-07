package Lab_Three_Conditions

class SimpleCondition {
}

fun main() {
    val age: Int = readLine()!!.toInt()

    if (age > 18) {
        println("Everything is already possible for you.")
    }
    else if (age == 18) {
        println("Hooray, you are 18 years old!")
    }
    else {
        println("You're still too young.")
    }
}