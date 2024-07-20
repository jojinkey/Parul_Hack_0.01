package com.intelli.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.intelli.data.local.db.base.converter.StringListConverter
import com.intelli.data.local.db.cached.CachedRemoteKeyDao
import com.intelli.data.local.db.cached.CachedRemoteKeyEntity
import com.intelli.data.local.db.location.LocationRoomDao
import com.intelli.data.local.db.location.LocationRoomEntity
import com.intelli.data.local.db.log.IdentifyLogRoomDao
import com.intelli.data.local.db.log.IdentifyLogRoomEntity
import com.intelli.data.local.db.plant.*
import com.intelli.data.local.db.weather.*

/**
 * Created by Jalaj on 18-11-2023.
 */
@Database(
    entities = [LocationRoomEntity::class,
        WeatherCurrentRoomEntity::class,
        WeatherForecastRoomEntity::class,
        ForecastEntryEntity::class,
        PlantSearchEntryEntity::class,
        CachedRemoteKeyEntity::class,
        PlantRecentSearchEntity::class,
        IdentifyLogRoomEntity::class,
        PlantEntity::class,
        PlantImageEntity::class,],
    version = 11,
    exportSchema = true
)
@TypeConverters(StringListConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun locationDao(): LocationRoomDao
    abstract fun weatherCurrent(): WeatherCurrentDao
    abstract fun weatherForecast(): WeatherForecastDao
    abstract fun weatherForecastEntry(): WeatherForecastEntryDao
    abstract fun cachedRemoteKey(): CachedRemoteKeyDao
    abstract fun plantsSearchDao(): PlantsSearchDao
    abstract fun plantRecentSearchDao(): PlantRecentSearchDao
    abstract fun identifyLogDao(): IdentifyLogRoomDao

    abstract fun plantDao(): PlantDao
    abstract fun plantDetailDao(): PlantDetailDao
    abstract fun plantImageDao(): PlantImageDao

}