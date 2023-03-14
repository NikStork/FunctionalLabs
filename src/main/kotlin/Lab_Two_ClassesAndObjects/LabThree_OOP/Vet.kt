package Lab_Two_ClassesAndObjects.LabThree_OOP

import java.util.Arrays

class Vet {
    fun treatAnimal(animal: Animal) {
        println("\nAnimal: ${animal.typeAnimal}\nfood: ${animal.food}\nlocation: ${animal.location}")
    }
}

fun main() {
    var pets: List<Animal> = listOf(Dog(), Cat(), Horse())
    var vet: Vet = Vet()

    for (i in pets) {
        vet.treatAnimal(i)
    }
}