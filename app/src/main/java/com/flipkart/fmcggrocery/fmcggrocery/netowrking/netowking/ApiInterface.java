package com.flipkart.fmcggrocery.fmcggrocery.netowrking.netowking;

import com.flipkart.fmcggrocery.fmcggrocery.netowrking.netowking.response.OrderModel;
import com.flipkart.fmcggrocery.fmcggrocery.netowrking.netowking.response.ProductModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("dashboard/grocery/v1/search/{search_id}")
    Call<List<ProductModel>> getSearchResult(@Path("search_id") String searchId);

    @GET("dashboard/grocery/v1/get_cart/{user_id}")
    Call<List<ProductModel>> getUserCart(@Path("user_id") String userId);

    @POST("dashboard/grocery/v1/get_cart/{user_id}")
    Call<String> updateCart(@Path("user_id") String userId, @Body List<ProductModel> products);

    @POST("dashboard/grocery/v1/checkout/{user_id}")
    Call<OrderModel> checkout(@Path("user_id") String userId, @Body List<ProductModel> products);

}
