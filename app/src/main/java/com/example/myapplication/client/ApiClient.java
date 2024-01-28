package com.example.retro.client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class  ApiClient {
    private static final String url="https://me-20-18-ga-01.inextrix.com/MEGA/api/";
    static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
