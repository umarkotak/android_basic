package com.example.umarramadhana.atp.pojo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AccountAPI {
    @POST("/atp/user/tambahuser.php")
    @FormUrlEncoded
    Call<Account> addAccount(@Field("name") String name, @Field("email") String email, @Field("noktp") String noktp,
                             @Field("address") String address, @Field("nohp") String nohp, @Field("username") String username,
                             @Field("password") String password);
}
