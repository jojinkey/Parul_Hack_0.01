package com.intelli.data.remote.plants.dto.inner

import com.squareup.moshi.JsonClass
import retrofit2.http.Field

/**
 * Created by Jalaj on 30-01-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantGenusDto(var id: String,
                         var name: String

) {
}