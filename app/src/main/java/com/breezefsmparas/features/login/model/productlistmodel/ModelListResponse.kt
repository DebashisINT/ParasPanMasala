package com.breezefsmparas.features.login.model.productlistmodel

import com.breezefsmparas.app.domain.ModelEntity
import com.breezefsmparas.app.domain.ProductListEntity
import com.breezefsmparas.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}