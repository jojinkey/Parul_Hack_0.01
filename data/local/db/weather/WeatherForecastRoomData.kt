package com.intelli.data.local.db.weather

import androidx.room.Embedded
import androidx.room.Relation

/**
 * Created by Jalaj on 20-11-2023.
 */
data class WeatherForecastRoomData(
    @Embedded
    val forecast: WeatherForecastRoomEntity,
    @Relation(parentColumn = "id", entityColumn = "forecastId")
    val entries: List<ForecastEntryEntity> = emptyList()
) {
}