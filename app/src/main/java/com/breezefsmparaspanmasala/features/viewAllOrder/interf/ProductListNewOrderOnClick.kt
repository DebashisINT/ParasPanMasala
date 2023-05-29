package com.breezefsmparaspanmasala.features.viewAllOrder.interf

import com.breezefsmparaspanmasala.app.domain.NewOrderGenderEntity
import com.breezefsmparaspanmasala.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}