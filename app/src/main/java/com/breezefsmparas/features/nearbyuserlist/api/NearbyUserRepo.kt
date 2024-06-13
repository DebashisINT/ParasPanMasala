package com.breezefsmparas.features.nearbyuserlist.api

import com.breezefsmparas.app.Pref
import com.breezefsmparas.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmparas.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmparas.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}