package com.example.podchikh;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiset {
    @GET("getCategory")
    Call<List<responsemodel>> getdata();
}
