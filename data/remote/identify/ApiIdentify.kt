package com.intelli.data.remote.identify

import com.intelli.BuildConfig
import com.intelli.data.remote.identify.dto.PlantIdentifyDto
import com.intelli.data.remote.plants.dto.PlantsSearchDto
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

/**
 * Created by Jalaj on 26-11-2023.
 */
interface ApiIdentify {
    @Multipart
    @POST("identify/{project}")
    suspend fun identify(@Path("project") project: String = "all",
                         @Query("api-key") token: String = BuildConfig.plantnetKey,
                         @PartMap() partMap: MutableMap<String,RequestBody>,
                    @Part images: MultipartBody.Part
    ): Response<PlantIdentifyDto>
}