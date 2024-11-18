package com.example.storageandroidapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.storageandroidapp.SharedStoragePhoto
import com.example.storageandroidapp.databinding.ItemPhotoBinding

class SharedPhotoAdapter(private val onPhotoClick: (SharedStoragePhoto) -> Unit) : ListAdapter<SharedStoragePhoto, SharedPhotoAdapter.PhotoViewHolder>(Companion) {
    inner class PhotoViewHolder(val binding: ItemPhotoBinding) : RecyclerView.ViewHolder(binding.root)

    companion object : DiffUtil.ItemCallback<SharedStoragePhoto>() {
        override fun areItemsTheSame(oldItem: SharedStoragePhoto, newItem: SharedStoragePhoto): Boolean {
            return oldItem.id== newItem.id
        }

        override fun areContentsTheSame(oldItem: SharedStoragePhoto, newItem: SharedStoragePhoto): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
    }
}