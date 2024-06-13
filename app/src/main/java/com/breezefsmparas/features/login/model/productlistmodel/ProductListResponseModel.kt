package com.breezefsmparas.features.login.model.productlistmodel

import com.breezefsmparas.app.domain.ProductListEntity
import com.breezefsmparas.base.BaseResponse

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListResponseModel : BaseResponse() {
    //var product_list: ArrayList<ProductListDataModel>? = null
    var product_list: ArrayList<ProductListEntity>? = null
}