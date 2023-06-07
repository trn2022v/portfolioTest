package com.example.myapplication.bussiness

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class ApiProvider {
    private val runMocky: Retrofit by lazy { initApi() }
    private fun initApi() =
        Retrofit.Builder()
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://run.mocky.io/")
            .build()

    fun provideCategoriesApi(): CategoriesApi = runMocky.create(CategoriesApi::class.java)
    fun provideDishesApi(): DishesApi = runMocky.create(DishesApi::class.java)
}