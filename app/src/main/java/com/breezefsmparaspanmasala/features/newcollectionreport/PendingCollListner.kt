package com.breezefsmparaspanmasala.features.newcollectionreport

import com.breezefsmparaspanmasala.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}