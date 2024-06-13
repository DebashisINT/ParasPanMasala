package com.breezefsmparas.features.viewAllOrder.interf

import com.breezefsmparas.app.domain.NewOrderProductEntity
import com.breezefsmparas.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}