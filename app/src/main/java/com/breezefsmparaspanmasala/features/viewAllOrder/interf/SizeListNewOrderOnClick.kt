package com.breezefsmparaspanmasala.features.viewAllOrder.interf

import com.breezefsmparaspanmasala.app.domain.NewOrderProductEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}