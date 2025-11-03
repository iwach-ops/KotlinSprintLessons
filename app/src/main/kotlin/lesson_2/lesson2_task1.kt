package org.example.app.lesson_2

fun main() {
    val numberOfStudents: Byte = 4
    val point1: Float = 3f
    val point2: Float = 4f
    val point3: Float = 3f
    val point4: Float = 5f

    val averagePoint: Float = ((point1 + point2 + point3 + point4) / numberOfStudents)

    println("Average point = $averagePoint")
}