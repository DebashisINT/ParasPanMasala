package com.breezefsmparaspanmasala.features.photoReg.present

import com.breezefsmparaspanmasala.app.domain.ProspectEntity
import com.breezefsmparaspanmasala.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}