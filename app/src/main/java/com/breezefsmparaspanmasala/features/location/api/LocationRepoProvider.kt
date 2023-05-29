package com.breezefsmparaspanmasala.features.location.api

import com.breezefsmparaspanmasala.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmparaspanmasala.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}