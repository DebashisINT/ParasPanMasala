package com.breezefsmparaspanmasala.features.alarm.api.report_confirm_api

import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.alarm.model.ReviewConfirmInputModel
import io.reactivex.Observable

/**
 * Created by Saikat on 21-02-2019.
 */
class ReviewConfirmRepo(val apiService: ReviewConfirmApi) {
    fun reviewConfirm(reviewConfirm: ReviewConfirmInputModel): Observable<BaseResponse> {
        return apiService.reviewConfirm(reviewConfirm)
    }
}