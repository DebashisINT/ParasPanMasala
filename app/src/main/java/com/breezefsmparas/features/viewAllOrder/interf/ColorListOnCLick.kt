package com.breezefsmparas.features.viewAllOrder.interf

import com.breezefsmparas.app.domain.NewOrderGenderEntity
import com.breezefsmparas.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}