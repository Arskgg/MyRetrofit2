package com.arskgg.retrofit2;

import com.arskgg.retrofit2.Model.Comment;
import com.arskgg.retrofit2.Model.Post;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

//    @GET("posts/{id}")
//    Call<List<Post>> getPosts(@Path("userId") int userId);

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") int userId);


    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") Integer[] userId, @Query("_sort") String sort);

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String,String> parameters);

    @GET("comments")
    Call<List<Comment>> getComments(@Query("postId")int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url); //Hardcode !!!
}
