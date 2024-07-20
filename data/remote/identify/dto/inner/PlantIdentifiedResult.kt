package com.intelli.data.remote.identify.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 26-11-2023.
 */
@JsonClass(generateAdapter = true)
data class PlantIdentifiedResult(val score: Float, val species: PlantIdentifiedResultSpecies ) {
}