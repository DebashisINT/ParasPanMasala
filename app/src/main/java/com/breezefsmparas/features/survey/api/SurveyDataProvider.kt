package com.breezefsmparas.features.survey.api

import com.breezefsmparas.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmparas.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}