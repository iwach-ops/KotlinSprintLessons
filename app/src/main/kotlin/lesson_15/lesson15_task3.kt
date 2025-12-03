package org.example.app.lesson_15

fun main() {

    val user = StandardUser(2, "Tom")
    val admin = Admin(1, "Ralf")

    user.readForum()
    user.writeMessage("Hi Ralf")

    admin.readForum()
    admin.writeMessage("You will be deleted")

    admin.deleteUser(user)
    admin.deleteMessage(33)
}

abstract class ForumUser(
    val id: Int,
    val name: String,
    ) {
    fun readForum() {
        println("$name reads the forum")
    }

    fun writeMessage(text: String) {
        println("$name writes the message: $text")
    }
}

class Admin(
    id: Int,
    name: String,
) : ForumUser(id, name) {
    fun deleteMessage(messageId: Int) {
        println("$name (Admin) deletes this message: $messageId")
    }

    fun deleteUser(user: ForumUser) {
        println("$name (Admin) deletes this user with id=${user.id}")
    }
}

class StandardUser(
    id: Int,
    name: String,
) : ForumUser(id, name)