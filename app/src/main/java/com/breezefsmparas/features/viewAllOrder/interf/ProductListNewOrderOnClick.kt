package com.breezefsmparas.features.viewAllOrder.interf

import com.breezefsmparas.app.domain.NewOrderGenderEntity
import com.breezefsmparas.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}