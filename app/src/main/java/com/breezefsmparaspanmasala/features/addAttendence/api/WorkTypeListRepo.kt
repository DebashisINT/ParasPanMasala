package com.breezefsmparaspanmasala.features.addAttendence.api

import com.breezefsmparaspanmasala.app.Pref
import com.breezefsmparaspanmasala.features.addAttendence.model.WorkTypeResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 31-08-2018.
 */
class WorkTypeListRepo(val apiService: WorkTypeListApi) {
    fun getWorkTypeList(): Observable<WorkTypeResponseModel> {
        return apiService.getWorkType(Pref.user_id!!)
    }
}