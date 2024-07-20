package com.intelli.data.local.db.log

import androidx.room.Dao
import androidx.room.Query
import com.intelli.data.local.db.base.RoomDaoBase

/**
 * Created by Jalaj on 26-11-2023.
 */
@Dao
interface IdentifyLogRoomDao: RoomDaoBase<IdentifyLogRoomEntity> {

    @Query("SELECT COUNT(id) FROM IdentifyLog where dt > :dt")
    suspend fun count(dt:Int): Int

}