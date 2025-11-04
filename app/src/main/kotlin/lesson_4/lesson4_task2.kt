package org.example.app.lesson_4

val MIN_WEIGHT: Int = 35
val MAX_WEIGHT: Int = 100
val MAX_VOLUME: Int = 100
fun main() {
    var weight: Int
    var volume: Int

    weight = 20
    println("For $weight kg  - Average: ${weight > MIN_WEIGHT && weight <= MAX_WEIGHT}")
    weight = 50
    volume = 80
    println("For $weight kg and $volume l - Average: ${weight > MIN_WEIGHT && weight <= MAX_WEIGHT && volume < MAX_VOLUME}")
    volume = 100
    println("For $volume l - Average: ${volume < MAX_VOLUME}")
}