package com.intelli.data.remote.plants.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 11-02-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantDistributionDto(var native: List<String>) {
}