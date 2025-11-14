package org.example.app.lesson_8

const val INGREDIENTS_REQUEST = "Which ingredients would you like to find?: "
const val INGREDIENT_NOT_FOUND_RESPONSE = "There is no such ingredient in the recipe."

fun main() {
    val sushiRecipesArray = arrayListOf<String>("rice", "Nori", "Salmon", "Cucumber", "Soy", "Wasabi")

    print(INGREDIENTS_REQUEST)
    val inputIngredient = readln()

    var found = false

    for (ingredients in sushiRecipesArray) {
        if (ingredients.equals(inputIngredient, ignoreCase = true)) {
            println("The ingredient $inputIngredient is in the recipe")
            found = true
            break
        }
    }

    if (!found) println(INGREDIENT_NOT_FOUND_RESPONSE)
}


/*
Представь, что ты работаешь над приложением с рецептами (кстати, это приложение мы вместе будем разрабатывать на практике AndroidSprint). Напиши код, который проверяет, есть ли нужный ингредиент в рецепте.

 – создай массив, в котором будет храниться список ингредиентов для определенного блюда;
 – далее через консоль запроси у пользователя информацию об ингредиенте, который он хочет найти;
 – произведи поиск элемента по массиву, используя цикл for;
 – если ингредиент в списке есть, выведи в консоль сообщение - “Ингредиент [название] в рецепте есть”;
 – если нет, сообщать: “Такого ингредиента в рецепте нет”.

 */