package com.breezefsmparas.features.viewAllOrder.interf

import com.breezefsmparas.app.domain.NewOrderColorEntity
import com.breezefsmparas.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}