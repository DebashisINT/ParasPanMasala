package com.breezefsmparaspanmasala.features.stockCompetetorStock.api

import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.orderList.model.NewOrderListResponseModel
import com.breezefsmparaspanmasala.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmparaspanmasala.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}