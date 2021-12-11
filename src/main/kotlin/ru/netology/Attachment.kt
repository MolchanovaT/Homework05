package ru.netology

sealed class Attachment(val type: String)

data class GraffitiAttachment(val graffiti: Any) : Attachment("graffiti")
data class AudioAttachment(val audio: Any) : Attachment("audio")
data class PhotoAttachment(val photo: Any) : Attachment("photo")
data class PostedPhotoAttachment(val postedPhoto: Any) : Attachment("postedPhoto")
data class PageAttachment(val page: Any) : Attachment("page")