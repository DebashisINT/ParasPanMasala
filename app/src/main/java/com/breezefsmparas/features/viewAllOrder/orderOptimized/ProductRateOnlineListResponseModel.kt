package com.breezefsmparas.features.viewAllOrder.orderOptimized

import com.breezefsmparas.app.domain.ProductOnlineRateTempEntity
import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}