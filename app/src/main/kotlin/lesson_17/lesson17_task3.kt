package org.example.app.lesson_17

fun main() {
    val folder = Folder("ABC", 12, true)

    folder.displayFolderInfo()

    folder.isSecret = false

    folder.displayFolderInfo()
}

class Folder(
    _name: String,
    _numberOfFiles: Int,
    var isSecret: Boolean = false,
) {
   private val name: String = _name
        get() = if (isSecret) "hidden folder" else field

   private val numberOfFiles: Int = _numberOfFiles
        get() = if (isSecret) 0 else field

    fun displayFolderInfo() {
        println(
            """
       folder name: ${name}
       number Of Files: ${numberOfFiles}
    """.trimIndent()
        )
    }
}