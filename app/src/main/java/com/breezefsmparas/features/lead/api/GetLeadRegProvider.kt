package com.breezefsmparas.features.lead.api

import com.breezefsmparas.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmparas.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}