package Lab_Two_ClassesAndObjects.LabThree_OOP

abstract class Animal {
    public var food: String = "Undefined"
    public var location: String = "Undefined"
    public var typeAnimal: String = "Undefined"

    open fun makeNoise() {
        println("such an animal makes sounds")
    }

    open fun eat() {
        println("such an animal is eating")
    }

    open fun sleep() {
        println("such an animal is sleeping")
    }
}