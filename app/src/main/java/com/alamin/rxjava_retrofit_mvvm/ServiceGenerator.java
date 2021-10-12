package com.alamin.rxjava_retrofit_mvvm;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit retrofit;
    public static Retrofit getRetrofitClient() {
        if (retrofit != null) {
            return retrofit;
        }
        retrofit =
                new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }

    private static RequestApi requestApi = getRetrofitClient().create(RequestApi.class);

    public static RequestApi getRequestApi(){
        return requestApi;
    }
}