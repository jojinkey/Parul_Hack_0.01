package com.intelli.data.remote.plants.dto

import com.squareup.moshi.JsonClass
import com.intelli.data.remote.plants.dto.inner.PlantsSearchEntryDto
import com.intelli.data.remote.plants.dto.inner.PlantsSearchMetaDto

/**
 * Created by Jalaj on 22-11-2023.
 */
@JsonClass(generateAdapter = true)
data class PlantsSearchDto(
//    val id: String,
    val data: List<PlantsSearchEntryDto>,
    val meta: PlantsSearchMetaDto
) {
}