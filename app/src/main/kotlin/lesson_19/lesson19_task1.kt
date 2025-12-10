package org.example.app.lesson_19

fun main() {
    for (fish in Fish.entries) {
        println(fish)
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}