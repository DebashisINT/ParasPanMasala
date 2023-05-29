package com.breezefsmparaspanmasala.features.location.shopRevisitStatus

import com.breezefsmparaspanmasala.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmparaspanmasala.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}