package com.breezefsmparas.features.stockAddCurrentStock.api

import com.breezefsmparas.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmparas.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}