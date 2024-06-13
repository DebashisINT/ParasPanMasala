package com.breezefsmparas.features.newcollectionreport

import com.breezefsmparas.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}