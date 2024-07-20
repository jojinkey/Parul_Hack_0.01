package com.intelli.data.local.db.location

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Created by Jalaj on 18-11-2023.
 */
@Entity(tableName = "Location", indices = [Index(value = ["lat", "lon"], unique = true)])
data class LocationRoomEntity(
    @PrimaryKey(autoGenerate = true)
     val id : Int = 0,
    val lat: Float,
    val lon: Float,
    var weatherUnix:Int? = null,
    var forecastUnix: Int? = null) {
}