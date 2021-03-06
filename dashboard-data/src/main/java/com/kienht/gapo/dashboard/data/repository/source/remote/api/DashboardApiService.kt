package com.kienht.gapo.dashboard.data.repository.source.remote.api

import com.kienht.gapo.dashboard.data.repository.source.remote.response.FetchNewsFeedResponse
import retrofit2.http.GET

/**
 * @author kienht
 */
internal interface DashboardApiService {

    companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/hantrungkien/Gapo-Dashboard-Demo/"
    }

    @GET("master/news_feed.json")
    suspend fun fetchNewsFeeds(): FetchNewsFeedResponse
}