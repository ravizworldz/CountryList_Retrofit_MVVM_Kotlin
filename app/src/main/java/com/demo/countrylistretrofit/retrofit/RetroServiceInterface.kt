package com.demo.countrylistretrofit.retrofit

import com.demo.countrylistretrofit.data.CountryModel
import retrofit2.Call
import retrofit2.http.GET

interface RetroServiceInterface {

    @GET("v2")
    fun getCountryList(): Call<List<CountryModel>>
}