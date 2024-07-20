package com.intelli.data.remote.plants

import com.google.common.truth.Truth
import com.intelli.data.local.db.plant.PlantEntity
import com.intelli.data.local.db.plant.PlantSearchEntryEntity
import com.intelli.data.remote.plants.dto.inner.PlantsSearchEntryDto
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test


class DtoMapperKtTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun `PlantsSearchEntryDto to PlantEntity`(){

        var dto = PlantsSearchEntryDto(1, family="root", slug ="23",
            commonName = "radish", scientificName = null, imageUrl = null)

//        var entity = PlantSearchEntryEntity(plantId = 1, )

        var entity = dto.toRoomEntity(2, "query")
        Truth.assertThat(entity).isEqualTo(PlantSearchEntryEntity(
            plantId = 1, q="query", index = 2, slug = "23", family = "root",
            commonName = "radish", imageUrl = null, scientificName = ""
        ))

    }
}