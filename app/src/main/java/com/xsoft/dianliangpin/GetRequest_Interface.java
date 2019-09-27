package com.xsoft.dianliangpin;

import com.xsoft.dianliangpin.beans.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface GetRequest_Interface {
    @GET("users/")
    Call<ResponseBody> getUserList();

    @GET("users/{id}")
    Call<ResponseBody> getUser(@Path("id") Long id);

    @POST("users/")
    Call<ResponseBody> addUser(@Body User user);

    @PUT("users/update/{id}")
    Call<ResponseBody> updateUser(@Path("id") Long id, @Body User user);

    @FormUrlEncoded
    @PUT("users/{id}")
    Call<ResponseBody> updateUserName(@Path("id") Long id, @Field("name") String name);

    @DELETE("users/{id}")
    Call<ResponseBody> deleteUser(@Path("id") Long id);
}
