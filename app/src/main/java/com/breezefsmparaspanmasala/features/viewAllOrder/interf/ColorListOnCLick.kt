package com.breezefsmparaspanmasala.features.viewAllOrder.interf

import com.breezefsmparaspanmasala.app.domain.NewOrderGenderEntity
import com.breezefsmparaspanmasala.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}