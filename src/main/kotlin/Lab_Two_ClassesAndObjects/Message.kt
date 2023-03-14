package Lab_Two_ClassesAndObjects

class Message(_name: String) {
    val name: String

    init {
        name = _name
    }

    public fun introduce() {
        println("Hi, my name is ${name}.")
    }
}

fun main() {
    var obj: Message = Message("Nikita")
    obj.introduce()
}