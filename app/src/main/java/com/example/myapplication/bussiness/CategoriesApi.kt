package com.example.myapplication.bussiness

import retrofit2.http.GET
import retrofit2.http.Query

interface CategoriesApi {
    @GET("v3/")
    fun getCategories(
        @Query("") apiId: String = "058729bd-1402-4578-88de-265481fd7d54")

}