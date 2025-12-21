package org.example.app.lesson_22

import java.time.LocalDateTime

fun main() {
    val alpha = GalacticGuide(
        "Alpha Centauri",
        "Alpha Centauri is the closest star system to our Solar System. It consists of three stars: Alpha Centauri A and Alpha Centauri B (which form a binary system) and Proxima Centauri, a small red dwarf. Proxima Centauri is the nearest individual star to the Sun and is known to have at least one planet in its habitable zone",
        LocalDateTime.now(),
        4.37
    )

    val name = alpha.component1()
    val description = alpha.component2()
    val dateTime = alpha.component3()
    val distanceFromEarth = alpha.component4()

    println(
        """
        $name
        $description
        $dateTime
        $distanceFromEarth        
    """.trimIndent()
    )
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceFromEarth: Double,
)