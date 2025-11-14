package org.example.app.lesson_8

const val INGREDIENTS_REQUEST = "Which ingredients would you like to find?: "
const val INGREDIENT_NOT_FOUND_RESPONSE = "There is no such ingredient in the recipe."

fun main() {
    val sushiRecipesArray = arrayOf("rice", "Nori", "Salmon", "Cucumber", "Soy", "Wasabi")

    print(INGREDIENTS_REQUEST)
    val inputIngredient = readln()

    for (ingredient in sushiRecipesArray) {
        if (ingredient.equals(inputIngredient, ignoreCase = true)) {
            println("The ingredient $inputIngredient is in the recipe")
            return
        }
    }

    println(INGREDIENT_NOT_FOUND_RESPONSE)
}