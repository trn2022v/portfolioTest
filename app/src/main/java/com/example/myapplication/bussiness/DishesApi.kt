package com.example.myapplication.bussiness

import retrofit2.http.GET
import retrofit2.http.Query

interface DishesApi {
    @GET("v3/")
    fun getCategories(
        @Query("") apiId: String = "c7a508f2-a904-498a-8539-09d96785446e"
    )

}