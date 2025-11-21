package org.example.app.lesson_11

fun main() {
    val room1 = Room("Sega", "Gamer World")
    val userRalf = Participant("Wolf", "Ralf", "speaking")
    val userStefan = Participant("Rabbit", "Stefan", "Muted")
    val userGeorg = Participant("Dog", "Georg", "Mic off")
    val userTom = Participant("Cat", "Tom", "speaking")

    room1.addParticipant(userRalf)
    room1.addParticipant(userStefan)
    room1.addParticipant(userGeorg)
    room1.addParticipant(userTom)

    room1.participants.forEach { user ->
        println(
            """
                Avatar : ${user.avatar}
                NickName : ${user.nickName}
                Status : ${user.status}
                                 
            """.trimIndent()
        )
    }

    println("Wolf Current Status: ${userRalf.status}")

    room1.updateStatus("Ralf", "Muted")

    println("Wolf New Status: ${userRalf.status}")
}

class Room(
    val cover: String,
    val name: String,
    val participants: MutableList<Participant> = mutableListOf()
) {

    fun addParticipant(participant: Participant) {
        if (participants.find { user -> user == participant } == null) participants.add(participant)
    }

    fun updateStatus(nickName: String, newStatus: String) {
        val user = participants.find { it.nickName == nickName }
        if (user != null) user.status = newStatus
    }
}

class Participant(
    val avatar: String,
    val nickName: String,
    var status: String
)