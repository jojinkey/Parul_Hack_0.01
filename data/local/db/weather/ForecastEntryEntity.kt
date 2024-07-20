package com.intelli.data.local.db.weather

import androidx.room.*
import com.intelli.data.local.db.weather.inner.WeatherAttrEntity
import com.intelli.data.local.db.weather.inner.WeatherSubEntity

/**
 * Created by Jalaj on 20-11-2023.
 */

@Entity(
    tableName = "ForecastEntry",

    indices = [Index("forecastId"), Index("dt")],
    foreignKeys = [ForeignKey(
        onDelete = ForeignKey.CASCADE,
        entity = WeatherForecastRoomEntity::class,
        parentColumns = ["id"],
        childColumns = ["forecastId"]
    )]
)
data class ForecastEntryEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val forecastId: Int,
    val dt: Int,
    @Embedded(prefix = "weather_") val weather: WeatherSubEntity?,
    @Embedded(prefix = "attr_") val attrs: WeatherAttrEntity
) {
}