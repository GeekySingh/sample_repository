package com.example.app.data.repository

import com.example.app.data.model.ItemData
import com.example.app.data.network.RetrofitClient
import com.example.app.data.service.ItemService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ItemRepository(private val itemService: ItemService ) {

    fun getItemList() : List<ItemData> {
//        RetrofitClient.provideItemService(RetrofitClient.provideClient()).getItemList().enqueue(object : Callback<List<ItemData>> {
//            override fun onFailure(call: Call<List<ItemData>>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onResponse(
//                call: Call<List<ItemData>>,
//                response: Response<List<ItemData>>
//            ) {
//                TODO("Not yet implemented")
//            }
//        })

        itemService.getItemList().enqueue(object : Callback<List<ItemData>> {
            override fun onFailure(call: Call<List<ItemData>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<List<ItemData>>,
                response: Response<List<ItemData>>
            ) {
                TODO("Not yet implemented")
            }

        })
    }

}