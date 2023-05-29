package com.breezefsmparaspanmasala.features.viewAllOrder.model

import com.breezefsmparaspanmasala.app.domain.NewOrderColorEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderGenderEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderProductEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderSizeEntity
import com.breezefsmparaspanmasala.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

