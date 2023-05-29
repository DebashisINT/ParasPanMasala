package com.breezefsmparaspanmasala.features.document.api

import com.breezefsmparaspanmasala.features.dymanicSection.api.DynamicApi
import com.breezefsmparaspanmasala.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}