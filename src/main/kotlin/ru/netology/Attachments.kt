package ru.netology

data class AttachmentPhoto(
    override val type: String,
    val photo: Photo
) : Attachment

data class AttachmentPostedPhoto(
    override val type: String,
    val postedPhoto: PostedPhoto
) : Attachment

data class AttachmentAudio(
    override val type: String,
    val audio: Audio
) : Attachment

data class AttachmentGraffiti(
    override val type: String,
    val graffiti: Graffiti
) : Attachment

data class AttachmentPage(
    override val type: String,
    val page: Page
) : Attachment