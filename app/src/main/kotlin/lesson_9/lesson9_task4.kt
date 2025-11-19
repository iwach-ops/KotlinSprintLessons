package org.example.app.lesson_9

const val NUMBER_OF_INGREDIENTS = 5
const val ALL_INGREDIENTS_REQUEST = "Enter please $NUMBER_OF_INGREDIENTS ingredients separated by commas"
const val NOT_ALL_INGREDIENTS = "Sorry, we need $NUMBER_OF_INGREDIENTS ingredients, our program is terminated"

fun main() {
    println(ALL_INGREDIENTS_REQUEST)
    val inputIngredients = readln()

    val ingredients = inputIngredients.split(", ")

    if (ingredients.size != NUMBER_OF_INGREDIENTS) {
        println(NOT_ALL_INGREDIENTS)
        return
    }

    val sortedIngredients = ingredients.sorted()

    sortedIngredients.forEach { ingredient ->
        println(ingredient)
    }
}