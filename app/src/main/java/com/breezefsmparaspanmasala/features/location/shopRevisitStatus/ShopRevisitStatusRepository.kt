package com.breezefsmparaspanmasala.features.location.shopRevisitStatus

import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.location.model.ShopDurationRequest
import com.breezefsmparaspanmasala.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}