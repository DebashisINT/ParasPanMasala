package com.breezefsmparaspanmasala.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmparaspanmasala.app.Pref
import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefsmparaspanmasala.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefsmparaspanmasala.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefsmparaspanmasala.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}