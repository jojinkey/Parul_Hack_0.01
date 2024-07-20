package com.intelli.domain.glide

import androidx.annotation.NonNull
import com.bumptech.glide.load.model.*
import java.io.InputStream


/**
 * Created by Jalaj on 13-02-2023.
 */
class CustomImageSizeUrlLoaderFactory: ModelLoaderFactory<CustomImageSizeModel, InputStream> {
    private val modelCache: ModelCache<CustomImageSizeModel, GlideUrl> = ModelCache<CustomImageSizeModel, GlideUrl>(500)

    override fun build(multiFactory: MultiModelLoaderFactory): ModelLoader<CustomImageSizeModel, InputStream> {
        val modelLoader = multiFactory.build(
            GlideUrl::class.java,
            InputStream::class.java
        )
        return CustomImageSizeUrlLoader(modelLoader, modelCache)
    }

    override fun teardown() {}
}