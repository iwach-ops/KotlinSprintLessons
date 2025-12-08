package org.example.app.lesson_17

fun main() {
    val folder = Folder("ABC", 12)

    println(
        """
        ${folder.name}
        ${folder.numberOfFiles}
    """.trimIndent()
    )

    folder.secret = true

    println(
        """
        ${folder.name}
        ${folder.numberOfFiles}
    """.trimIndent()
    )
}

class Folder(
    _name: String,
    _numberOfFiles: Int,
    _secret: Boolean = false,
) {
    private val realName = _name
    private val realNumberOfFiles = _numberOfFiles
    var secret = _secret

    val name: String
        get() = if (secret) "hidden folder" else realName

    val numberOfFiles: Int
        get() = if (secret) 0 else realNumberOfFiles
}