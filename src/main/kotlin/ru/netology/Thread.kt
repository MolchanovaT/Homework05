package ru.netology

data class Thread(
    val count: Int,
    val items: Array<Comment>? = emptyArray(),
    val can_post: Boolean,
    val show_reply_button: Boolean,
    val groups_can_post: Boolean
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Thread

        if (count != other.count) return false

        return true
    }

    override fun hashCode(): Int {
        return count
    }
}
