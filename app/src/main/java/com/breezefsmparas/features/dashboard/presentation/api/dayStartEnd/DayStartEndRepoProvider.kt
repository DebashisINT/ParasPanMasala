package com.breezefsmparas.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmparas.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmparas.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}