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
                posts[index] = postIteration.copy(
                    id = postIteration.id,
                    fromId = postIteration.fromId,
                    createdBy = postIteration.createdBy,
                    text = postIteration.text,
                    replyOwnerIid = postIteration.replyOwnerIid,
                    replyPostId = postIteration.replyPostId,
                    friendsOnly = postIteration.friendsOnly,
                    comments = postIteration.comments,
                    copyright = postIteration.copyright,
                    likes = postIteration.likes,
                    reposts = postIteration.reposts,
                    views = postIteration.views,
                    postType = postIteration.postType,
                    signerId = postIteration.signerId,
                    canPin = postIteration.canPin,
                    canDelete = postIteration.canDelete,
                    canEdit = postIteration.canEdit,
                    isPinned = postIteration.isPinned,
                    markedAsAds = postIteration.markedAsAds,
                    isFavorite = postIteration.isFavorite,
                    donut = postIteration.donut,
                    postponedId = postIteration.postponedId
                )
                return true
            }
        }
        return false
    }
}