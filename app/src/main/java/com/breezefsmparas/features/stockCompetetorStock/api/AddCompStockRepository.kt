package com.breezefsmparas.features.stockCompetetorStock.api

import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.orderList.model.NewOrderListResponseModel
import com.breezefsmparas.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmparas.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}