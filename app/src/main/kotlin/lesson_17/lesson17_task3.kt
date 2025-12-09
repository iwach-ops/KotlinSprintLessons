package org.example.app.lesson_17

fun main() {
    val folder1 = Folder("Folder1", 12, true)

    println("name: ${folder1.name}")
    println("number of files: ${folder1.numberOfFiles}")

    val folder2 = Folder("Folder2", 12, false)

    println("name: ${folder2.name}")
    println("number of files: ${folder2.numberOfFiles}")
}

class Folder(
    _name: String,
    _numberOfFiles: Int,
    private var isSecret: Boolean,
) {
    val name: String = _name
        get() = if (isSecret) "hidden folder" else field

    val numberOfFiles: Int = _numberOfFiles
        get() = if (isSecret) 0 else field
}