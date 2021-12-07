package ru.netology

fun main() {
    val firstPost = addPost("First post")
    printPost(firstPost)

    val secondPost = addPost("Second post")
    printPost(secondPost)

    val updatedPost = addPostNoIdUnique(1,"Updated post")
    if (updatePost(updatedPost)) {
        println("Updated post:")
        printPost(updatedPost)
    }
}

fun addPost(textPost: String): Post {
    val post = Post(
        id = 0,
        ownerId = 0,
        fromId = 0,
        createdBy = 0,
        date = 0,
        text = textPost,
        replyOwnerIid = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(0, "", "Empty", ""),
        likes = Likes(0, userLikes = false, canLike = false, canPublish = false),
        reposts = Reposts(0, false),
        views = Views(0),
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 0
    )

    return WallService.add(post)
}

fun addPostNoIdUnique(idPost: Int, textPost: String): Post {
    return Post(
        id = idPost,
        ownerId = 0,
        fromId = 0,
        createdBy = 0,
        date = 0,
        text = textPost,
        replyOwnerIid = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = Comments(0, canPost = false, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(0, "", "Empty", ""),
        likes = Likes(0, userLikes = false, canLike = false, canPublish = false),
        reposts = Reposts(0, false),
        views = Views(0),
        postType = "",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(false, 0, Placeholder(), false, ""),
        postponedId = 0
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
