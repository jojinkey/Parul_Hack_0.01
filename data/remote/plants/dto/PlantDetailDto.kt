package com.intelli.data.remote.plants.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.intelli.data.local.db.plant.PlantImageEntity
import com.intelli.data.remote.plants.dto.inner.*
import retrofit2.http.Field

/**
 * Created by Jalaj on 30-11-2023.
 */

@JsonClass(generateAdapter = true)
data class PlantDetailDto(var id: Int,
                          @Json(name = "main_species_id") var mainSpeciesId: Int,
                          @Json(name = "image_url" ) val imageUrl: String,
                          val vegetable: Boolean?,
                          @Json(name = "common_name" ) val commonName: String?,
                          @Json(name = "scientific_name" ) val scientificName: String?,
                          val family: PlantFamilyDto,
                          val genus: PlantGenusDto,
                          @Json(name = "main_species") val mainSpecies: PlantSpeciesDto
                          ) {

}