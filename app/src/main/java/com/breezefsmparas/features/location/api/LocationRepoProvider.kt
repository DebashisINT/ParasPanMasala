package com.breezefsmparas.features.location.api

import com.breezefsmparas.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmparas.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}