package com.breezefsmparas.features.viewAllOrder.interf

import com.breezefsmparas.app.domain.NewOrderGenderEntity
import com.breezefsmparas.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}