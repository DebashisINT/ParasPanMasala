package com.breezefsmparas.features.location.shopRevisitStatus

import com.breezefsmparas.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmparas.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}