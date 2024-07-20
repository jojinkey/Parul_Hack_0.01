package com.intelli.data.local.db.plant

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.intelli.data.local.db.base.RoomDaoBase

/**
 * Created by Jalaj on 30-11-2023.
 */
@Dao
interface PlantDetailDao : RoomDaoBase<PlantEntity>  {

    @Transaction
    @Query("SELECT * FROM Plants WHERE id=:plantId")
    suspend fun byId(plantId:Int): PlantDetailRoomData?
    @Query("SELECT * FROM Plants ORDER BY `lastQueriedDt` DESC LIMIT :limit")
    fun list(limit: Int): List<PlantEntity>

}