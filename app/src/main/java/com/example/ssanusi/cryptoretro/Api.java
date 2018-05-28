package com.example.ssanusi.cryptoretro;

import com.example.ssanusi.cryptoretro.Model.Data;
import com.example.ssanusi.cryptoretro.Model.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String Base_Url="https://api.myjson.com/bins/";
    @GET("pmoz6")
    Call<ResponseData> getData();
}