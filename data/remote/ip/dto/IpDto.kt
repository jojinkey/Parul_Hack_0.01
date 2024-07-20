package com.intelli.data.remote.ip.dto

import com.squareup.moshi.JsonClass

/**
 * Created by Jalaj on 16-11-2023.
 */
@JsonClass(generateAdapter = true)
data class IpDto(var query: String, var lat: Float, var lon: Float){

}
