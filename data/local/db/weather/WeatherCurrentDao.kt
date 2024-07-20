package com.intelli.data.local.db.weather

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.intelli.data.local.db.base.RoomDaoBase
import com.intelli.data.local.db.location.LocationRoomEntity

/**
 * Created by Jalaj on 19-11-2023.
 */
@Dao
interface WeatherCurrentDao: RoomDaoBase<WeatherCurrentRoomEntity> {

    @Query("DELETE FROM WeatherCurrent WHERE locationId=:locationId")
    suspend fun deleteByLocationId(locationId:Int): Int


    @Query("SELECT * FROM WeatherCurrent WHERE locationId=:locationId ORDER BY dt ASC LIMIT :limit")
    suspend fun findByLocationId(locationId:Int, limit: Int = 1): List<WeatherCurrentRoomEntity>

    @Query("DELETE FROM WeatherCurrent")
    fun deleteAll()
}