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

    val page = Page(11, 22, "Page for post")
    val attachmentPage = AttachmentPage("page", page)
    var attachments = emptyArray<Attachment>()
    attachments += attachmentPage

    val postWithAttachments = addPostWithAttachments(111, "Post with attachments", attachments)
    printAttachmentInfo(postWithAttachments)
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

fun addPostWithAttachments(idPost: Int, textPost: String, attachmentsPost: Array<Attachment>): Post {
    return Post(
        id = idPost,
        text = textPost,
        attachments = attachmentsPost
    )
}

fun printAttachmentInfo(post: Post) {
    for (attachment in post.attachments!!) {
        when (attachment) {
            is AttachmentAudio -> {
                println("audio_id = $attachment.audio.id")
            }
            is AttachmentPhoto -> {
                println("photo_id = $attachment.photo.id")
            }
            is AttachmentPage -> {
                println("page_id = ${attachment.page.id}")
            }
            is AttachmentPostedPhoto -> {
                println("posted photo_id = $attachment.postedPhoto.id")
            }
            is AttachmentGraffiti -> {
                println("Graffiti_id = $attachment.graffiti.id")
            }
        }
    }
}
