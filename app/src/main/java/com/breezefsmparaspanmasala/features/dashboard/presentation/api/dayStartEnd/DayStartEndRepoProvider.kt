package com.breezefsmparaspanmasala.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmparaspanmasala.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmparaspanmasala.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}