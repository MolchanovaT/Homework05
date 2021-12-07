package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 0

    fun add(post: Post): Post {
        uniqueId++
        posts += post.copy(id = uniqueId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, postIteration) in posts.withIndex()) {
            if (post.id == postIteration.id) {
                posts[index] = post.copy(
                    id = post.id,
                    text = post.text
                )
                return true
            }
        }
        return false
    }
}