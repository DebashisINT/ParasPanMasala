package com.breezefsmparaspanmasala.features.photoReg.adapter

import com.breezefsmparaspanmasala.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}