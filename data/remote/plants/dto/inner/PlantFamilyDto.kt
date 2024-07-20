package com.intelli.data.remote.plants.dto.inner

import com.squareup.moshi.JsonClass
import retrofit2.http.Field

/**
 * Created by Jalaj on 30-11-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantFamilyDto(var id: String,
                         var name: String

) {
}