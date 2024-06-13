package com.breezefsmparas.features.viewAllOrder.model

import com.breezefsmparas.app.domain.NewOrderColorEntity
import com.breezefsmparas.app.domain.NewOrderGenderEntity
import com.breezefsmparas.app.domain.NewOrderProductEntity
import com.breezefsmparas.app.domain.NewOrderSizeEntity
import com.breezefsmparas.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

