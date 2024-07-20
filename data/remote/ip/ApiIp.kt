package com.intelli.data.remote.ip

import com.intelli.data.remote.ip.dto.IpDto
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by Jalaj on 16-11-2023.
 */
interface ApiIp {

    @GET("json")
    suspend fun getIp(
    ): Response<IpDto>
}