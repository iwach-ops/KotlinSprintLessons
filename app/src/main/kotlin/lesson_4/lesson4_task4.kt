package org.example.app.lesson_4

fun main() {
    var armsExercises: Boolean = true
    var legsExercises: Boolean = false
    var backExercises: Boolean = false
    var pressExercises: Boolean = true
    val day: Int = 5

    armsExercises = day % 2 != 0
    legsExercises = day % 2 == 0
    backExercises = day % 2 == 0
    pressExercises = day % 2 != 0

    println(
        """
             Упражнения для рук:    $armsExercises
             Упражнения для ног:    $legsExercises
             Упражнения для спины:  $backExercises
             Упражнения для пресса: $pressExercises
        """.trimIndent()
    )
}


