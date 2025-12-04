package org.example.app.lesson_15

fun main() {
    val crucianCarp = CrucianCarp("crucian carp")
    val seagull = Seagull("seagull")
    val duck = Duck("duck")

    crucianCarp.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}

abstract class Creature(
    val name: String,
)

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class CrucianCarp(name: String) : Creature(name), Swimming {
    override fun swim() {
        println("$name swims")
    }
}

class Duck(name: String) : Creature(name), Flying, Swimming {
    override fun fly() {
        println("$name flies")
    }

    override fun swim() {
        println("$name swims")
    }
}

class Seagull(name: String) : Creature(name), Flying {
    override fun fly() {
        println("$name flies")
    }
}