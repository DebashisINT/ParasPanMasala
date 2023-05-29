package com.breezefsmparaspanmasala.features.viewAllOrder.orderOptimized

import com.breezefsmparaspanmasala.app.domain.ProductOnlineRateTempEntity
import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}