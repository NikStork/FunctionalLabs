package Lab_One_Basic

class WorkingForNumbers_TypeTwo {
}

fun main() {
    println("Enter Name and Age: ")
    val name: String = readLine()!!
    val age: Int = readLine()!!.toInt()

    println("Hi, ${name}! You are already ${age}.")
}