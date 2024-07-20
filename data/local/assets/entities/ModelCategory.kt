package com.intelli.data.local.assets.entities

import androidx.recyclerview.widget.DiffUtil


data class ModelCategory(
    val id : Int,
    var filterForEdible: Boolean,
    var imageSrc: String,
    var q: String? = null,
    var title: String
) {

    companion object {
        var diffCallback: DiffUtil.ItemCallback<ModelCategory> =
            object : DiffUtil.ItemCallback<ModelCategory>() {

                override fun areItemsTheSame(
                    oldItem: ModelCategory,
                    newItem: ModelCategory
                ): Boolean {
                    return oldItem.id == newItem.id                }

                override fun areContentsTheSame(
                    oldItem: ModelCategory,
                    newItem: ModelCategory
                ): Boolean {
                    return oldItem == newItem
                }
            }
    }
}