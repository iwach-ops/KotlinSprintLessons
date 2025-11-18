package org.example.app.lesson_9

const val HOW_MANY_SERVINGS_REQUESTS = "How many Servings: "

fun main() {
    val oneServing = listOf(2, 50, 15)

    print(HOW_MANY_SERVINGS_REQUESTS)
    val numberOfServings = readln().toInt()

    val (eggs, milk, butter) = oneServing.map { ingredient ->
        ingredient * numberOfServings
    }

    println(
        """
            For $numberOfServings servings, you will need: 
            Eggs $eggs pieces,
            Milk $milk ml,
            Butter $butter g
            
        """.trimIndent()
    )
}