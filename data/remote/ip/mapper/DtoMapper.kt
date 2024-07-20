package com.intelli.data.remote.ip.mapper

import com.intelli.data.remote.ip.dto.IpDto

/**
 * Created by Jalaj on 16-11-2023.
 */
fun IpDto.toLatLng(): Array<Float> {
    return arrayOf(lat, lon)
}