package com.breezefsmparaspanmasala.features.lead.api

import com.breezefsmparaspanmasala.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmparaspanmasala.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}