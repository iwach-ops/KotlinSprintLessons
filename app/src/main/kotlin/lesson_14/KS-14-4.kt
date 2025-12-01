package org.example.app.lesson_14

fun main() {

    val planet = Planet("Mars", true, false)
    val sputnik1 = Sputnik("Phobos", true, false)
    val sputnik2 = Sputnik("Deimos", true, false)

    planet.sputniks.add(sputnik1)
    planet.sputniks.add(sputnik2)

    println(
        """
        ${planet.planetName} has sputniks:
        ${sputnik1.sputnikName}
        ${sputnik2.sputnikName}
        
    """.trimIndent()
    )
}

open class CelestialBodies(
    val haveAtmosphere: Boolean,
    val suitableForLanding: Boolean,

    )

class Planet(
    val planetName: String,
    haveAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val sputniks: MutableList<Sputnik> = mutableListOf(),
) : CelestialBodies(haveAtmosphere, suitableForLanding)

class Sputnik(
    val sputnikName: String,
    haveAtmosphere: Boolean,
    suitableForLanding: Boolean,
) : CelestialBodies(haveAtmosphere, suitableForLanding)