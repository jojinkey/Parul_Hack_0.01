package com.intelli.data.local.source

import com.intelli.data.local.db.cached.CachedRemoteKeyEntity
import com.intelli.data.local.db.location.LocationRoomDao
import com.intelli.data.local.db.log.IdentifyLogRoomDao
import com.intelli.data.local.db.log.IdentifyLogRoomEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.Calendar
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Jalaj on 26-11-2023.
 */
@Singleton
class LocalLogSource @Inject constructor(
    private var identifyLogRoomDao: IdentifyLogRoomDao
) {
    suspend fun insert(entity: IdentifyLogRoomEntity) = withContext(Dispatchers.IO) {
        return@withContext identifyLogRoomDao.insert(entity)
    }

    suspend fun getCountForDay() = withContext(Dispatchers.IO){

        var calender = Calendar.getInstance()
        calender.add(Calendar.DAY_OF_YEAR, -1);

        return@withContext identifyLogRoomDao.count((calender.timeInMillis/1000).toInt())
    }
}