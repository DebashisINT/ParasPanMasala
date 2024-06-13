package com.breezefsmparas.features.report.model

import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.nearbyshops.model.ShopData

/**
 * Created by Pratishruti on 27-12-2017.
 */
class MISResponse:BaseResponse() {
    var shop_list:List<ShopData>? = null
    var shop_list_count:MISShopListCount?=null
}