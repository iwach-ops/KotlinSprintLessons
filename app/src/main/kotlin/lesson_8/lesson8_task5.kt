package org.example.app.lesson_8

const val HOW_MANY_REQUEST = "How many ingredients do you want to have?: "
const val INPUT_INGREDIENT_REQUEST = "Enter please your ingredient: "

fun main() {
    print(HOW_MANY_REQUEST)
    val numberOfIngredients = readln().toInt()

    val ingredientsArray = arrayOfNulls<String>(numberOfIngredients)

    for (index in 0..<numberOfIngredients) {
        print(INPUT_INGREDIENT_REQUEST)
        val inputIngredient = readln()

        ingredientsArray[index] = inputIngredient
    }

    println(ingredientsArray.joinToString(", "))
}