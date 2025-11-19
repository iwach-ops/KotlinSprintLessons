package org.example.app.lesson_9

const val MAX_NUMBER_OF_INGREDIENTS = 5
const val INPUT_INGREDIENT = "Enter please an ingredient: "

fun main() {
    val ingredients = mutableSetOf<String>()

    for (i in 1..MAX_NUMBER_OF_INGREDIENTS) {
        print(INPUT_INGREDIENT)
        ingredients.add(readln())
    }

    val sortedIngredients = ingredients.sorted().joinToString(",").replaceFirstChar { it.uppercase() }

    println(sortedIngredients)
}