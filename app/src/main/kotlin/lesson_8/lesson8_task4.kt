package org.example.app.lesson_8

const val REPLACE_REQUEST = "Which ingredient do you want to replace?: "
const val NEW_INGREDIENT_REQUEST = "Which ingredient do you want to add?: "
const val REPLACED_INGREDIENT_NT_FOUND_RESPONSE = "The ingredient is not in the list"
const val DONE_RESPONSE = "Done! You have saved the following list: "

fun main() {
    val pizzaIngredientsArray = arrayOf("dough", "tomato", "mozzarella", "oil", "basil")

    println(pizzaIngredientsArray.contentToString())

    print(REPLACE_REQUEST)
    val replaceIngredient = readln()

    if (pizzaIngredientsArray.contains(replaceIngredient)) {
        print(NEW_INGREDIENT_REQUEST)
        val newInsteadOfReplacedOne = readln()

        val replacedIngredientIndex = pizzaIngredientsArray.indexOf(replaceIngredient)
        pizzaIngredientsArray[replacedIngredientIndex] = newInsteadOfReplacedOne

    } else {
        println(REPLACED_INGREDIENT_NT_FOUND_RESPONSE)
        return
    }

    println("$DONE_RESPONSE ${pizzaIngredientsArray.contentToString()}")
}