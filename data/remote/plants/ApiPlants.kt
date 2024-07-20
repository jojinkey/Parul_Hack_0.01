package com.intelli.data.remote.plants

import com.intelli.BuildConfig
import com.intelli.data.remote.plants.dto.PlantDetailDto
import com.intelli.data.remote.plants.dto.PlantDetailResponseDto
import com.intelli.data.remote.plants.dto.PlantsSearchDto
import com.intelli.data.remote.weather.dto.WeatherCurrentDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

/**
 * Created by Jalaj on 22-11-2023.
 */
interface ApiPlants {
    @GET("plants/search")
    suspend fun byQ(@Query("q") searchQ: String?,
                           @Query("page") page: Int = 0,
                    @Query("token") token: String = BuildConfig.trefleKey
    ): Response<PlantsSearchDto>

    @GET("plants")
    suspend fun byFilter(
        @QueryMap filters: Map<String, String>,
                    @Query("page") page: Int = 0,
                    @Query("token") token: String = BuildConfig.trefleKey
    ): Response<PlantsSearchDto>
    @GET("plants")
    suspend fun default(
        @Query("page") page: Int = 0,
        @Query("token") token: String = BuildConfig.trefleKey
    ): Response<PlantsSearchDto>

    @GET("plants/{plantId}")
    suspend fun byId(@Path("plantId") plantId: Int,
                    @Query("token") token: String = BuildConfig.trefleKey
    ): Response<PlantDetailResponseDto>

}