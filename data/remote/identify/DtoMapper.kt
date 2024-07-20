package com.intelli.data.remote.identify

import android.net.Uri
import com.intelli.data.local.db.weather.WeatherCurrentRoomEntity
import com.intelli.data.local.db.weather.inner.WeatherAttrEntity
import com.intelli.data.local.db.weather.inner.WeatherSubEntity
import com.intelli.data.remote.identify.dto.PlantIdentifyDto
import com.intelli.data.remote.weather.dto.WeatherCurrentDto
import com.intelli.domain.identify.model.ModelIdentified
import com.intelli.domain.weather.WeatherConstants

/**
 * Created by Jalaj on 26-11-2023.
 */
fun PlantIdentifyDto.toDomainModel(uri: Uri): ModelIdentified {


    var keyworks = mutableListOf<String>()
    if(results.size>0){
       keyworks = results[0].species.commonNames.fold(keyworks) { acc: MutableList<String>, s: String ->
            acc.addAll(
                s.split(" ")
            )
            acc
        }

    }
    return ModelIdentified(
        keywords = keyworks,
        uriStr = uri.toString()
    )

}