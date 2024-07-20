package com.intelli.data.local.db.weather

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.intelli.data.local.db.base.RoomDaoBase

/**
 * Created by Jalaj on 20-11-2023.
 */
@Dao
interface WeatherForecastEntryDao : RoomDaoBase<ForecastEntryEntity> {


}