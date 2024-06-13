package com.breezefsmparas.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefsmparas.app.FileUtils
import com.breezefsmparas.app.Pref
import com.breezefsmparas.base.BaseResponse
import com.breezefsmparas.features.addshop.model.AddLogReqData
import com.breezefsmparas.features.addshop.model.AddShopRequestData
import com.breezefsmparas.features.addshop.model.AddShopResponse
import com.breezefsmparas.features.addshop.model.LogFileResponse
import com.breezefsmparas.features.addshop.model.UpdateAddrReq
import com.breezefsmparas.features.contacts.CallHisDtls
import com.breezefsmparas.features.contacts.CompanyReqData
import com.breezefsmparas.features.contacts.ContactMasterRes
import com.breezefsmparas.features.contacts.SourceMasterRes
import com.breezefsmparas.features.contacts.StageMasterRes
import com.breezefsmparas.features.contacts.StatusMasterRes
import com.breezefsmparas.features.contacts.TypeMasterRes
import com.breezefsmparas.features.dashboard.presentation.DashboardActivity
import com.breezefsmparas.features.login.model.WhatsappApiData
import com.breezefsmparas.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}