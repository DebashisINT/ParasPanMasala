package com.breezefsmparaspanmasala.features.newcollection.model

import com.breezefsmparaspanmasala.app.domain.CollectionDetailsEntity
import com.breezefsmparaspanmasala.base.BaseResponse
import com.breezefsmparaspanmasala.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}