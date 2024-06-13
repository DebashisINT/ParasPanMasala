package com.breezefsmparas.features.login.model.opportunitymodel

import com.breezefsmparas.app.domain.OpportunityStatusEntity
import com.breezefsmparas.app.domain.ProductListEntity
import com.breezefsmparas.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}