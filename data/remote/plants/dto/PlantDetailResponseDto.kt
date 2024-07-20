package com.intelli.data.remote.plants.dto

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 03-11-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantDetailResponseDto(val data: PlantDetailDto) {
}