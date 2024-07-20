package com.taru.data.local.db.plant

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import com.taru.data.local.db.base.RoomDaoBase

/**
 * Created by Jalaj on 22-11-2023.
 */
@Dao
interface PlantImageDao: RoomDaoBase<PlantImageEntity> {

    @Query("DELETE FROM PlantImages")
    fun deleteAll()

}