package Lab_Two_ClassesAndObjects.LabThree_OOP

class Horse: Animal() {
    public var speed: Int = 21
    public var endurance: String = "very hardy"

    init {
        food = "oats"
        location = "stable"
        typeAnimal = "Horse"
    }

    override fun makeNoise() {
        println("horse neighs")
    }

    override fun eat() {
        println("horse eat")
    }

    override fun sleep() {
        println("horse sleep")
    }
}