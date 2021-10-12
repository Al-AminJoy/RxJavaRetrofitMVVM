package com.alamin.rxjava_retrofit_mvvm;


import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;

public interface RequestApi {

    @GET("todos/1")
    Flowable<ResponseBody> makeQuery();
}
