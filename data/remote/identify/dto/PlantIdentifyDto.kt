package com.intelli.data.remote.identify.dto

import com.squareup.moshi.JsonClass
import com.intelli.data.remote.identify.dto.inner.PlantIdentifiedResult

/**
 * Created by Jalaj on 26-11-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantIdentifyDto(val language: String,
val results:List<PlantIdentifiedResult>) {
}