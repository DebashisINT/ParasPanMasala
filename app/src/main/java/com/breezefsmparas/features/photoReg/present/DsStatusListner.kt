package com.breezefsmparas.features.photoReg.present

import com.breezefsmparas.app.domain.ProspectEntity
import com.breezefsmparas.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}