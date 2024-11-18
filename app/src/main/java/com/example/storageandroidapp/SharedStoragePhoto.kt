package com.example.storageandroidapp

import android.net.Uri

data class SharedStoragePhoto(
    val id: Long,
    val name: String,
    val width: Int,
    val height: Long,
    val contentUri: Uri
)