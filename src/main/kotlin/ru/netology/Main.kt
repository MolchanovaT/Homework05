package ru.netology

fun main() {
    val firstPost = addPost("First post")
    printPost(firstPost)

    val secondPost = addPost("Second post")
    printPost(secondPost)

    val updatedPost = addPostNoIdUnique(1, "Updated post")
    if (updatePost(updatedPost)) {
        println("Updated post:")
        printPost(updatedPost)
    }
}

fun addPost(textPost: String): Post {
    val post = Post(
        id = 0,
        text = textPost,
        comments = Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(0, "", "Empty", ""),
        likes = Likes(0, userLikes = false, canLike = false, canPublish = false),
        reposts = Reposts(0, false),
        views = Views(0),
        donut = Donut(false, 0, Placeholder(), false, "")
    )

    return WallService.add(post)
}

fun addPostNoIdUnique(idPost: Int, textPost: String): Post {
    return Post(
        id = idPost,
        text = textPost,
        comments = Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(0, "", "Empty", ""),
        likes = Likes(0, userLikes = false, canLike = false, canPublish = false),
        reposts = Reposts(0, false),
        views = Views(0),
        donut = Donut(false, 0, Placeholder(), false, "")
    )
}

fun printPost(post: Post) {
    val postID = post.id
    val postText = post.text
    println("PostID = $postID")
    println("PostText = $postText")
}

fun updatePost(post: Post): Boolean {
    return WallService.update(post)
}
