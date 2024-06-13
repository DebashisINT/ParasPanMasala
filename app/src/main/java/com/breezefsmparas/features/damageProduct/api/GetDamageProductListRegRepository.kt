package com.breezefsmparas.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefsmparas.app.FileUtils
import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.NewQuotation.model.*
import com.breezefsmparas.features.addshop.model.AddShopRequestData
import com.breezefsmparas.features.addshop.model.AddShopResponse
import com.breezefsmparas.features.damageProduct.model.DamageProductResponseModel
import com.breezefsmparas.features.damageProduct.model.delBreakageReq
import com.breezefsmparas.features.damageProduct.model.viewAllBreakageReq
import com.breezefsmparas.features.login.model.userconfig.UserConfigResponseModel
import com.breezefsmparas.features.myjobs.model.WIPImageSubmit
import com.breezefsmparas.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}