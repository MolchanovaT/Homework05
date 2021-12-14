package ru.netology

data class Comment(
    val id: Int = 0,
    val postId: Int,
    val fromId: Int,
    val date: Int = 0,
    val text: String,
    val donut: Donut? = null,
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Array<Attachment> = emptyArray(),
    val parentsStack: Array<Comment> = emptyArray(),
    val thread: Thread? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}
