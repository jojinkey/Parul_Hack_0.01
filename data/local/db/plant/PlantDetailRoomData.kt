package com.intelli.data.local.db.plant

import androidx.room.Embedded
import androidx.room.Relation
import com.intelli.data.local.db.weather.ForecastEntryEntity
import com.intelli.data.local.db.weather.WeatherForecastRoomEntity

/**
 * Created by Jalaj on 30-11-2023.
 */
data class PlantDetailRoomData(
    @Embedded
    val detail: PlantEntity,
    @Relation(parentColumn = "id", entityColumn = "plantId")
    val entries: List<PlantImageEntity> = emptyList()
) {
}