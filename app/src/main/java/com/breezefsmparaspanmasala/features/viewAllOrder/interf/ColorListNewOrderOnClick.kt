package com.breezefsmparaspanmasala.features.viewAllOrder.interf

import com.breezefsmparaspanmasala.app.domain.NewOrderColorEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}