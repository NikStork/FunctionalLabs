package Lab_One_Basic

class WorkingForNumbers_TypeTwo {
}

fun main() {
    println("Enter Name and Age: ")
    var name: String = readLine()!!
    var age: Int = readLine()!!.toInt()

    println("Hi, ${name}! You are already ${age}.")
}