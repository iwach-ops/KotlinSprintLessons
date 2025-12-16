package org.example.app.lesson_21

fun main() {
    val skills = mapOf(
        "magic" to 30,
        "strength" to 20,
        "intelligence" to 50,
        "speed" to 5
    )

    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return maxBy { it.value }?.key ?: ""
}