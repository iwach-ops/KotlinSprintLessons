package org.example.app.lesson_9

const val INGREDIENTS_RESPONSE = "The recipe contains the following base ingredients"
const val APPROVE_ADD_NEW_INGREDIENT_REQUEST = "Would you like to add more? y/n: "
const val ENTER_NEW_INGREDIENT = "Which ingredient do you want to add?: "
const val PROGRAM_TERMINATED_RESPONSE = "Program is terminated!"
const val NOW_FOLLOWING_INGREDIENTS_RESPONSE = "The recipe now contains the following ingredients"

fun main() {
    val pizzaIngredients = mutableListOf("tomato", "salt", "pepper")

    println("$INGREDIENTS_RESPONSE ${pizzaIngredients.joinToString()}")

    print(APPROVE_ADD_NEW_INGREDIENT_REQUEST)
    val input = readln()

    if (input.equals("y", true)) {
        print(ENTER_NEW_INGREDIENT)
        pizzaIngredients.add(readln())
        println("$NOW_FOLLOWING_INGREDIENTS_RESPONSE: ${pizzaIngredients.joinToString()}")
    } else println(PROGRAM_TERMINATED_RESPONSE)
}