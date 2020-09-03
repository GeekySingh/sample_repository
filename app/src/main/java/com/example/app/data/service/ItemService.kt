package com.example.app.data.service

import com.example.app.data.model.ItemData
import retrofit2.Call
import retrofit2.http.GET

interface ItemService {

    @GET("/getItemList")
    fun getItemList() : Call<List<ItemData>>
}