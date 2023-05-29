package com.breezefsmparaspanmasala.features.stockAddCurrentStock.api

import com.breezefsmparaspanmasala.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmparaspanmasala.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}