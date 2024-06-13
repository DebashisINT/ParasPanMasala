package com.breezefsmparas.features.document.api

import com.breezefsmparas.features.dymanicSection.api.DynamicApi
import com.breezefsmparas.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}