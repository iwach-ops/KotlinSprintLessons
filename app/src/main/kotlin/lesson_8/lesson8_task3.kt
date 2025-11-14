package org.example.app.lesson_8

const val INGREDIENTS_REQUEST = "Which ingredients would you like to find?: "
const val INGREDIENT_NOT_FOUND_RESPONSE = "There is no such ingredient in the recipe."

fun main() {
    val sushiRecipesArray = arrayOf("rice", "nori", "salmon", "cucumber", "soy", "wasabi")

    print(INGREDIENTS_REQUEST)
    val inputIngredient = readln()

    if (sushiRecipesArray.contains(inputIngredient)) println("The ingredient $inputIngredient is in the recipe")
    else println(INGREDIENT_NOT_FOUND_RESPONSE)
}