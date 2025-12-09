package org.example.app.lesson_18

fun main() {
    val animals = listOf<Animal>(Fox(), Dog(), Cat())

    animals.forEach { it -> it.eat() }
}

abstract class Animal(
    val name: String,
) {
    abstract var food: String

    abstract fun eat()
}

class Fox : Animal("fox") {
    override var food: String = "berries"

    override fun eat() {
        println("$name -> eats $food")
    }
}

class Cat : Animal("cat") {
    override var food: String = "fish"

    override fun eat() {
        println("$name -> eats $food")
    }
}

class Dog : Animal("dog") {
    override var food: String = "bones"

    override fun eat() {
        println("$name -> eats $food")
    }
}