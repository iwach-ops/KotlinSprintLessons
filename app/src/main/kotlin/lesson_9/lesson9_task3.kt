package org.example.app.lesson_9

const val HOW_MANY_SERVINGS_REQUESTS = "How many Servings: "

fun main() {

    val oneServing = mutableListOf(2, 50, 15)

    print(HOW_MANY_SERVINGS_REQUESTS)
    val numberOfServings = readln().toInt()
    val numberOfEggs = numberOfServings * oneServing[0]
    val numberOfMilk = numberOfServings * oneServing[1]
    val numberOfButter = numberOfServings * oneServing[2]

    println(
        """
            For $numberOfServings servings, you will need: 
            Eggs $numberOfEggs,
            Milk $numberOfMilk,
            Butter $numberOfButter
            
        """.trimIndent()
    )
}