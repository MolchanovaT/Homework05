package ru.netology

import java.lang.RuntimeException

class PostNotFoundException(message: String) : RuntimeException(message)

object WallService {
    private var posts = emptyArray<Post>()
    private var uniqueId = 0
    private var comments = emptyArray<Comment>()

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

    fun createComment(comment: Comment): Boolean {
        for (postIteration in posts) {
            if (comment.postId == postIteration.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Not found post with id ${comment.postId}")
    }
}