package com.example.retroglide.retrofit;

import com.example.retroglide.model.Curator;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by dhiman_da on 6/20/2015.
 */
public interface CuratorApi {
    String API_URL = "http://freemusicarchive.org/api";
    String API_KEY = "60BLHNQCAOUFPIBZ";

    @GET("/get/curators.json")
    void getCurators(@Query("api_key") String key, Callback<Curator> callback);

}
