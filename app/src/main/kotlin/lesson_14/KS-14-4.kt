package org.example.app.lesson_14

fun main() {
    val sputnik1 = Sputnik("Phobos", true, false)
    val sputnik2 = Sputnik("Deimos", true, false)

    val sputniks = listOf(sputnik1, sputnik2)

    val planet = Planet("Mars", true, false, sputniks)

    println("${planet.name} has sputniks:")
    planet.sputniks.forEach { sputnik ->
        println(sputnik.name)
    }
}

open class CelestialBodies(
    val haveAtmosphere: Boolean,
    val suitableForLanding: Boolean,
)

class Planet(
    val name: String,
    haveAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val sputniks: List<Sputnik>,
) : CelestialBodies(haveAtmosphere, suitableForLanding)

class Sputnik(
    val name: String,
    haveAtmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBodies(haveAtmosphere, suitableForLanding)