package org.example.app.lesson_20

fun main() {
    val elements = listOf<String>("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight")

    val actions: List<() -> Unit> = elements.map { element -> { println("Element $element is pressed") } }

    actions.forEachIndexed { index, action -> if (index % 2 == 0) action() }
}