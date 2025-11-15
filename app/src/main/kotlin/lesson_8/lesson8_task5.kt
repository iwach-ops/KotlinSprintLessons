package org.example.app.lesson_8

const val HOW_MANY_REQUEST = "How many ingredients do you want to have?: "
const val INPUT_INGREDIENT_REQUEST = "Enter please your ingredient: "

fun main() {
    print(HOW_MANY_REQUEST)
    val numberOfIngredients = readln().toInt()

    val ingredientsArray = Array(numberOfIngredients) { "" }

    for (index in ingredientsArray.indices) {
        print(INPUT_INGREDIENT_REQUEST)
        ingredientsArray[index] = readln()
    }

    println(ingredientsArray.joinToString(", "))
}