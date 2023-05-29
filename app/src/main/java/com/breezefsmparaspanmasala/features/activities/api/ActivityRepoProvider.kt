package com.breezefsmparaspanmasala.features.activities.api

import com.breezefsmparaspanmasala.features.member.api.TeamApi
import com.breezefsmparaspanmasala.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}