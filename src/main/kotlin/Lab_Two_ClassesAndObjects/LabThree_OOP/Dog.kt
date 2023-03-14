package Lab_Two_ClassesAndObjects.LabThree_OOP

class Dog: Animal() {
    var knowsTheNumberOfCommand: Int = 5
    var wool: String = "smooth-haired"

    init {
        food = "meat"
        location = "doghouse"
        typeAnimal = "Dog"
    }

    override fun makeNoise() {
        println("dog barking")
    }

    override fun eat() {
        println("dog eat")
    }

    override fun sleep() {
        println("dog sleep")
    }
}