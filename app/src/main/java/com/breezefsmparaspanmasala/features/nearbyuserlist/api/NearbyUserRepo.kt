package com.breezefsmparaspanmasala.features.nearbyuserlist.api

import com.breezefsmparaspanmasala.app.Pref
import com.breezefsmparaspanmasala.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmparaspanmasala.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmparaspanmasala.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}