package com.intelli.data.remote.ip

import com.intelli.data.base.remote.handleApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Jalaj on 16-11-2023.
 */

@Singleton
class RemoteIpSource @Inject constructor(
    var apiIp: ApiIp
){

    suspend fun  getIp() = withContext(Dispatchers.IO) {

        return@withContext handleApi { apiIp.getIp() }


    }
}