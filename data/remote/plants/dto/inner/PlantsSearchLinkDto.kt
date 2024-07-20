package com.intelli.data.remote.plants.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 22-01-2023.
 */
@JsonClass(generateAdapter = true)
data class PlantsSearchLinkDto(
    val self: Int,

) {
}