package org.example.app.lesson_8

const val REPLACE_REQUEST = "Which ingredient do you want to replace?: "
const val NEW_INGREDIENT_REQUEST = "Which ingredient do you want to add?: "
const val REPLACED_INGREDIENT_NT_FOUND_RESPONSE = "The ingredient is not in the list"
const val DONE_RESPONSE = "Done! You have saved the following list: "

fun main() {
    val pizzaIngredients = arrayOf("dough", "tomato", "mozzarella", "oil", "basil")

    println(pizzaIngredients.joinToString())

    print(REPLACE_REQUEST)
    val replaceIngredient = readln()
    val replacedIngredientIndex = pizzaIngredients.indexOf(replaceIngredient)

    if (replacedIngredientIndex >= 0) {
        print(NEW_INGREDIENT_REQUEST)
        val newInsteadOfReplacedOne = readln()
        pizzaIngredients[replacedIngredientIndex] = newInsteadOfReplacedOne
    } else {
        println(REPLACED_INGREDIENT_NT_FOUND_RESPONSE)
        return
    }

    println("$DONE_RESPONSE ${pizzaIngredients.joinToString()}")
}