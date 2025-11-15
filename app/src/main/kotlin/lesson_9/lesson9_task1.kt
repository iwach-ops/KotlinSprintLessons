package org.example.app.lesson_9

const val RECIPE_INGREDIENTS_RES = "The recipe contains the following ingredients: "

fun main() {
    val pizzaIngredientsList = listOf("tomato", "mozzarella", "salt", "pepper")
    println("$RECIPE_INGREDIENTS_RES ${pizzaIngredientsList.joinToString()}")

    pizzaIngredientsList.forEach { ingredient ->
        println(ingredient)
    }
}