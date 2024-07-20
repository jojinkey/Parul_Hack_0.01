package com.intelli.data.remote.identify.dto.inner

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 26-11-2023.
 */
@JsonClass(generateAdapter = true)
data class PlantIdentifiedResultSpecies(val commonNames: List<String> ) {
}