package org.example.app.lesson_11

fun main() {
    val cheeseburger = Recipe("cheeseburger", "First, lightly toast the hamburger bun...")
    val ingredientBun = Ingredient("hamburger bun", 1.0, "piece")
    val burger = Category("burgers", "recipes for all popular burgers")

    println(
        """
            Category: ${burger.name}
            Recipe: ${cheeseburger.name}
            Ingredient: ${ingredientBun.name}
        """.trimIndent()
    )
}

class Category(
    val name: String,
    val info: String,
    val recipes: MutableList<Recipe> = mutableListOf()
)


class Recipe(
    val name: String,
    val description: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
)

class Ingredient(
    val name: String,
    val amount: Double,
    val unit: String,
)