package Lab_Two_ClassesAndObjects.LabThree_OOP

class Cat: Animal() {
    public var dexterity: Int = 21
    public var degreeOfLaziness: String = "Very laziness"

    init {
        food = "cat food"
        location = "apartment"
        typeAnimal = "Cat"
    }

    override fun makeNoise() {
        println("cat meows")
    }

    override fun eat() {
        println("cat eat")
    }

    override fun sleep() {
        println("cat sleep")
    }
}