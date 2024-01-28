package com.example.retro.client;
import com.example.retro.ServiceListApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

        @GET("api.php?get_news")
        Call<ServiceListApiResponse> getServiceList();
//https://me-20-18-ga-01.inextrix.com/MEGA/api/api.php?get_news/


}
