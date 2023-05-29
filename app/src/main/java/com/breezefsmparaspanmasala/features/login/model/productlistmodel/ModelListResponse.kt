package com.breezefsmparaspanmasala.features.login.model.productlistmodel

import com.breezefsmparaspanmasala.app.domain.ModelEntity
import com.breezefsmparaspanmasala.app.domain.ProductListEntity
import com.breezefsmparaspanmasala.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}