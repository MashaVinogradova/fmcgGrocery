package com.flipkart.fmcggrocery.fmcggrocery.netowrking.netowking.response;

import com.google.gson.annotations.SerializedName;

public class ProductModel {

    private String title;

    @SerializedName("image_url")
    private String imageUrl;

    private int price;

    private String fsn;

    private String category;

    private int quantity;

    private String unit;
}
