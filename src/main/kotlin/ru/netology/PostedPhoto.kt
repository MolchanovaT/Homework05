package ru.netology

data class PostedPhoto(
    val id: Int,
    val album_id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int,
    val sizes: Array<PhotoCopyDiffSize>,
    val width: Int,
    val height: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PostedPhoto

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}