package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addIdNotNull() {
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "textPost",
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

        val newPost = WallService.add(post)
        assertNotEquals(0, newPost.id)
    }

    @Test
    fun updateNotExisting() {
        val service = WallService
        service.add(
            Post(
                id = 1,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "First post",
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
        )
        service.add(
            Post(
                id = 2,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "Second post",
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
        )
        service.add(
            Post(
                id = 3,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "Third post",
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
        )

        val update = Post(
            id = 10001,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "Updated post",
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

        val result = service.update(update)

        assertFalse(result)
    }

    @Test
    fun updateExisting() {
        val service = WallService
        service.add(
            Post(
                id = 1,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "First post",
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
        )
        service.add(
            Post(
                id = 2,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "Second post",
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
        )
        service.add(
            Post(
                id = 3,
                ownerId = 0,
                fromId = 0,
                createdBy = 0,
                date = 0,
                text = "Third post",
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
        )

        val update = Post(
            id = 2,
            ownerId = 0,
            fromId = 0,
            createdBy = 0,
            date = 0,
            text = "Updated post",
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

        val result = service.update(update)

        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val comment = newComment(1, 6, "test post", 1)
        WallService.createComment(comment)
    }

    @Test
    fun commentSuccessfullyCreated() {
        val service = WallService
        addPost("First post")
        val comment = newComment(1, 1, "test post", 1)
        val result = service.createComment(comment)

        assertTrue(result)
    }
}